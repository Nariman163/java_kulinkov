package gnm.geometry;

import gnm.geometry.figures.Rectangle;
import gnm.geometry.figures.Square;
import gnm.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(5);//Указали класс функции и далее саму функцию(через точку)

        Rectangle.printRectangleArea(7,8);

        Triangle.printTriangleArea(5,5,5);
    }

}
