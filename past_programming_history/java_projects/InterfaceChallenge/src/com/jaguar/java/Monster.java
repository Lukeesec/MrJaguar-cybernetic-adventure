package com.jaguar.java;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable{

    private String type;
    private int hitPoints;
    private int strength;

    public Monster(String type, int hitPoints, int strength) {
        this.type = type;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,this.type);
        values.add(0,"" + this.hitPoints);
        values.add(0,"" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        if(saveValues != null && saveValues.size() > 0) {
            this.type = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "type='" + type + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

}
