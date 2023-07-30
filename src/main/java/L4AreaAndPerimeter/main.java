package L4AreaAndPerimeter;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {

        Square square1 = new Square(5);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4, 6);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

    }

}
