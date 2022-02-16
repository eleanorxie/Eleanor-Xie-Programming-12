package com.eleanorxie.module1assignment.module1piont2;

public class TwoDShape {
    double width;
    double height;

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){
        this.width = 0;
        this.height = 0;
    }

    public double getArea() {
        double area = width * height;
        return area;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
