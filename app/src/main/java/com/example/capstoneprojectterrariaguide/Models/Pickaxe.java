package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Pickaxe extends RealmObject {

    @PrimaryKey
    private int pickaxeId;
    private String name;
    private float damage;
    private String power;
    private String price;
    private String howToObtain;

    public Pickaxe() {
    }

    public Pickaxe(int pickaxeId, String name, float damage, String power, String price, String howToObtain) {
        this.pickaxeId = pickaxeId;
        this.name = name;
        this.damage = damage;
        this.power = power;
        this.price = price;
        this.howToObtain = howToObtain;
    }

    public int getPickaxeId() {
        return pickaxeId;
    }

    public void setPickaxeId(int pickaxeId) {
        this.pickaxeId = pickaxeId;
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
        return
                "<b>" + "Pickaxe ID: " + "</b>" + pickaxeId + "<br>" +
                "<b>" + "Damage: " + "</b>" +  damage + "<br>" +
                "<b>" + "Power: " + "</b>" +  power + "<br>" +
                "<b>" + "Price: " + "</b>" +  price + "<br>" +
                "<b>" + "How To Obtain: " + "</b>" +  howToObtain;
    }
}
