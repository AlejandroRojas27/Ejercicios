package ProgrammingExercisesCAP8;

public class Ejercicio_8_18_ShuffleRows {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        System.out.println("Before: ");
        printTwoDimensionArrayInt(m);

        System.out.println("After: ");
        shuffle(m);

    }

    public static void shuffle (int[][] m){
        int[] index = new int[m.length];

        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }


        for (int i = 0; i < index.length-1; i++) {
            int j = (int) (Math.random() * index.length);
            int temp = index[i];
            index[i] = index[j];
            index[j] = temp;
        }


        int[][] shuffled = new int[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            shuffled[i][0] = m[index[i]][0];
            shuffled[i][1] = m[index[i]][1];
        }

        printTwoDimensionArrayInt(shuffled);

    }

    public static void printTwoDimensionArrayInt(int[][] m){

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
