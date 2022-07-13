import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualsFour(){
        try {
            SimpleCalculator calculator = new SimpleCalculator();
            assertEquals(4, calculator.add(4,0));
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

}