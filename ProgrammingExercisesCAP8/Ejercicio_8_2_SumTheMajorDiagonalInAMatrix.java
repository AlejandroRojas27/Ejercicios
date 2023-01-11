package ProgrammingExercisesCAP8;

public class Ejercicio_8_2_SumTheMajorDiagonalInAMatrix {
    public static void main(String[] args) {
        double[][] matrix ={{1,2,3,4.0},
                            {5, 6.5, 7, 8},
                            {9, 10, 11, 12},
                            {13,14,15,16}};

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;

        for (int row = 0; row < m.length; row++) {
            for( int column = 0; column < m[0].length; column++){
                if(row == column){
                    sum+= m[row][column];
                }
            }
        }

        return sum;
    }
}
