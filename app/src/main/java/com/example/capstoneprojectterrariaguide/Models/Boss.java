package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Boss extends RealmObject {

    @PrimaryKey
    private int bossId;
    private String name;
    private float health;
    private float damage;
    private String location;
    private String drops;

    public Boss(int bossId, String name, float health, float damage, String location, String drops) {
        this.bossId = bossId;
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.location = location;
        this.drops = drops;
    }

    public Boss() {
    }

    public int getBossId() {
        return bossId;
    }

    public void setBossId(int bossId) {
        this.bossId = bossId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDrops() {
        return drops;
    }

    public void setDrops(String drops) {
        this.drops = drops;
    }

    @Override
    public String toString() {
        return
                "<b>" + "Boss ID: "+ "</b>" + bossId + "<br>" +
                "<b>" + "Health: " + "</b>" +  health + "<br>" +
                "<b>" + "Damage: " + "</b>" +  damage + "<br>" +
                "<b>" + "Location: " + "</b>" +  location + "<br>" +
                "<b>" + "Drops: " + "</b>" +  drops;
    }
}
