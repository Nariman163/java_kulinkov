package gnm.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
        //Assertions.assertEquals(25.0,result);
        if(result!= 25.0) {
            throw new AssertionError(String.format("Expected %f, actual %f", 25.0, result));
        }
    }

    @Test
    void cantCreateSquare() {
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch(IllegalArgumentException exception) {
            System.out.println("Ошибка идентифицированна, сторона меньше 0");
        }
    }

    @Test
    void testEquality(){
        var s1 = new Square(5);
        var s2 = new Square(5);
        Assertions.assertEquals(s1,s2);
    }

    @Test
    void testNonEquality(){
        var s1 = new Square(4);
        var s2 = new Square(5);
        Assertions.assertEquals(s1,s2);
    }

    //Проверка объектов должна производиться через equals, тк == подходит только для примитивных типов
    @Test
    void testTest(){
        var s1 = new Square(5);
        var s2 = new Square(5);
        //Assertions.assertTrue(s1 == s2);
        Assertions.assertTrue(s1.equals(s2));
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void canCalculateTrianglePerimeter() {
        Assertions.assertEquals(16, Triangle.perimeter(6, 5, 5));
    }

    @Test
    void canCalculateTriangleArea() {
        Assertions.assertEquals(12, Triangle.area(6,5,5));
    }
}
