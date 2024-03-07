// Muhammad Fikry Haikal - 20220040180
// TI22I
// OOP

public class App {
    public static void main(String[] args) throws Exception {
        // Circle
        Circle circleABC = new Circle("Circle ABC", 7.0);
        circleABC.getInfo();

        // Rectangle
        Rectangle rectangle = new Rectangle("Rectangle", 7.5, 4.5);
        rectangle.getInfo();

        // Triangle
        Triangle rightTriangle = new Triangle.RightTriangle("Right Triangle", 10, 4);
        Triangle equilateralTriangle = new Triangle.EquilateralTriangle("Equilateral Triangle", 3);
        Triangle isoscelesTriangle = new Triangle.IsoscelesTriangle("Isosceles Triangle", 4, 6);
        Triangle anyTriangle = new Triangle.AnyTriangle("Any Triangle", 4, 3, 2);
        
        rightTriangle.getInfo();
        equilateralTriangle.getInfo();
        isoscelesTriangle.getInfo();
        anyTriangle.getInfo();
    }
}
