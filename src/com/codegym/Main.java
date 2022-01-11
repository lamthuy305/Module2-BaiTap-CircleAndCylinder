package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10, "red");
        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());


        Cylinder cylinder = new Cylinder(10, 10, "red");
        System.out.println(cylinder);
        System.out.println("Thể tích: " + cylinder.getTheTich());


        Cylinder cylinder2 = new Cylinder(10);
        System.out.println("Thể tích: " + cylinder2.getTheTich());
    }
}