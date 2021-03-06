package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class YoYo extends RealmObject {

    @PrimaryKey
    private int yoyoId;
    private String name;
    private float damage;
    private String price;
    private String type;
    private String howToObtain;

    public YoYo(int yoyoId, String name, float damage, String price, String type, String howToObtain) {
        this.yoyoId = yoyoId;
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.type = type;
        this.howToObtain = howToObtain;
    }

    public YoYo() {
    }

    public int getYoyoId() {
        return yoyoId;
    }

    public void setYoyoId(int yoyoId) {
        this.yoyoId = yoyoId;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHowToObtain() {
        return howToObtain;
    }

    public void setHowToObtain(String howToObtain) {
        this.howToObtain = howToObtain;
    }

    @Override
    public String toString() {
        return  "<b>" + "Yo-Yo ID:  " + "</b>" + yoyoId + "<br>" +
                "<b>" + "Damage: " + "</b>" + damage + "<br>" +
                "<b>" + "Price: " + "</b>" + price + "<br>" +
                "<b>" + "Type: " + "</b>" + type + "<br>" +
                "<b>" + "How to Obtain: " + "</b>" + howToObtain;
    }
}
