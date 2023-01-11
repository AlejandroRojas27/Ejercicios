package ProgrammingExercisesCAP8;

public class Ejercicio_8_22_EvenNumberOf1s {
    public static void main(String[] args) {

        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*2);
            }
        }

        //Print the matrix
        Ejercicio_8_18_ShuffleRows.printTwoDimensionArrayInt(matrix);

        //Check number of 1s in columns
        for (int i = 0; i < matrix[i].length-1; i++) {
            //check if is even
            if(isEven(checkColumn(matrix, i))){
                System.out.printf("Column %1d have a even number of 1's (%1d)\n",i,checkColumn(matrix, i));
            }

        }

        //Check number of 1s in rows
        for (int i = 0; i < matrix.length-1; i++) {
            //check if is even
            if(isEven(checkRow(matrix, i))){
                System.out.printf("Row %1d have a even number of 1's (%1d)\n",i,checkRow(matrix, i));
            }

        }

    }

    public static int checkColumn(int[][] m, int columnIndex){
        int sum = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                if(column == columnIndex){
                    sum += m[row][column];
                }
            }
        }

        return sum;
    }

    public static int checkRow(int[][] m, int rowIndex){
        int sum = 0;
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                if(row == rowIndex){
                    sum += m[row][column];
                }
            }
        }

        return sum;
    }

    public static boolean isEven(int sum){
        return sum % 2 == 0;
    }
}
