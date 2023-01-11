package ProgrammingExercisesCAP10;

public class Ejercicio_10_8_FinancialTheTaxClass {
    public static void main(String[] args) {
        Tax tax = new Tax();

        String[] statusNames = {
                "Single filers",
                "Married filing jointly or qualified widow(er)",
                "Married filing separately",
                "Head of household"};

        System.out.print("----------------  2001  ----------------\n");
        for (int i = 50000; i <= 60000; i += 1000) {  /** 52000 DUMMY VALUE*/
            tax.setTaxableIncome(i);
            System.out.printf("For a income $%.2f\n", tax.getTaxableIncome());

            for (int j = 0; j <= 3; j++) {
                tax.setFilingStatus(j);
                System.out.printf("Tax for %s is $%.2f\n", statusNames[j], tax.getTax());
            }

            System.out.println(" ");
        }


        System.out.print("----------------  2009  ----------------\n");
        double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] brackets = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 546250, 83250, 148675},
                {36250, 93650, 151650, 297350}};

        Tax tax2009 = new Tax();
        tax2009.setBrackets(brackets);
        tax2009.setRates(rates);

        for (int i = 50000; i <= 60000; i += 1000) {  /** 52000 DUMMY VALUE*/
            tax2009.setTaxableIncome(i);
            System.out.printf("For a income $%.2f\n", tax2009.getTaxableIncome());

            for (int j = 0; j <= 3; j++) {
                tax.setFilingStatus(j);
                System.out.printf("Tax for %s is $%.2f\n", statusNames[j], tax2009.getTax());
            }

            System.out.println(" ");
        }

    }
}

class Tax {

    private int filingStatus;

    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    /**
     * int[][] brackets: Stores the tax brackets for each filing status.
     */

    private int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
    };

    /**
     * double[] rates: Stores the tax rates for each bracket.
     */

    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    /**
     * double taxableIncome: Stores the taxable income.
     */
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    /**
     * GETTERS AND SETTERS
     */

    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setFilingStatus(int filingStatus) {
        switch (filingStatus) {
            case 0:
                this.filingStatus = SINGLE_FILER;
                break;
            case 1:
                this.filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_WIDOWER;
                break;
            case 2:
                this.filingStatus = MARRIED_SEPARATELY;
                break;
            case 3:
                this.filingStatus = HEAD_OF_HOUSEHOLD;
                break;
        }
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;

        if (taxableIncome <= brackets[filingStatus][0]) {
            tax = taxableIncome * rates[0];
        } else if (taxableIncome <= brackets[filingStatus][1]) {
            tax = ((brackets[filingStatus][0] * rates[0])
                    + (taxableIncome - brackets[filingStatus][0]) * rates[1]);
        } else if (taxableIncome <= brackets[filingStatus][2]) {
            tax = ((brackets[filingStatus][0] * rates[0])
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (taxableIncome - brackets[filingStatus][1]) * rates[2]);
        } else if (taxableIncome <= brackets[filingStatus][3]) {
            tax = ((brackets[filingStatus][0] * rates[0])
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
                    + (taxableIncome - brackets[filingStatus][2]) * rates[3]);
        } else if (taxableIncome <= brackets[filingStatus][4]) {
            tax = ((brackets[filingStatus][0] * rates[0])
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
                    + (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]
                    + (taxableIncome - brackets[filingStatus][3]) * rates[4]);
        } else {
            tax = ((brackets[filingStatus][0] * rates[0])
                    + (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1]
                    + (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2]
                    + (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3]
                    + (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4]
                    + (taxableIncome - brackets[filingStatus][4]) * rates[5]);
        }

        return tax;
    }
}
