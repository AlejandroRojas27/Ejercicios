package ProgrammingExercisesCAP8;

public class Ejercicio_8_16_SortTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {1, 1}, {4, 1}};

        sort(matrix);
    }

    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            double currentMin = m[i][0];
            int currentMinIndex = i;

            for (int j = i; j < m.length; j++) {
                if (currentMin > m[j][0] // primary sort on rows
                        || (currentMin == m[j][0] && m[currentMinIndex][1] > m[j][1])) // secondary sort on columns
                {
                    currentMin = m[j][0];
                    currentMinIndex = j;
                }

            }

            //Swap
            if (currentMinIndex != i) {
                int temp0 = m[currentMinIndex][0];
                int temp1 = m[currentMinIndex][1];
                m[currentMinIndex][0] = m[i][0];
                m[currentMinIndex][1] = m[i][1];
                m[i][0] = temp0;
                m[i][1] = temp1;


            }

        }

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i][0] + ", " + m[i][1]);
        }
    }

}
