package ProgrammingExercisesCAP6;

public class Ejercicio_6_3_Palindrome_integer {
    public static void main(String[] args) {
        System.out.println("656 is palindrome " + isPalindrome(657));
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    //Return the reversal of an integer, e.g., reverse(456) return 654
    public static int reverse(int number){
        String numberStr = number + "";
        int length = numberStr.length();
        int a = 0;

        for (int x = length-1; x>=0;x--){
            int z = (int)(Math.pow(10, x));
            int y = Integer.parseInt(String.valueOf(numberStr.charAt(x)));
            int w = y*z;
            a += w;
        }
        //System.out.println(a); imprime el numero de reversa
        return a;
    }




}
