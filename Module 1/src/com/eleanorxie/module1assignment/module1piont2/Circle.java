package com.eleanorxie.module1assignment.module1piont2;
import java.lang.Math.*;

public class Circle extends TwoDShape{
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = PI * radius * radius;
        return area;
    }
}
