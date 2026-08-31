package gnm.geometry.figures;

import java.util.Objects;

public final class Rectangle {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a < 0 || b < 0){
            throw  new IllegalArgumentException("Rectangle side should be non-negative");
        }
        this.a = a;
        this.b = b;
    }

    public double a() {
        return a;
    }

    public  double b() {
        return b;
    }

    public static void printRectangleArea(double a, double b) {
        String text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, rectangleArea(a,b));
        System.out.println(text);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(rectangle.a, this.a) == 0 && Double.compare(rectangle.b, this.b) == 0)
        ||(Double.compare(rectangle.a, this.b) == 0 && Double.compare(rectangle.b, this.a) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }
}
