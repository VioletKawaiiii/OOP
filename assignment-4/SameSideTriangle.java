public class SameSideTriangle extends Triangle {
    public SameSideTriangle(String name, Double side, Double base) {
        super(name, side, side, base);
    }

    @Override
    public void calculateArea() {
        super.area = 0.5 * side1 * side2; 
    }

    @Override
    public void getInfo() {
        System.out.print("SameSideTriangle " + name + " info");
        System.out.print(" area: " + super.area);
        System.out.print(" with side: " + side1);
        System.out.print(" with base: " + side3);
        System.out.println();
    }
}
