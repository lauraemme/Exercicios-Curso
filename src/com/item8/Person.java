package com.item8;

public class Person {

    private String name;
    private float height;
    private float weight;

    public Person(String name, float height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

     public float calculateIMC (){
        float imc = this.weight / (this.height * this.height);
        return imc;
     }

    public String getName() {
        return name;
    }
}
