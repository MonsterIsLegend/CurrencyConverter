package CurrencyConverter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Calculator {

    /**
     * Method is used to convert currencies within app.
     * @param value is the ammount we want to convert to a different currency.
     * @param currencyRate is the currency rate in which we are converting
     * @return returns the value after conversion
     */
    public double convert(double value, double currencyRate) {
        double result;
        return result = value * currencyRate;
    }


}