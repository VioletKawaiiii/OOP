// Cube.java
package geometry;

import shape.Square;

public class Cube implements Geometry {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    
    public double baseArea() {
        return new Square(side).area();
    }

    public double volume() {
        return Math.pow(side, 3);
    }

}
