package Core_Java_Concepts.OOPS.Inheritance.Shapes.TwoD;

public class Ellipse {
    double radius1;
    double radius2;

    public Ellipse(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double area() {
        return Math.PI * radius1 * radius2;
    }

    public double perimeter() {
        return 2 * Math.PI * (radius1 + radius2);
    }

    public String Area() {
        return "Area of Ellipse: " + area();
    }

    public String Perimeter() {
        return "Perimeter of Ellipse: " + perimeter();
    }

    public String toString() {
        return "Ellipse: " + Area() + " " + Perimeter();
    }
}
