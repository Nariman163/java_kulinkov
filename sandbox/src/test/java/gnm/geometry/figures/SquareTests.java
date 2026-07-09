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
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
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
    void canCalculateTrianglePerimeter() {
        Assertions.assertEquals(16, Triangle.perimeter(6, 5, 5));
    }

    @Test
    void canCalculateTriangleArea() {
        Assertions.assertEquals(12, Triangle.area(6,5,5));
    }
}
