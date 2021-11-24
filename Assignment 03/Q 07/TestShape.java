abstract class Shape {
    public String color;

    protected Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    abstract double perimeter();

}

class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length){
        Rectangle rectangle = new Square(length);
    }

    @Override
    double perimeter() {
        return 2*(length+width);
    }
}

class Square extends Rectangle{
    public Square(double length){
        super(length,length);
    }
}

class Circle extends Shape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double perimeter() {
        double pi = 3.14;
        return 2*pi*radius;
    }
}

public class TestShape{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.3,2.7);
        Rectangle square = new Square(3.6);
        Circle circle = new Circle(3.5);
        System.out.println("Perimeter of a Rectangle : "+rectangle.perimeter());
        System.out.println("Perimeter of a Square : "+square.perimeter());
        System.out.println("Perimeter of a Circle : "+circle.perimeter());
    }
}
