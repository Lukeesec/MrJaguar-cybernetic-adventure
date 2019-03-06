package com.jaguar.java;

import java.awt.*;

public class Trail extends GameObject {

    private float alpha = 1;
    private Handler handler;
    private Color Color;

    private int width, height;
    private float life;

    //life can be a value between 0.001 - 0.1

    public Trail(int x, int y, ID id, Color color, Handler handler, int width, int height, float life) {
        super(x, y, id);
        this.width = width;
        this.height = height;
        this.life = life;
        this.handler = handler;
    }

    @Override
    public void tick() {
        if (alpha > life) {
            alpha -= (life - 0.0001f);
        } else {
            handler.removeObject(this);
        }

    }

    @Override
    public void render(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setComposite(makeTransparent(alpha));

        g.setColor(Color);
        g.fillRect(x, y, width, height);

        g2d.setComposite(makeTransparent(1));
    }

    private AlphaComposite makeTransparent(float alpha) {
        int type = AlphaComposite.SRC_OVER;
        return (AlphaComposite.getInstance(type, alpha));
    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}
