package ProgrammingExercisesCAP6;

public class Ejercicio_6_38_GenerateRandomCharacters {
    public static void main(String[] args) {
        randomCharacters(100);
        randomDigits(100);
    }

    public static void randomCharacters(int num){
        System.out.println("Print " + num + " uppercaseleters");
        int count =1;
        for (int x = 1;x<=num;x++, count++){
            char upperCaseLetters = RandomCharacter.getRandomUpperCaseLetter();
            System.out.printf(" %1c" , upperCaseLetters);
            if (count % 50 == 0)
                System.out.println(" ");
        }
    }

    public static void randomDigits(int num){
        System.out.println("Print " + num + " digits");
        int count =1;
        for (int x = 1;x<=num;x++, count++){
            char upperCaseLetters = RandomCharacter.getRandomDigitCharapter();
            System.out.printf(" %1c" , upperCaseLetters);
            if (count % 50 == 0)
                System.out.println(" ");
        }
    }
}
