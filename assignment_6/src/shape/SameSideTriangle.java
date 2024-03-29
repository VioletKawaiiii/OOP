package shape;

public class SameSideTriangle extends Triangle {
    public SameSideTriangle(double side) {
        super(side, side, side);
    }

    
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
    
    public void getInfo(){
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
