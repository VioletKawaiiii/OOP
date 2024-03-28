package shape;

public class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height, Math.sqrt(base * base + height * height));
    }

    public double area() {
        return 0.5 * side1 * side2;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }

}
