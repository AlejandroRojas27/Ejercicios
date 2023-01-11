package ProgrammingExercisesCAP7;

public class Ejercicio_7_22_FindTheNumberOfUppercaseLettersInAStringMAIN {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0;i < args[0].length();i++){

            for (int j ='A';j<='Z';j++){
                char ch = (char) j;
                if(args[0].charAt(i) == ch)
                    count++;

            }
        }

        System.out.println("The number of uppercase letters in the string is: " + count);
    }
}
