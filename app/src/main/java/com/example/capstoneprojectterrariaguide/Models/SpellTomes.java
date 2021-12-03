package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class SpellTomes extends RealmObject {

    @PrimaryKey
    private int spellTomeId;
    private String name;
    private float damage;
    private int manaUse;
    private String price;
    private String howToObtain;

    public SpellTomes(int spellTomeId, String name, float damage, int manaUse, String price, String howToObtain) {
        this.spellTomeId = spellTomeId;
        this.name = name;
        this.damage = damage;
        this.manaUse = manaUse;
        this.price = price;
        this.howToObtain = howToObtain;
    }

    public SpellTomes() {
    }

    public int getSpellTomeId() {
        return spellTomeId;
    }

    public void setSpellTomeId(int spellTomeId) {
        this.spellTomeId = spellTomeId;
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
        return  "\nName: " + name +
                "\nDamage: " + damage +
                "\nMana Use: " + manaUse +
                "\nPrice: " + price +
                "\nHow To Obtain: " + howToObtain;
    }
}
