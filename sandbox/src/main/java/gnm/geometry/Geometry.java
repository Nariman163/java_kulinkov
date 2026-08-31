package gnm.geometry;

import gnm.geometry.figures.Rectangle;
import gnm.geometry.figures.Square;
import gnm.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square((7.0)));//Указали класс функции и далее саму функцию(через точку)
        Square.printSquareArea(new Square((5.0)));

        Rectangle.printRectangleArea(7,8);

        Triangle.printTriangleArea(-5,5,5);
    }

}
