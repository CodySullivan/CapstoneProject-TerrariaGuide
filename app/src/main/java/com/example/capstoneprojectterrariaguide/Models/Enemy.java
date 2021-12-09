package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Enemy extends RealmObject {

    @PrimaryKey
    private int enemyId;
    private String name;
    private float health;
    private float damage;
    private String type;
    private String location;
    private String drops;

    public Enemy(int enemyId, String name, float health, float damage, String type, String location, String drops) {
        this.enemyId = enemyId;
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.type = type;
        this.location = location;
        this.drops = drops;
    }

    public Enemy() {
    }

    public int getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(int enemyId) {
        this.enemyId = enemyId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "\nEnemy Id: " + enemyId +
                "\nHealth: " + health +
                "\nDamage: " + damage +
                "\nType: " + type +
                "\nLocation: " + location +
                "\nDrops: " + drops;
    }
}
