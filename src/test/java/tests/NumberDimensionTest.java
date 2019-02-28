package tests;

import com.javaclass.NumberDimension;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class NumberDimensionTest {
    @Test
    public void plusTest() {
        NumberDimension expected = new NumberDimension(30, "кг");
        NumberDimension a = new NumberDimension(10, "кг");
        NumberDimension b = new NumberDimension(20, "кг");
        NumberDimension result = a.plus(b);
        assertEquals(expected, result);
    }

    @Test
    public void minusTest() {
        NumberDimension expected = new NumberDimension(10, "кг");
        NumberDimension a = new NumberDimension(10, "кг");
        NumberDimension b = new NumberDimension(20, "кг");
        NumberDimension result = b.minus(a);
        assertEquals(expected, result);
    }
}
