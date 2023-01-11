public class EJERCICIOSCAP8 {
    public static void main(String[] args) {

        //Ejercicio 8.2.1
        int ref = 7;
        int[][] array = new int[4][5];
        array[2][2] = ref;

        //Ejercicio 8.2.2
        int[][] z = {{1, 2}};
        int[][] m = {{1, 2}, {2, 3}};

        //Ejercicio 8.2.3 -----***** array[0].length *****-----

        int answer = array[0].length;
        System.out.println("Answer: " + answer);

        System.out.println(" ");

        //Ejercicio 8.2.4 Can the rows in a two-dimensional array have different lengths? Yes
        int[][] triangleArray = {
                {1,2,3,4,5},
                {2,3,4,5},
                {3,4,5},
                {4,5},
                {5}
        };

        int row1= triangleArray[0].length;
        int row2= triangleArray[1].length;
        int row3= triangleArray[2].length;
        int row4= triangleArray[3].length;
        int row5= triangleArray[4].length;

        System.out.println("Row 1 length: " + row1);
        System.out.println("Row 2 length: " + row2);
        System.out.println("Row 3 length: " + row3);
        System.out.println("Row 4 length: " + row4);
        System.out.println("Row 5 length: " + row5);

        System.out.println(" ");

        //Ejercicio 8.2.5

        int[][] array825 = new int[5][6];
        int[] x = {1, 2};
        array825[0] = x;
        System.out.println("array[0][1] is " + array825[0][0]);

        System.out.println(" ");


        int[][] array1 = new int[5][6];
        int[] y = {1, 2};
        array1[0] = y;
        System.out.println("array[0][1] is " + array1[0][1]);

        System.out.println(" ");

        //Ejercicio 8.3.1  -----***** PRINT IN REVERSE *****-----
        int[][] array831 = {
                {1,2},
                {3,4},
                {5,6}
        };

        for (int i = array831.length-1;i>= 0;i--) {
            for (int j = array831[i].length-1;j >=0;j--){
                System.out.print(array831[i][j] + " ");
                System.out.println();
            }
        }


        System.out.println(" ");

        //Ejercicio 8.3.2 -----***** SUM VALUES FISRT COLUMN *****-----
        int[][] array832 = {
                {1,2},
                {3,4},
                {5,6}
        };
        int sum1= 0;

        for (int i = 0; i < array832.length ; i++) {
            sum1+=array832[i][0];
        }
        System.out.println(sum1); // 1 + 3 + 5

        System.out.println(" ");


        //Ejercicio 8.4.1
        /*

         public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };

        System.out.println(java.util.Arrays.toString(m1(array)));


        }

        public static int[] m1(int[][] m){
            int[] result = new int[2];
            result[0] = m.length; //Rows length
            result[1] = m[0].length; //Columns length

         */

        //Ejercicio 8.5.1
        //Students`answers to the questions
        char[][] answers = {
                {'A','B','A','C','C','D','E','E','A','D'},
                {'D','B','A','B','C','A','E','E','A','D'},
                {'E','D','D','A','C','B','E','E','A','D'},
                {'C','B','A','E','D','C','E','E','A','D'},
                {'A','B','D','C','C','D','E','E','A','D'},
                {'B','B','E','C','C','D','E','E','A','D'},
                {'B','B','A','C','C','D','E','E','A','D'},
                {'E','B','E','C','C','D','E','E','A','D'}
        };

        //Key to the questions
        char[] keys = {'D','B','D','C','C','D','A','E','A','D'};

        //Grade all answers
        int[] max = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            //Grade one student
            int correctCount = 0;


            for (int j = 0; j < answers[i].length; j++) {
                if(answers[i][j] == keys[j]){
                    correctCount++;
                }

            }

            System.out.println("Student " + i + "'s correct count is " + correctCount);
            max[i] = correctCount;

        }

        int correctMax = max[0];
        int correctMaxIndex = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] > correctMax){
                correctMax = max[i];
                correctMaxIndex = i;
            }
        }

        System.out.println("The student " + correctMaxIndex + " has the highest count with " + correctMax);

        //Ejercicio 8.8.1
        int[][][] array881 = {
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}},
                {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}}
        };

        int length1 = array881.length; //Third dimension
        int length2 = array881[0].length; //Second dimention
        int length3 = array881[0][4].length; //First dimention

        System.out.println(length1 + ", " + length2 + ", " + length3);
        System.out.println(" ");

        //Ejercicio 8.8.2

        char[][][] ch = new char[12][5][2];

        System.out.println("How many elements are in the array? " + (ch.length * ch[2].length * ch[0][0].length));
        System.out.println("ch.length: " + ch.length);
        System.out.println("ch[2].length: " + ch[2].length);
        System.out.println("ch[0][0].length: " + ch[0][0].length);
        System.out.println(" ");

        //Ejercicio 8.8.3

        int[][][] array883 = {{{1, 2}, {3, 4}} , {{5, 6}, {7, 8}}};

        System.out.println(array883[0][0][0]);
        System.out.println(array883[1][1][1]);
        System.out.println(" ");



    }
}
