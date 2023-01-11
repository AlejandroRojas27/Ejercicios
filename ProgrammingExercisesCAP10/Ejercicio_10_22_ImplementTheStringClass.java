package ProgrammingExercisesCAP10;

import java.util.Arrays;

public class Ejercicio_10_22_ImplementTheStringClass {
    public static void main(String[] args) {


        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'X'};

        MyString1 string1 = new MyString1(ch);
        System.out.println("getString(): " + string1.getString());
        System.out.println("string length: " + string1.length());
        System.out.println(string1.substring(1, 4).getString());
        System.out.println(string1.toLowerCase().getString());

        MyString1 string2 = new MyString1(ch1);
        System.out.println(string1.equals(string2));

        MyString1 string3 = MyString1.valueOf(271296);

        System.out.println(string3.getString());


    }
}

class MyString1 {

    private String string;

    private char[] ch;

    public MyString1(char[] chars) {
        this.string = String.valueOf(chars);
        this.ch = chars;
    }

    public char charAt(int index) {
        return ch[index];
    }

    public int length() {
        return ch.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] x = new char[end - begin + 1];

        for (int i = begin, j = 0; i <= end; i++, j++) {
            x[j] = ch[i];
        }

        return new MyString1(x);
    }

    public MyString1 toLowerCase() {
        char[] x = new char[length()];

        for (int i = 0; i < ch.length; i++) {
            x[i] = (char) (ch[i] + 32);
        }

        return new MyString1(x);
    }

    public boolean equals(MyString1 s) {

        MyString1 n = new MyString1(ch);
        boolean answer = false;

        int count = 0;

        if (n.length() == s.length()) {

            for (int i = 0; i < s.length(); i++) {
                if (n.charAt(i) == s.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count == s.length()) {
                answer = true;
            }

        }

        return answer;
    }


    public static MyString1 valueOf(int i) {

        int x = 0;
        int z = 1;
        int y = 0;

        int w = i;

        int count = 0;
        while (count < 1) {

            z = i % 10;
            x = i / 10;

            i = x;


            if (z == 0) {
                count++;
            } else {
                y++;
            }

        }


        char[] ch = new char[y];

        z = 1;
        x = 0;

        for (int j = 0; j < ch.length; j++) {

            z = w % 10;
            x = w / 10;

            w = x;
            ch[j] = (char) (z + '0');

        }

        char[] chRev = new char[ch.length];

        for (int j = ch.length - 1, a = 0; j >= 0; j--, a++) {
            chRev[a] = ch[j];
        }

        return new MyString1(chRev);
    }


    public String getString() {
        return string;
    }

}


