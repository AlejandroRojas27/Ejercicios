package ProgrammingExercisesCAP7;

public class Ejercicio_7_13_RandomNumberChooser {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = {4,8,95,93};
        /** Create random integers */


        for (int i = 1; i <= 45;i++) {
            int digit = getRandom(start, end, numbers);
            //System.out.println("digit: " + digit);

            if(i % 15 == 0){
                System.out.printf("%4d\n" , digit);
            }
            else
                System.out.printf("%4d" , digit);



        }
    }

    public static int getRandom(int start, int end, int... numbers){
        int randomDigit = 0;
        randomDigit = (int) (start + Math.random() * (end-1));

        for (int i = 0; i < numbers.length;i++){
            if(randomDigit == numbers[i]){
                int x = 0;
                for (int j = randomDigit; randomDigit != numbers[i];randomDigit = (int) (start + Math.random() * (end-1))){
                    x = randomDigit;
                }
                randomDigit = x;
            }
        }

        return randomDigit;
    }

}
