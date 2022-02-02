package CurrencyConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    /**
     * App is running in a loop, it has several options of currencies to choose from.
     * Rest of the currencies were not added to keep the clarity of a program without a proper GUI.
     * You control the app, by inputing certain keys related to the functions.
     * App is protected against wrong inputs
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        xmlParser xmlParser = new xmlParser();
        xmlParser.parseXmlFileToHashMap();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        do {
            System.out.println("KONWERTER WALUTOWY DLA EURO");
            System.out.println("Wpisz 1 aby przekonwertować do PLN");
            System.out.println("Wpisz 2 aby przekonwertować do JPY");
            System.out.println("Wpisz 3 aby przekonwertować do GBP");
            System.out.println("Wpisz 4 aby przekonwertować do USD");
            System.out.println("Wpisz 5 aby przekonwertować do CZK");
            System.out.println("Wpisz 6 aby przekonwertować do CAD");
            System.out.println("Wpisz 7 aby przekonwertować do AUD");
            System.out.println("Wpisz 8 aby przekonwertować do CNY");
            System.out.println("Wpisz 9 aby przekonwertować do RUB");
            System.out.println("Wpisz 0 aby przekonwertować do NZD");
            System.out.println("Wpisz -1 aby zakończyć działanie programu");

            int fistInput = 11;
            try {
                fistInput = scanner.nextInt();
            } catch (InputMismatchException z) {
                System.err.println("Wybierz jedną z dostępnych opcji");
                scanner.next();
            }
            switch (fistInput) {
                case 1 -> {
                    boolean run1 = true;
                   do {
                       double valueToConvert = 0;

                       System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do PLN");
                       try {
                           valueToConvert = scanner.nextDouble();
                       } catch (InputMismatchException z) {
                           System.err.println("Wpisz poprawną wartość w EURO");
                           scanner.next();
                       }
                       if (valueToConvert > 0){
                           double exchange = 0;
                           exchange = calculator.convert(valueToConvert, xmlParser.getPLNRate());
                           System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w PLN" );
                           System.out.println("");
                           run1 = false;
                       }else {
                           System.err.println("Wprowadzona wartość musi być większa od 0 ");
                       }
                   }while (run1);
                }
                case 2 -> {
                    boolean run2 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do JPY");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getJPYRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w JPY");
                            System.out.println("");
                            run2 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run2);
                }
                case 3 -> {
                    boolean run3 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do GBP");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getGBPRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w GBP");
                            System.out.println("");
                            run3 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run3);
                }
                case 4 -> {
                    boolean run4 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do USD");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getUSDRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w USD");
                            System.out.println("");
                            run4 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run4);
                }
                case 5 -> {
                    boolean run5 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do CZK");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getCZKRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w CZK");
                            System.out.println("");
                            run5 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run5);
                }
                case 6 -> {
                    boolean run6 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getCADRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + " wynosi " + exchange + " w CAD");
                            System.out.println("");
                            run6 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run6);
                }
                case 7 -> {
                    boolean run7 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do AUD");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getAUDRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w AUD");
                            System.out.println("");
                            run7 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run7);
                }
                case 8 -> {
                    boolean run8 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do CNY");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getCNYRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w RUB");
                            System.out.println("");
                            run8 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run8);
                }
                case 9 -> {
                    boolean run9 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do RUB");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getRUBRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w RUB");
                            System.out.println("");
                            run9 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run9);
                }
                case 0 -> {
                    boolean run0 = true;
                    do {
                        double valueToConvert = 0;

                        System.out.println("Podaj wartość w EURO, którą chcesz przekonwertować do NZD");
                        try {
                            valueToConvert = scanner.nextDouble();
                        } catch (InputMismatchException z) {
                            System.err.println("Wpisz poprawną wartość w EURO");
                            scanner.next();
                        }
                        if (valueToConvert > 0){
                            double exchange = 0;
                            exchange = calculator.convert(valueToConvert, xmlParser.getNZDRate());
                            System.out.println("Wartość " + valueToConvert + " EURO " + "wynosi " + exchange + " w NZD");
                            System.out.println("");
                            run0 = false;
                        }else {
                            System.err.println("Wprowadzona wartość musi być większa od 0 ");
                        }
                    }while (run0);
                }
                case -1 -> {
                    run = false;
                }
                default -> {
                        System.err.println("Wybierz poprawną opcje z poziomu menu");
                }
            }

        }while (run);
    }

}
