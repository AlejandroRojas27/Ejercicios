package ProgrammingExercisesCAP8;

public class Ejercicio_8_10_LargestRowAndColumn {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        //Print Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println(" ");
        }


        System.out.println("The largest row index: " + checkRow(matrix));
        System.out.println("The largest column index: " + checkColumn(matrix));

    }

    public static int checkRow(int[][] m) {
        int index = 0;
        int max = 0;

        for (int i = 0; i < m.length; i++) {
            int sum = 0;

            for (int j = 0; j < m[i].length; j++) {

                sum += m[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }

        }

        return index;
    }

    public static int checkColumn(int[][] m) {
        int index = 0;
        int max = 0;

        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m.length; j++) {

                sum += m[j][i];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }

        }

        return index;
    }
}
