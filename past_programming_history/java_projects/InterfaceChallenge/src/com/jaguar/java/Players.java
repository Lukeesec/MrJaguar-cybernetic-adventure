package com.jaguar.java;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISavable {

    private String name;
    private int hitPoints;
    private int speed;
    private String weapon;

    public Players(String name, int hitPoints, int speed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.speed = speed;
        this.weapon = "Dark Darth";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", speed=" + speed +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    /**
     * Converting to strings
     */
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.speed); //dunno if this will work exactly
        values.add(3, this.weapon); //will add more later
        return values;
    }

    /**
     * converting back to its original status
     */
    @Override
    public void read(List<String> saveValues) {
        if (saveValues != null && saveValues.size() > 0) {
            this.name = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.speed = Integer.parseInt(saveValues.get(2));
            this.weapon = saveValues.get(3);
        }
    }
}
