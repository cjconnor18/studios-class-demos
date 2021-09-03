package com.company.studios.studio1;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");

        Double radius = input.nextDouble();


// this is if do you remove static from the .getArea method in the Circle class
//        Circle blue = new Circle();
//        Double area = blue.getArea(radius);

        Double area = Circle.getArea(radius);

        System.out.println("The area of the circle is: " + area);

        input.close();
    }

}
