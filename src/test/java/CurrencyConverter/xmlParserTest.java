package CurrencyConverter;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
public class xmlParserTest {

    @BeforeEach
    public static xmlParser ObjectOfClassBeeingTested(){
        xmlParser xmlParser = new xmlParser();
        xmlParser.parseXmlFileToHashMap();
        return xmlParser;
    }


    @Test
    public void shouldReturn4and5804WhenValueis1ForGetPLNValue(){
        //given
        double value = 1;
        xmlParser xmlParser = ObjectOfClassBeeingTested();
        //when
        double result = xmlParser.getPLNRate() * value;
        //then
        assertEquals(4.5804, result);
    }

    @Test
    public void shouldReturnExactValueRelatedToCurrencyWithNameSpecifiedInKey(){
        //given
        xmlParser xmlParser = ObjectOfClassBeeingTested();
        Map<String,Double> cloneOfTheMapInParserClass = xmlParser.getCurrencyMap();
        double valueFromMap = 0;

        double actualValue = 4.5804;
        //when
        for (Map.Entry<String, Double> set : cloneOfTheMapInParserClass.entrySet()) {
            if( set.getKey().equals("PLN") ){
                valueFromMap = set.getValue();
            }
        }
        //then
        assertEquals(actualValue,valueFromMap);
    }

}
