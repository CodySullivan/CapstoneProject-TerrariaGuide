package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Flail extends RealmObject {

    @PrimaryKey
    private int flailId;
    private String name;
    private float damage;
    private String price;
    private String type;
    private String howToObtain;

    public Flail(int flailId, String name, float damage, String price, String type, String howToObtain) {
        this.flailId = flailId;
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.type = type;
        this.howToObtain = howToObtain;
    }

    public Flail() {
    }

    public int getFlailId() {
        return flailId;
    }

    public void setFlailId(int flailId) {
        this.flailId = flailId;
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
        return  "<b>" + "Flail ID:  "+ "</b>" + flailId + "<br>" +
                "<b>" + "Damage: " + "</b>" +  damage + "<br>" +
                "<b>" + "Price: " + "</b>" +  price + "<br>" +
                "<b>" + "Type: " + "</b>" +  type + "<br>" +
                "<b>" + "How to Obtain: " + "</b>" +  howToObtain;
    }
}
