package ProgrammingExercisesCAP6;

public class Ejercicio_6_12_DisplayCharacters {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
        int x = (int)ch1;
        int y = (int)ch2;
        int count = 1;

        for (int z = x;x<=y;x++,count++){
            char a = (char)x;
            System.out.printf("%2c" , a);

            if (count % numberPerLine == 0)
                System.out.println(" ");
        }


    }
}
