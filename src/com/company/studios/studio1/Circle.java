package com.company.studios.studio1;

public class Circle {
    // don't need line 5 or 6 unless you remove static from the method below.
    // it is a constructor, we will learn more about this later
    public Circle() {
    }

    // when making a method public and static, then the class can call the method
    // when you take out the static, then you have to create an object and then use that object to call the method
    public static Double getArea(Double radius){
        return Math.PI * radius * radius;
    };
}
