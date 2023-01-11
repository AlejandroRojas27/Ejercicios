package ProgrammingExercisesCAP10;

import java.util.Arrays;

public class Ejercicio_10_23ImplementTheStringClass {
    public static void main(String[] args) {

        MyString2 string21 = new MyString2("Alex");
        System.out.println(string21.compare("AlExX"));

        MyString2 string22 = string21.substring(1);

        System.out.println(string22.getS());

        System.out.println(string22.toUpperCase().getS());

        System.out.println(Arrays.toString(string22.toChars()));

        System.out.println(MyString2.valueOf(false).getS());

        System.out.println(MyCharacter.isDigit('0'));

    }
}

class MyString2 {

    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public int compare(String s) {

        int minLength = Math.min(s.length(), this.s.length());

        for (int i = 0; i < minLength; i++) {

            int strchartAt1 = (int) this.s.charAt(i);
            int strchartAt2 = (int) s.charAt(i);

            if (strchartAt1 != strchartAt2) {
                return strchartAt1 - strchartAt2;
            }

        }

        if (this.s.length() != s.length()) {
            return this.s.length() - s.length();
        } else {
            return 0;
        }

    }

    public MyString2 substring(int begin) {

        String str = "";

        for (int i = begin, j = 0; i <= this.s.length() - 1; i++, j++) {
            str += this.s.charAt(i);
        }

        return new MyString2(str);


    }

    public MyString2 toUpperCase() {
        return new MyString2(this.s.toUpperCase());
    }

    public char[] toChars() {

        char[] ch = new char[this.s.length()];

        for (int i = 0; i < this.s.length(); i++) {
            ch[i] = this.s.charAt(i);
        }

        return ch;
    }

    public static MyString2 valueOf(boolean b) {

        if (b) {
            return new MyString2("true");
        } else {
            return new MyString2("false");
        }

    }


    public String getS() {
        return s;
    }
}
