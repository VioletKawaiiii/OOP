package assignment_2;

// Muhammad Fikry Haikal
// 20220040180
// TI22I

public class Square {
    private double width;
    private double height;

    public Square(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getLuas(){
        return width * height;
    }

    public double getPerimeter(){
        return 4 * width;
    }

    public static void main(String[] args) {
        Square square = new Square(0,0 );

        square.setWidth(4);
        square.setHeight(5);

        System.out.println("The area of the square is: " + square.getLuas());
        System.out.println("The perimeter of the square is: " + square.getPerimeter());

    }
}
