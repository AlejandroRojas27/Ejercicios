package ProgrammingExercisesCAP10;

public class Ejercicio_10_24_ImplementTheCharacterClass {
    public static void main(String[] args) {

        MyCharacter myCh = new MyCharacter('A');
        MyCharacter myCh1 = new MyCharacter('A');
        MyCharacter myCh2 = new MyCharacter('9');

        int q = myCh.compareTo(new MyCharacter('B'));
        System.out.println("compareTo: " + q);

        System.out.println("equals: " + myCh.equals(myCh1));
        System.out.println(myCh1.charValue() + " isDigit: " + myCh1.isDigit());
        System.out.println(myCh2.charValue() + " isDigit: " + myCh2.isDigit());

        System.out.println(MyCharacter.isDigit('7'));
        System.out.println(MyCharacter.isLetter('r'));
        System.out.println(MyCharacter.isLowerCase('L'));
        System.out.println(MyCharacter.toUpperCase('r'));
        System.out.println(MyCharacter.toLowerCase('H'));
    }
}

class MyCharacter {
    private char ch;

    public MyCharacter(char x) {
        this.ch = x;
    }

    public char charValue() {
        return ch;
    }

    public int compareTo(MyCharacter x) {

        char ch1 = this.ch;
        char ch2 = x.charValue();
        int value1 = (int) ch1;
        int value2 = (int) ch2;

        if (value1 != value2) {
            return value1 - value2;
        } else {
            return 0;
        }


    }

    public boolean equals(MyCharacter x) {
        return this.ch == x.charValue();
    }

    public boolean isDigit() {
        return isDigit(this.ch);
    }

    public static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static boolean isLetter(char ch) {
        return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
    }

    public static boolean isLetterOrDigit(char ch) {
        return isDigit(ch) || isLetter(ch);
    }

    public static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static char toUpperCase(char ch) {
        if (isLowerCase(ch)) {
            return (char) (ch - 32);
        } else {
            return ch;
        }
    }

    public static char toLowerCase(char ch) {

        if (isUpperCase(ch)) {
            return (char) (ch + 32);
        } else {
            return ch;
        }

    }


}
