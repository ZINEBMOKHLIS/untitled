import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatortest {
    private short expected;

    @Test
   void twoPlusTwoShouldEqualFour(){
    var calculator=new SimpleCalculator();
        int numberA;
        int numberB ;
        assertEquals(expected=4, calculator.add( numberA= 2,numberB= 2));
 }

}
