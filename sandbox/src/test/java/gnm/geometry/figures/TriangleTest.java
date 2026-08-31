package gnm.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void canNotCreateTriangle() {
        try {
            new Triangle(-5,3,5);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());// Для того, чтобы видеть сообщение в терминале
        }
        }


    @Test
    void testEquality() {
        var side1 = new Triangle(3,4,5);
        var side2 = new Triangle(5,4,3);
        Assertions.assertEquals(side1,side2);
    }
}

