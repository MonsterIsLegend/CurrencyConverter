package CurrencyConverter;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    public void shouldMultiplyTwoValues(){
        //given
        double a = 2.0;
        double b = 5.0;
        Calculator calculator = new Calculator();
        //when
        double result =  calculator.convert(a,b);
        //then
        assertEquals(10.0,result);
    }



}
