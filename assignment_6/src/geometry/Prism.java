package geometry;

import shape.Rectangle;

public class Prism implements Geometry {
    private double length;
    private double width;
    private double height;

    public Prism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public double volume() {
        return new Rectangle(length, width).area() * height;
    }
    
    public double baseArea() {
        return new Rectangle(length, width).area();
    }

    public void getInfo(){
        System.out.println("Volume: " + volume());
        System.out.println("Base Area: " + baseArea());
    }
}
