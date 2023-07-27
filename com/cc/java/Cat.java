package com.cc.java;

public class Cat {
    
    // Felder (fields) / Attribute (attributes) / Eigenschaften (property)
    
    public String firstName;
    public String furColor;
    public int age;

   

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;
    }

    public String tellYourName() {
        return this.firstName;
        
    }

    public void changeName(String firstName) {
        this.firstName = firstName;
        
    }
    
}