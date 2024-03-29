public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        setName(name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        calculatePerimeter();
        calculateArea();
    }

    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    public void calculateArea() {
        double s = perimeter / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static class RightTriangle extends Triangle {
        public RightTriangle(String name, double base, double height) {
            super(name, base, height, Math.sqrt(base*base + height*height));
        }
    }

    public static class EquilateralTriangle extends Triangle {
        public EquilateralTriangle(String name, double side) {
            super(name, side, side, side);
        }
    }

    public static class IsoscelesTriangle extends Triangle {
        public IsoscelesTriangle(String name, double base, double equalSide) {
            super(name, base, equalSide, equalSide);
        }
    }

    public static class AnyTriangle extends Triangle {
        public AnyTriangle(String name, double side1, double side2, double side3) {
            super(name, side1, side2, side3);
        }
    }
}
