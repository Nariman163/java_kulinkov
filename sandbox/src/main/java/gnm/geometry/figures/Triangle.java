package gnm.geometry.figures;

import java.util.Objects;

public record Triangle(double a, double b, double c) {
    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной");
        }
    }
    public static void printTriangleArea(double a, double b , double c){

            String text = String.format("Площадь треугольника со сторонами %f, %f, %f = %f", a, b, c, area(a, b, c));
            System.out.println(text);

            String resultPerimeter = String.format("Периметр треугольника со сторонами %f, %f, %f = %f", a, b, c, perimeter(a, b, c));
            System.out.println(resultPerimeter);

    }

    public static double area(double a, double b, double c){
        double p = perimeter(a, b, c) / 2;
        return Math.sqrt(p*(p-a) * (p-b) * (p-c));
    }

    public static double perimeter(double a, double b, double c){
        return a + b + c;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(triangle.a, this.a) == 0 && Double.compare(triangle.b, this.b) == 0 && Double.compare(triangle.c, this.c) == 0)
                || (Double.compare(triangle.a, this.b) == 0 && Double.compare(triangle.b, this.a) == 0 && Double.compare(triangle.c, this.c) == 0)
                || (Double.compare(triangle.a, this.c) == 0 && Double.compare(triangle.b, this.a) == 0 && Double.compare(triangle.c, this.b) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
