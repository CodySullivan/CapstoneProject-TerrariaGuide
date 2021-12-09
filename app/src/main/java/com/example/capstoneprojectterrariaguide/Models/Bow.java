package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Bow extends RealmObject {

    @PrimaryKey
    private int bowId;
    private String name;
    private float damage;
    private String ammo;
    private String price;
    private String type;
    private String howToObtain;

    public Bow(int bowId, String name, float damage, String ammo, String price, String type, String howToObtain) {
        this.bowId = bowId;
        this.name = name;
        this.damage = damage;
        this.ammo = ammo;
        this.price = price;
        this.type = type;
        this.howToObtain = howToObtain;
    }

    public Bow() {
    }

    public int getBowId() {
        return bowId;
    }

    public void setBowId(int bowId) {
        this.bowId = bowId;
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

    public String getAmmo() {
        return ammo;
    }

    public void setAmmo(String ammo) {
        this.ammo = ammo;
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
        return  "<b>" + "Bow Id: " + "</b>" + bowId + "<br>" +
                "<b>" + "Damage: " + "</b>" + damage + "<br>" +
                "<b>" + "Ammo: " + "</b>" + ammo + "<br>" +
                "<b>" + "Price: " + "</b>" + price + "<br>" +
                "<b>" + "Type: " + "</b>" + type + "<br>" +
                "<b>" + "How To Obtain: " + "</b>" + howToObtain;
    }
}
