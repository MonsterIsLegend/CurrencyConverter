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

public class xmlParser {

    private  Map<String, Double> currencyMap = new HashMap<>();

    public Map<String, Double> getCurrencyMap() {
        return currencyMap;
    }

    public void setCurrencyMap(Map<String, Double> currencyMap) {
        this.currencyMap = currencyMap;
    }

    /**
     * Method is used to parse the given XML file, to the easily acessable HashMap, containing currency names,
       linked with their convertion rate.
     */
    public void parseXmlFileToHashMap() {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new File("src/main/resources/currencies.xml"));

            document.getDocumentElement().normalize();

            NodeList currencies = document.getElementsByTagName("Cube");

            currencyMap = new HashMap<>();
            double rate = 0;
            for (int i = 0; i < currencies.getLength(); i++) {
                Node currency = currencies.item(i);

                if (currency.getNodeType() == Node.ELEMENT_NODE) {
                    Element currencyElement = (Element) currency;

                    String rateToParse = currencyElement.getAttribute("rate");
                    String currencyName = currencyElement.getAttribute("currency");
                    try {
                        rate = Double.parseDouble(rateToParse);
                    } catch (NumberFormatException n) {
                        continue;
                    }
                    currencyMap.put(currencyName, rate);
                }
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }

    /**
     * All methods, are design to take the currency rate from the Map, and convert it for a double value,
     used within convert method in the app.
     * @return Returns value of the currency converstion rate
     */

    public double getPLNRate( ){
        double plnRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("PLN") ){
                plnRate = set.getValue();
            }
        }
        return plnRate;
    }
    public double getJPYRate( ){
        double jpyRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("JPY") ){
                jpyRate = set.getValue();
            }
        }
        return jpyRate;
    }
    public double getGBPRate( ){
        double gbpRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("GBP") ){
                gbpRate = set.getValue();
            }
        }
        return gbpRate;
    }
    public double getCZKRate( ){
        double czkRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("CZK") ){
                czkRate = set.getValue();
            }
        }
        return czkRate;
    }public double getCADRate( ){
        double cadRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("CAD") ){
                cadRate = set.getValue();
            }
        }
        return cadRate;
    }
    public double getAUDRate( ){
        double audRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("AUD") ){
                audRate = set.getValue();
            }
        }
        return audRate;
    }
    public double getCNYRate( ){
        double cnyValue = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("CNY") ){
                cnyValue = set.getValue();
            }
        }
        return cnyValue;
    }
    public double getUSDRate( ){
        double usdRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("USD") ){
                usdRate = set.getValue();
            }
        }
        return usdRate;
    }
    public double getRUBRate( ){
        double rubRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("RUB") ){
                rubRate = set.getValue();
            }
        }
        return rubRate;
    }
    public double getNZDRate( ){
        double nzdRate = 0;
        for (Map.Entry<String, Double> set : currencyMap.entrySet()) {
            if( set.getKey().equals("NZD") ){
                nzdRate = set.getValue();
            }
        }
        return nzdRate;
    }




}
