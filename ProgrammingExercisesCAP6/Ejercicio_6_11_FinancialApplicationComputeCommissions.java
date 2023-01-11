package ProgrammingExercisesCAP6;

public class Ejercicio_6_11_FinancialApplicationComputeCommissions {
    public static void main(String[] args) {
        computeCommission(10000);
    }

    public static int computeCommission (double salesAmount){
        System.out.println("Sales Amount    Commission");

        for (double b = salesAmount; b<=100000; b+=5000){

            double goal = b;
            int x = 0;
            double commissionRate1 = 0.08;
            double commissionRate2 = 0.10;
            double commissionRate3 = 0.12;

            double saleAmount1 = 0;
            double saleAmount2 = 0;
            double saleAmount3 = 0;

            if (goal > 1 && goal <= 5000 || goal > 5000)
                saleAmount1 = 5000 * commissionRate1;


            if (goal > 5001 && goal <= 10000 || goal > 10000)
                saleAmount2 = 5000 * commissionRate2;

            if (goal >= 10001)
                saleAmount3 = (goal - 10000) * commissionRate3;

            if (goal<10000)
                saleAmount3 = 0;

            double commission = saleAmount1 + saleAmount2 + saleAmount3;

            System.out.printf("%10d    %10.1f\n", (int)b, commission);



        }
        return 0;
    }
}
