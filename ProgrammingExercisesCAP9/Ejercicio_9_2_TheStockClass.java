package ProgrammingExercisesCAP9;

import java.util.Scanner;

public class Ejercicio_9_2_TheStockClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The symbol is: ");
        String symbol = input.nextLine();
        System.out.println("The name is: ");
        String name = input.nextLine();

        System.out.println("The previous closing price is: ");
        double previous = input.nextDouble();

        System.out.println("The current price is: ");
        double current = input.nextDouble();

        Stock stock1 = new Stock(symbol, name);
        stock1.setPreviousClosingPrice(previous);
        stock1.setCurrentPrice(current);
        //stock1.currentPrice = 34.35; also work

        System.out.printf("\nThe price-change percentage is %c%3.2f ", '%' ,stock1.getChangePercent());


    }
}

class Stock{

    /**
     * A string data field named symbol for the stock’s symbol.
     */
    public String symbol;

    /**
     * A string data field named name for the stock’s name.
     */
    public String name;

    /**
     * A double data field named previousClosingPrice that stores the stock price for the previous day.
     */
    public double previousClosingPrice;

    /**
     * A double data field named currentPrice that stores the stock price for the current time.
     */
    public double currentPrice;

    /**
     * A constructor that creates a stock with the specified symbol and name.
     */
    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    /**
     * A method named getChangePercent() that returns the percentage changed from
     * previousClosingPrice to currentPrice.
     */

    public double getChangePercent() {
        return currentPrice * 100 / previousClosingPrice;
    }

    /**
     * Getters
     */
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Setters
     */
    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }


}
