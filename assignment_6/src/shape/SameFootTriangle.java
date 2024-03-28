package shape;

public class SameFootTriangle extends Triangle {
    public SameFootTriangle(double base, double side) {
        super(base, side, side);
    }

    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
    
}
