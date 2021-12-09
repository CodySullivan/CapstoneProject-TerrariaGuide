package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Axe extends RealmObject {

    @PrimaryKey
    private int axeId;
    private String name;
    private float damage;
    private String power;
    private String price;
    private String howToObtain;

    public Axe() {
    }

    public Axe(int axeId, String name, float damage, String power, String price, String howToObtain) {
        this.axeId = axeId;
        this.name = name;
        this.damage = damage;
        this.power = power;
        this.price = price;
        this.howToObtain = howToObtain;
    }

    public int getAxeId() {
        return axeId;
    }

    public void setAxeId(int axeId) {
        this.axeId = axeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHowToObtain() {
        return howToObtain;
    }

    public void setHowToObtain(String howToObtain) {
        this.howToObtain = howToObtain;
    }

    @Override
    public String toString() {
        return  "<b>" + "Axe ID: "+ "</b>" + axeId + "<br>" +
                "<b>" + "Damage: " + "</b>" +  damage + "<br>" +
                "<b>" + "Power: " + "</b>" +  power + "<br>" +
                "<b>" + "Price: " + "</b>" +  price + "<br>" +
                "<b>" + "How To Obtain: " + "</b>" +  howToObtain;
    }
}