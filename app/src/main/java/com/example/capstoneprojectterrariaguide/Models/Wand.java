package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Wand extends RealmObject {

    @PrimaryKey
    private int wandId;
    private String name;
    private float damage;
    private int manaUse;
    private String price;
    private String howToObtain;

    public Wand(int wandId, String name, float damage, int manaUse, String price, String howToObtain) {
        this.wandId = wandId;
        this.name = name;
        this.damage = damage;
        this.manaUse = manaUse;
        this.price = price;
        this.howToObtain = howToObtain;
    }

    public Wand() {
    }

    public int getWantId() {
        return wandId;
    }

    public void setWantId(int wandId) {
        this.wandId = wandId;
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

    public int getManaUse() {
        return manaUse;
    }

    public void setManaUse(int manaUse) {
        this.manaUse = manaUse;
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
        return  "<b>" + "Wand ID: " + "</b>" + wandId + "<br>" +
                "<b>" + "Damage: " + "</b>" + damage + "<br>" +
                "<b>" + "Mana Use: " + "</b>" + manaUse + "<br>" +
                "<b>" + "Price: " + "</b>" + price + "<br>" +
                "<b>" + "How To Obtain: " + "</b>" + howToObtain;
    }
}
