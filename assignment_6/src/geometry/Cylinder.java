package geometry;

import shape.Circle;

public class Cylinder implements Geometry {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double baseArea() {
        return new Circle(radius).area();
    }
    
    public double volume() {
        return new Circle(radius).area() * height;
    }

    public void getInfo() {
        System.out.println("Volume: " + volume());
        System.out.println("Base Area: " + baseArea());
    }

}
