package ProgrammingExercisesCAP8;

public class Ejercicio_8_27_ColumnSorting {
    public static void main(String[] args) {

        System.out.println("Enter a 3−by−3 matrix row by row:");
        double[][] matrix = Ejercicio_8_26_RowSorting.initializeMatrixDouble();

        /*
        double[][] matrix = {
                {0.15, 0.875, 0.375},
                {0.55, 0.005, 0.225},
                {0.30, 0.12, 0.4}};

         */

        //Print original
        System.out.println("Print original");
        Ejercicio_8_26_RowSorting.printTwoDimensionArrayDouble(matrix);
        System.out.println(" ");

        //Print sorted
        System.out.println("The column−sorted array is");
        Ejercicio_8_26_RowSorting.printTwoDimensionArrayDouble(sortColumns(matrix));

    }

    public static double[][] sortColumns(double[][] m) {
        double[][] sorted = new double[m.length][m.length];

        for (int i = 0; i < m.length; i++) {

            double[] toSort = new double[m.length];

            for (int j = 0; j < toSort.length; j++) {

                toSort[j] = m[j][i];
            }
            java.util.Arrays.sort(toSort);

            for (int j = 0; j < m[i].length; j++) {
                sorted[j][i] = toSort[j];
            }
        }

        return sorted;
    }
}
