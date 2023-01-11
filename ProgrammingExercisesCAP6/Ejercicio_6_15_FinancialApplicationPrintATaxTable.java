package ProgrammingExercisesCAP6;

public class Ejercicio_6_15_FinancialApplicationPrintATaxTable {
    public static void main(String[] args) {

        computeTax(0,60000);
    }

    public static double computeTax(int status, double taxableIncome){
        double income = 0;
        double tax0 = 0;
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        System.out.println("Taxable    Single    Married Joint    Married    Head of");
        System.out.println("Income               or Qualifying    Separate   House hold");
        System.out.println("                     Widow(er)");

            for (income = 50000; income <= taxableIncome; income += 50) {


                    if (income <= 8350)
                        tax0 = income * 0.10;
                    else if (income <= 33950)
                        tax0 = 8350 * 0.10 + (income - 8350) * 0.15;
                    else if (income <= 82250)
                        tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                    else if (income <= 171550)
                        tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                    else if (income <= 372950)
                        tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                                (income - 171550) * 0.33;
                    else
                        tax0 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                                (372950 - 171550) * 0.33 + (income - 372950) * 0.35;


                    if (income <= 16700)
                        tax1 = income * 0.10;
                    else if (income <= 67900)
                        tax1 = 16700 * 0.10 + (income - 16700) * 0.15;
                    else if (income <= 137050)
                        tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
                    else if (income <= 208850)
                        tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                    else if (income <= 372950)
                        tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 + 137050) * 0.28 +
                                (income - 208850) * 0.33;
                    else tax1 = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) +
                                (372950 - 208850) * 0.33 + (income - 372950);


                    if (income <= 8350)
                        tax2 = income * 0.10;
                    else if (income <= 33950)
                        tax2 = 8350 * 0.10 + (income - 8350) * 0.15;
                    else if (income <= 68525)
                        tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                    else if (income <= 104425)
                        tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
                    else if (income <= 186475)
                        tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                                (income - 186475) * 0.33;
                    else tax2 = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                                (185475 - 104425) * 0.33 + (income - 186476);



                    if (income <= 11950)
                        tax3 = income * 0.10;
                    else if (income <= 45500)
                        tax3 = 11950 * 0.10 + (income - 11950) * 0.15;
                    else if (income <= 117450)
                        tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
                    else if (income <= 190200)
                        tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
                    else if (income <= 372950)
                        tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                                (income - 190200) * 0.33;
                    else
                        tax3 = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                                (372950 - 190200) * 0.33 + (income - 372950);

                long t0 = Math.round(tax0);
                long t1 = Math.round(tax1);
                long t2 = Math.round(tax2);
                long t3 = Math.round(tax3);

                System.out.printf("%d       %d         %d         %d      %d\n", (int) (income), t0, t1, t2, t3);
            }

        return 0;
    }
}
