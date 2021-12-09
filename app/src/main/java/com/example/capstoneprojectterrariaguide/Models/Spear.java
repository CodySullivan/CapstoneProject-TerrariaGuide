package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Spear extends RealmObject {


    @PrimaryKey
    private int spearId;
    private String name;
    private float damage;
    private String price;
    private String type;
    private String howToObtain;

    public Spear(int spearId, String name, float damage, String price, String type, String howToObtain) {
        this.spearId = spearId;
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.type = type;
        this.howToObtain = howToObtain;
    }

    public Spear() {
    }

    public int getSpearId() {
        return spearId;
    }

    public void setSpearId(int spearId) {
        this.spearId = spearId;
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
        return  "\nSpear ID:  " + spearId +
                "\nDamage: " + damage +
                "\nPrice: " + price +
                "\nType: " + type +
                "\nHow to Obtain: " + howToObtain;
    }
}
