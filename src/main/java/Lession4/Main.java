package Lession4;

public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(5);
        System.out.println("The Area of square is: " + square1.getArea());
        System.out.println("The Perimeter of square is: " + square1.getPerimeter());


        Triangle triangle1 = new Triangle(3, 4, 5);
        System.out.println("The Area of triangle is: " + triangle1.getArea());
        System.out.println("The Perimeter of triangle is: " + triangle1.getPerimeter());

        Circle circle1=new Circle(6);
        System.out.println("The Area of Circle is: " + circle1.getArea());
        System.out.println("The Perimeter of Circle is: " + circle1.getPerimeter());

        Rectangle rectangle1=new Rectangle(6,7);
        System.out.println("The Area of Rectangle is: " + rectangle1.getArea());
        System.out.println("The Perimeter of Rectangle is: " + rectangle1.getPerimeter());
    }
}
