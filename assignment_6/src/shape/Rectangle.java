package shape;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public void getInfo(){
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

}
