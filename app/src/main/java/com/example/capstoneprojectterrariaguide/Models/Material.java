package com.example.capstoneprojectterrariaguide.Models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Material extends RealmObject {

    @PrimaryKey
    private int materialId;
    private String name;
    private String howToObtain;
    private String price;
    private String usedFor;

    public Material(int materialId, String name, String howToObtain, String price, String usedFor) {
        this.materialId = materialId;
        this.name = name;
        this.howToObtain = howToObtain;
        this.price = price;
        this.usedFor = usedFor;
    }

    public Material() {
    }


    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHowToObtain() {
        return howToObtain;
    }

    public void setHowToObtain(String howToObtain) {
        this.howToObtain = howToObtain;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    @Override
    public String toString() {
        return  "<b>" + "Material Id: " + "</b>" + materialId + "<br>" +
                "<b>" + "How To Obtain: " + "</b>" + howToObtain + "<br>" +
                "<b>" + "Price: " + "</b>" + price + "<br>" +
                "<b>" + "Used For: " + "</b>" + usedFor;
    }
}
