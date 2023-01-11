package ProgrammingExercisesCAP7;

public class Ejercicio_7_7_CountSingleDigits {
    public static void main(String[] args) {

        /** Create random digits*/
        int[] array =  randomDigits();

        /** Print array with random digits */
        System.out.println("The digits are: ");
        displayRandomDigits(array);

        /**Count the ocurrences of each digit */
        int[] count = countDigits(array);

        /**Print the count */
        System.out.println(" ");
        System.out.println("The occurrences of each digit are: ");
        displayCount(count);


    }

    public static int[] randomDigits(){
        int randomDigits[] = new int[100];
        for (int i = 0;i < randomDigits.length;i++){
            randomDigits[i] = (int) (Math.random() * 10);
        }

        return randomDigits;
    }

    public static void displayRandomDigits(int[] randomDigit){

        for (int i = 0; i < randomDigit.length; i++){
            if((i + 1) % 10 == 0){
                System.out.println(randomDigit[i]);
            }
            else
                System.out.print(randomDigit[i] + " ");
        }
    }

    public static int[] countDigits(int[] array){
        int[] digits = new int[10];
        for (int i = 0; i<array.length; i++){
            digits[array[i]]++;
        }

        return digits;
    }

    public static void displayCount(int[] countDigits){
        for (int i = 0; i < countDigits.length; i++){
            if(countDigits[i] > 1){
                    System.out.println("| Occurrences: " + countDigits[i] + " Of the digit: " + i + "|");
            }
            else
                System.out.println("| Occurrence: " + countDigits[i] + " Of the digit: " + i + "|");


        }

    }


}
