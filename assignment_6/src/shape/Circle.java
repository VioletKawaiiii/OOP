package shape;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void getInfo(){
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
