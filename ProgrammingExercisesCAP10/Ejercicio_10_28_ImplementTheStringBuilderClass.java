package ProgrammingExercisesCAP10;

public class Ejercicio_10_28_ImplementTheStringBuilderClass {
    public static void main(String[] args) {

        MyStringBuilder2 sb1 = new MyStringBuilder2("abcd");
        MyStringBuilder2 sb2 = new MyStringBuilder2("xYz");

        MyStringBuilder2 sb3 = sb1.insert(0, sb2);
        System.out.println(sb3.toStr());
        MyStringBuilder2 sb4 = sb1.reverse();
        System.out.println(sb4.toStr());
        MyStringBuilder2 sb5 = sb4.substring(1);
        System.out.println(sb5.toStr());
        MyStringBuilder2 sb6 = sb3.toUpperCase();
        System.out.println(sb6.toStr());


    }
}

class MyStringBuilder2 {

    private char[] ch;

    public MyStringBuilder2() {
    }

    public MyStringBuilder2(char[] chars) {
        this.ch = chars;
    }

    public MyStringBuilder2(String s) {
        this.ch = s.toCharArray();
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] array = new char[this.ch.length + s.getCh().length];

        int count = 0;
        int xCount = 0;

        for (int i = 0; i < array.length; i++) {

            if (count == s.ch.length) {

                array[i] = this.ch[xCount];
                xCount++;
            }

            if (i < offset) {
                array[i] = this.ch[i];
                xCount++;
            }

            if (i >= offset && count < s.ch.length) {
                array[i] = s.ch[count];
                count++;

            }

        }

        return new MyStringBuilder2(array);
    }

    public MyStringBuilder2 reverse() {
        char[] array = new char[ch.length];

        for (int i = 0, j = ch.length - 1; i < ch.length; i++, j--) {
            array[i] = this.ch[j];
        }

        return new MyStringBuilder2(array);
    }

    public MyStringBuilder2 substring(int begin) {
        String str = "";
        for (int i = begin; i < ch.length; i++) {
            str += ch[i];
        }
        return new MyStringBuilder2(str);
    }

    public MyStringBuilder2 toUpperCase() {
        String str = "";

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {

                if (ch[i] < 'a') {
                    str += ch[i];
                } else if (ch[i] >= 'a' || ch[i] <= 'z') {
                    str += (char) (ch[i] - 32);
                }

            }
        }


        return new MyStringBuilder2(str);
    }

    private char[] getCh() {
        return ch;
    }

    public String toStr() {
        return String.valueOf(this.ch);
    }
}
