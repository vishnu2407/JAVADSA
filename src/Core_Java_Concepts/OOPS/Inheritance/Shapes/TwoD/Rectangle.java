package Core_Java_Concepts.OOPS.Inheritance.Shapes.TwoD;

import Core_Java_Concepts.OOPS.Inheritance.Shapes.Shape;

public class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double Area() {
        return length * breadth;
    }

    @Override
    public double Perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
    }


}
