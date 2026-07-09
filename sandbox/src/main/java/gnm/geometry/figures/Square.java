package gnm.geometry.figures;

public record Square(double a) {

    public Square {
        if (a < 0) {
            throw new IllegalArgumentException("Сторона должна быть положительной");
        }
    }

    public static void printSquareArea(Square s){
        String text = String.format("Площадь квадрата со стороной %f = %f", s.a,s.area());
        System.out.println(text);
    }

    public double area() {
        return this.a * this.a;
    }

    public  double perimeter() {
        return 4 * this.a;
    }
}
