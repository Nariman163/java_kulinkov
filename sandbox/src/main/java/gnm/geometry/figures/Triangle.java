package gnm.geometry.figures;

public class Triangle {
    public static void printTriangleArea(double a, double b , double c){
        String text = String.format("Площадь треугольника со сторонами %f, %f, %f = %f", a, b, c, area(a,b,c));
        System.out.println(text);

        String resultPerimeter = String.format("Периметр треугольника со сторонами %f, %f, %f = %f", a, b, c, perimeter(a,b,c));
        System.out.println(resultPerimeter);

    }

    public static double area(double a, double b, double c){
        double p = perimeter(a, b, c) / 2;
        return Math.sqrt(p*(p-a) * (p-b) * (p-c));
    }

    public static double perimeter(double a, double b, double c){
        return a + b + c;
    }
}
