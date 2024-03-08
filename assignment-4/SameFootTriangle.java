// SameFootTriangle class
public class SameFootTriangle extends Triangle {
    private Double height;

    public SameFootTriangle(String name, Double side1, Double side2, Double height) {
        super(name, side1, side2, Math.sqrt(side1 * side1 + side2 * side2)); // Assuming side3 is the hypotenuse
        this.height = height;
        calculateArea(); // Call calculateArea after height is initialized
    }

    @Override
    public void calculateArea() {
        if (height != null) {
            super.area = 0.5 * side1 * height; // Area for SameFootTriangle
        } else {
            System.out.println("Height is not initialized.");
        }
    }

    @Override
    public void getInfo() {
        System.out.print("SameFootTriangle " + name + " info");
        System.out.print(" area: " + super.area);
        System.out.print(" with sides: " + side1);
        System.out.print(", " + side2);
        System.out.print(" and height: " + height);
        System.out.println();
    }
}
