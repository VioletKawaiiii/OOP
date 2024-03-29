import geometry.*;
import shape.*;

public class App {
    public static void main(String[] args) {
        // Shape
        Circle A = new Circle(2) ;
        Rectangle B = new Rectangle(2, 8);
        RightTriangle C = new RightTriangle(5,20);
        SameFootTriangle D = new SameFootTriangle(6,10);
        SameSideTriangle E = new SameSideTriangle(5);

        A.getInfo();
        B.getInfo();
        C.getInfo();
        D.getInfo();
        E.getInfo();

        // Geometry
        Cube F = new Cube(7);
        Prism G = new Prism(2, 6, 2);
        Cylinder H = new Cylinder(2,4);
        Block I = new Block(2,3, 4);

        F.getInfo();
        G.getInfo();
        H.getInfo();
        I.getInfo();
    }
}
