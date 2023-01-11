package ProgrammingExercisesCAP10;

public class Ejercicio_10_27_ImplementTheStringBuilderClass {
    public static void main(String[] args) {

        MyStringBuilder1 stringBuilder1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 stringBuilder2 = new MyStringBuilder1("WORLD");

        String m2 = stringBuilder2.toStringMyStrBulider();

        System.out.println(stringBuilder1.toStringMyStrBulider());
        System.out.println(m2);

        MyStringBuilder1 app = stringBuilder1.append(stringBuilder2);
        System.out.println(app.toStringMyStrBulider());

        System.out.println(stringBuilder2.append(10).toStringMyStrBulider());

        System.out.println(stringBuilder1.charAt(0));

        MyStringBuilder1 toLower = stringBuilder2.toLowerCase();
        System.out.println(toLower.toStringMyStrBulider());

        MyStringBuilder1 sub = stringBuilder1.substring(1, 3);
        System.out.println(sub.toStringMyStrBulider());


    }
}

class MyStringBuilder1 {

    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        return new MyStringBuilder1(this.s + s.toStringMyStrBulider());
    }

    public MyStringBuilder1 append(int i) {
        return new MyStringBuilder1(this.s + i);
    }

    public int length() {
        return this.s.length();
    }

    public char charAt(int index) {
        char[] array = s.toCharArray();
        return array[index];
    }

    public MyStringBuilder1 toLowerCase() {
        String str = "";

        for (int i = 0; i < this.s.length(); i++) {
            if (Character.isLetter(this.s.charAt(i))) {

                if (this.s.charAt(i) >= 'A' || this.s.charAt(i) <= 'Z') {

                    str += (char) (this.s.charAt(i) + 32);

                } else {
                    str += this.s.charAt(i);
                }

            }


        }

        return new MyStringBuilder1(str);
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] array = s.toCharArray();
        String str = "";
        for (int i = begin; i < end; i++) {
            str += array[i];
        }
        return new MyStringBuilder1(str);
    }

    public String toStringMyStrBulider() {
        return s;
    }


}
