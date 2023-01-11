import java.math.BigInteger;
import java.util.Arrays;

public class EJERCICIOSCAP10 {
    public static void main(String[] args) {


        //The frequently used wrapper objects are the byte-size integers between −128 and 127

        //Integer x1 = new Integer("32");
        //Integer x2 = new Integer("32");
        Integer x1 = Integer.valueOf("128");
        Integer x2 = Integer.valueOf("128");
        Integer x3 = Integer.valueOf("128");
        Integer x4 = Integer.valueOf("128");
        Integer x5 = 128;
        System.out.println("x1 == x2 is " + (x1 == x2)); // Display false
        System.out.println("x1 == x3 is " + (x1 == x3)); // Display false
        System.out.println("x3 == x4 is " + (x3 == x4)); // Display false
        System.out.println("x3 == x5 is " + (x3 == x5)); // Display false


        //Integer y1 = new Integer("32");
        //Integer y2 = new Integer("32");
        Integer y1 = Integer.valueOf("32");
        Integer y2 = Integer.valueOf("32");
        Integer y3 = Integer.valueOf("32");
        Integer y4 = Integer.valueOf("32");
        Integer y5 = 32;
        System.out.println("x1 == x2 is " + (y1 == y2)); // Display true
        System.out.println("x1 == x3 is " + (y1 == y3)); // Display true
        System.out.println("x3 == x4 is " + (y3 == y4)); // Display true
        System.out.println("x3 == x5 is " + (y3 == y5)); // Display true

        System.out.println("------------------------------------------------");

        //Each numeric wrapper class has the constants MAX_VALUE and MIN_VALUE. MAX_VALUE

        System.out.println("The maximum integer is " + Integer.MAX_VALUE);
        System.out.println("The minimum positive float is " +
                Float.MIN_VALUE);
        System.out.println("The maximum double-precision floating-point number is " +
                Double.MAX_VALUE);
        System.out.println("The maximum long is " + Long.MAX_VALUE);
        System.out.println("The maximum Short is " + Short.MAX_VALUE);

        System.out.println("------------------------------------------------");


        //Conversion methods
        Double.valueOf(12.4).intValue(); //returns 12;
        System.out.println(Double.valueOf(12.4).intValue());
        Integer.valueOf(12).doubleValue(); //returns 12.0;
        System.out.println(Integer.valueOf(12).doubleValue());

        System.out.println("------------------------------------------------");


        //CompareTo method
        Double.valueOf(12.4).compareTo(Double.valueOf(12.3));//returns 1;
        System.out.println(Double.valueOf(12.4).compareTo(Double.valueOf(12.3)));

        Double.valueOf(12.3).compareTo(Double.valueOf(12.3)); //returns 0;
        System.out.println(Double.valueOf(12.3).compareTo(Double.valueOf(12.3)));

        Double.valueOf(12.3).compareTo(Double.valueOf(12.51)); //returns –1;
        System.out.println(Double.valueOf(12.3).compareTo(Double.valueOf(12.51)));

        System.out.println("------------------------------------------------");


        //The numeric wrapper classes have a useful static method, valueOf(String s).
        Double doubleObject = Double.valueOf("12.4");
        System.out.println(doubleObject);
        Integer integerObject = Integer.valueOf("12");
        System.out.println(integerObject);

        System.out.println("------------------------------------------------");

        //static parsing methods

        // These two methods are in the Byte class
        //public static byte parseByte(String s)
        //public static byte parseByte(String s, int radix)

        // These two methods are in the Short class
        //public static short parseShort(String s)
        //public static short parseShort(String s, int radix)

        // These two methods are in the Integer class
        //public static int parseInt(String s)
        //public static int parseInt(String s, int radix)

        // These two methods are in the Long class
        //public static long parseLong(String s)
        //public static long parseLong(String s, int radix)

        // These two methods are in the Float class
        //public static float parseFloat(String s);
        //public static float parseFloat(String s, int radix);

        // These two methods are in the Double class
        //public static double parseDouble(String s);
        //public static double parseDouble(String s, int radix);

        Integer.parseInt("11", 2); //returns 3;
        System.out.println(Integer.parseInt("11", 2));
        Integer.parseInt("12", 8); //returns 10;
        System.out.println(Integer.parseInt("12", 8));
        Integer.parseInt("13", 10); //returns 13;
        System.out.println(Integer.parseInt("13", 10));
        Integer.parseInt("1A", 16);//returns 26;
        System.out.println(Integer.parseInt("1A", 16));
        Integer.parseInt("100");//returns 26;
        System.out.println(Integer.parseInt("100"));

        System.out.println("------------------------------------------------");

        //10.7.2 Can each of the following statements be compiled?
        // a.
        //Integer i = new Integer("23"); NO COMPILA
        //b.
        //Integer i = new Integer((23)); NO COMPILA
        //c.
        Integer iC = Integer.valueOf("23");
        System.out.println("c." + iC);
        //d.
        Integer iD = Integer.parseInt("23", 8);
        System.out.println("d." + iD);
        //e.
        //Double d = new Double();
        //f.
        Double dF = Double.valueOf("23.45");
        System.out.println("f." + dF);
        //g.
        int iG = (Integer.valueOf("23")).intValue();
        System.out.println("g." + iG);
        //h.
        double dH = (Double.valueOf("23.4")).doubleValue();
        System.out.println("h." + dH);
        //i.
        int iI = (Double.valueOf("23.4")).intValue();
        System.out.println("i." + iI);
        //j.
        String sJ = (Double.valueOf("23.4")).toString();
        System.out.println("j." + sJ);

        System.out.println("------------------------------------------------");

        //Ejercicio 10.73
        //How do you convert an integer into a string?
        int w = 1996;
        String wSTR1 = Integer.toString(w);
        String wSTR2 = String.valueOf(w);


        //How do you convert a numeric string into an integer?
        String x = "271296";
        int xNum = Integer.parseInt(x);

        //How do you convert a double number into a string?
        Double y = 3.1416;
        String yStr1 = Double.toString(y);
        String yStr2 = String.valueOf(y);


        // How do you convert a numeric string into a double value?
        String z = "3.15";
        Double zD = Double.parseDouble(z);

        System.out.println("------------------------------------------------");

        //10.7.4 Show the output of the following code

        Integer x1074 = Integer.valueOf(3);
        System.out.println(x1074.intValue());
        System.out.println(x1074.compareTo(4));

        System.out.println("------------------------------------------------");

        //10.7.5 What is the output of the following code?

        System.out.println(Integer.parseInt("10"));             // return 10
        System.out.println(Integer.parseInt("10", 10));    // return 10
        System.out.println(Integer.parseInt("10", 16));    // return 16
        System.out.println(Integer.parseInt("11"));             // return 11
        System.out.println(Integer.parseInt("11", 10));    // return 11
        System.out.println(Integer.parseInt("11", 16));    // return 17

        System.out.println("------------------------------------------------");

        //10.8.1 Are the following statements correct?
        //a.
        Integer xA = 3 + Integer.valueOf(5);
        System.out.println(xA);
        //b.
        Integer xB = 3;
        System.out.println(xB);
        //c.
        //Double xC = 3;
        Double xC = 3.10;
        System.out.println(xC);
        //d.
        Double xD = 3.0;
        System.out.println(xD);
        //e.
        int xE = Integer.valueOf(3);
        System.out.println(xE);
        //f.
        int xF = Integer.valueOf(3) + Integer.valueOf(4);
        System.out.println(xF);

        System.out.println("------------------------------------------------");

        //10.8.2 Show the output of the following code.
        Double x1082 = 3.5;
        System.out.println(x1082.intValue());
        System.out.println(x1082.compareTo(4.5));

        System.out.println("------------------------------------------------");

        //10.9.1 What is the output of the following code?
        BigInteger x1091 = new BigInteger("3");
        BigInteger y1091 = new BigInteger(7 + "");
        BigInteger z1091 = x1091.add(y1091);
        System.out.println("x is " + x1091);
        System.out.println("y is " + y1091);
        System.out.println("z is " + z1091);

        System.out.println("------------------------------------------------");

        //You can also create a string from an array of characters.
        char[] charArray = {'G', 'o', 'o', 'd', ' ', 'D', 'a', 'y'};
        String message = new String(charArray);
        System.out.println(message);

        System.out.println("------------------------------------------------");

        //10.10.1 Suppose s1, s2, s3, and s4 are four strings, given as follows:
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println("a. " + (s1 == s2));
        System.out.println("b. " + (s1 == s3));
        System.out.println("c. " + (s1 == s4));
        System.out.println("d. " + (s1.equals(s3)));
        System.out.println("e. " + (s1.equals(s4)));
        System.out.println("f. " + ("Welcome to Java".replace("Java", "HTML")));
        System.out.println("g. " + (s1.replace('o', 'T')));
        System.out.println("h. " + (s1.replaceAll("o", "T")));
        System.out.println("i. " + (s1.replaceFirst("o", "T")));
        System.out.println("j. " + (Arrays.toString(s1.toCharArray())));

        System.out.println("------------------------------------------------");

        //10.10.3 What is the output of the following code?

        String sOne10103 = "Welcome to Java";
        String sTwo10103 = s1.replace("o", "abc");
        System.out.println(sOne10103);
        System.out.println(sTwo10103);

        System.out.println("------------------------------------------------");

        //10.10.4 Let s1 be " Welcome " and s2 be " welcome ". Write the code for the following statements

        String s10104S1 = " Welcome ";
        String s10104S2 = " welcome ";

        //Replace all occurrences of the character e with E in s1 and assign the new string to s3.
        String s10104S3 = s10104S1.replace('e', 'E');

        /*
        Split Welcome to Java and HTML into an array tokens delimited by
        a space and assign the first two tokens into s1 and s2.
         */
        String[] tokens = "Welcome to Java and HTML".split("[ ]");

        s10104S1 = tokens[0];
        s10104S2 = tokens[1];

        System.out.println("s1: " + s10104S1 + " | s2: " + s10104S2 + " | s3: " + s10104S3);
        System.out.println("Array tokens: " + Arrays.toString(tokens));

        System.out.println("------------------------------------------------");

        //10.10.6 Suppose string s is created using new String(); what is s.length()?
        String s10106 = new String();
        System.out.println(s10106.length());

        System.out.println("------------------------------------------------");

        //10.10.7 How do you convert a char, an array of characters, or a number to a string?

        String x10107 = String.valueOf('A');
        System.out.println(x10107);

        String y10107 = String.valueOf(13);
        System.out.println(y10107);

        String z10107 = String.valueOf(3.1416);
        System.out.println(z10107);

        char[] arrayCh = {'H', 'E', 'L', 'L', 'O'};
        String w10107 = String.valueOf(arrayCh);
        System.out.println(w10107);

        System.out.println("------------------------------------------------");

        //10.10.8 Why does the following code cause a NullPointerException?
        /*

        public class TEST {
    private String text;

    public TEST(String s) {
        this.text = s;
    }

    public static void main(String[] args) {

        TEST test = new TEST("ABC");

        System.out.println(test.text.toLowerCase());
    }

}

         */
        System.out.println("------------------------------------------------");

        //10.10.9 What is wrong in the following program?
        /*

        public class TEST {
   private String text;

   public TEST(String s){
       this.text = s;
   }

    public static void main(String[] args) {
        TEST test = new TEST("ABC");
        String x = test.text;
        System.out.println(x);
    }

}

         */
        System.out.println("------------------------------------------------");

        //10.10.10 Show the output of the following code:
        System.out.println("Hi, ABC, good".matches("ABC "));            //Display false
        System.out.println("Hi, ABC, good".matches(".*ABC.*"));         //Display true

        String s101010 = "A,B;C";

        System.out.println(s101010.replaceAll(",;", "#"));   //Display A,B;C
        System.out.println(s101010.replaceAll("[,;]", "#")); //Display A#B#C

        String[] tokens10109 = "A,B;C".split("[,;]");                   //Display A B B
        for (int i = 0; i < tokens10109.length; i++) {
            System.out.print(tokens10109[i] + " ");
        }
        System.out.println("");

        System.out.println("------------------------------------------------");

        //10.10.11 Show the output of the following code:
        /*

        public class TEST {
    public static void main(String[] args) {
        String s = "Hi, Good Morning";
        System.out.println(m(s));
    }

    public static int m(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                count++;
        }

        return count;
    }

}

         */


        System.out.println("------------------------------------------------");

        //StringBuffer.append
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");

        System.out.println(stringBuilder); //Display Welcome to Java

        //stringBuilder.insert

        //stringBuilder.insert(11, "HTML and ");
        System.out.println(stringBuilder); //Display Welcome to HTML and Java

        //stringBuilder.delete

        //stringBuilder.delete(8, 20);
        System.out.println(stringBuilder); //Display Welcome Java

        //stringBuilder.deleteCharAt

        //stringBuilder.deleteCharAt(8);
        System.out.println(stringBuilder); ////Display Welcome o Java

        //stringBuilder.reverse();

        //stringBuilder.reverse();

        System.out.println(stringBuilder); ////Display avaJ ot emocleW

        //stringBuilder.replace();
        //stringBuilder.replace(11, 15, "HTML");

        System.out.println(stringBuilder); ////Display Welcome to HTML

        //stringBuilder.setCharAt();

        stringBuilder.setCharAt(0, 'w');
        System.out.println(stringBuilder);

        //10.11. 2
        //How do you create a string builder from a string?
        String s10112 = "Hi, Good Morning";
        StringBuilder stringBuilder10112 = new StringBuilder(s10112);

        //How do you return a string from a string builder?
        String sReturn = stringBuilder10112.toString();

        System.out.println("------------------------------------------------");

        //10.11.3 Write three statements to reverse a string s
        // using the reverse method in the StringBuilder class.

        String s10113S1 = "Hello";
        String s10113S2 = "Ghost";

        StringBuilder stringBuilder10113One = new StringBuilder(s10113S1);
        stringBuilder10113One.reverse();

        StringBuilder stringBuilder10113Two = new StringBuilder(s10113S2);
        stringBuilder10113Two.reverse();

        StringBuilder stringBuilder10113Three = new StringBuilder("I will set you free");
        stringBuilder10113Three.reverse();

        System.out.println(stringBuilder10113One.toString());
        System.out.println(stringBuilder10113Two.toString());
        System.out.println(stringBuilder10113Three.toString());

        System.out.println("------------------------------------------------");

        //10.11.4 Write three statements to delete a substring from a string s of 20 characters,
        // starting at index 4 and ending with index 10. Use the delete method in the StringBuilder class.

        String s10114 = "12345678901234567890";
        StringBuilder stringBuilder10114 = new StringBuilder(s10114);

        stringBuilder10114.delete(4, 10);
        //return 12341234567890

        stringBuilder10114.delete(4, 10);
        //return 12347890

        stringBuilder10114.delete(4, 10);
        //return 1234

        System.out.println(stringBuilder10114.toString());

        System.out.println("------------------------------------------------");

        //10.11.6 Suppose s1 and s2 are given as follows:
        StringBuilder s10116One = new StringBuilder("Java");
        StringBuilder s10116Two = new StringBuilder("HTML");

        //a.
        s10116One.append(" is fun ");
        System.out.println(s10116One.toString());
        //Display Java is fun

        //b.
        s10116One.append(s10116Two);
        System.out.println(s10116One.toString());
        //Display JavaHTML

        //c.
        s10116One.insert(2, "is fun");
        System.out.println(s10116One.toString());
        //Display Jais funva

        //d.
        s10116One.insert(1, s10116Two);
        System.out.println(s10116One.toString());
        //Display JHTMLava

        //e.
        s10116One.charAt(2);
        System.out.println(s10116One.charAt(2));
        //Display v

        //f.
        s10116One.length();
        System.out.println(s10116One.length());
        //Display 4

        //g.
        s10116One.deleteCharAt(3);
        System.out.println(s10116One.toString());
        //Display Jav

        //h.
        s10116One.delete(1, 3);
        System.out.println(s10116One.toString());
        //Display Ja

        //i.
        s10116One.reverse();
        System.out.println(s10116One.toString());
        //Display avaJ

        //j.
        s10116One.replace(1, 3, "Computer");
        System.out.println(s10116One.toString());
        //Display JComputera

        //k.
        s10116One.substring(1, 3);
        System.out.println(s10116One.substring(1, 3));
        //Display av

        //l.
        s10116One.substring(2);
        System.out.println(s10116One.substring(2));
        //Display va

        //10.11.7 Show the output of the following program:
        /*

        public class TEST {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder builder = new StringBuilder(s);
        change(s, builder);

        System.out.println(s);
        System.out.println(builder);
    }

    private static void change(String s, StringBuilder builder){
        s = s + " and HTML";
        builder.append(" and HTML");
    }

         */


    }
}
