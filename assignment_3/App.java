public class App {
    public static void main(String[] args) throws Exception {
        Circle circleABC = new Circle("Circle ABC", 7.0);
        Rectangle rectangle = new Rectangle("Rectangle", 7.5, 4.5);
        
        circleABC.getInfo();
        rectangle.getInfo();
    }
}
