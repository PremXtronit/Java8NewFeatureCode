package designpattern.solid;


interface Shape {
    public abstract double area();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}

class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class AreaCalculator {
    public static double calculateTotalArea(Shape shapes) {
        return shapes.area();
    }
}

public class OCP {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4, 3);
        System.out.println(r1.area());

        Square s1 = new Square(4);
        System.out.println(s1.area());

        AreaCalculator.calculateTotalArea(r1);

    }
}



