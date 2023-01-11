public class EJERCICIOSCAP4 {
    public static void main(String[] args) {
        //Ejercicio 4.2.1
        {
            System.out.println(" ");

            System.out.println("(a) :" + Math.sqrt(4));
            System.out.println("(b) :" + Math.sin(2 * Math.PI));
            System.out.println("(c) :" + Math.cos(2 * Math.PI));
            System.out.println("(d) :" + Math.pow(2, 2));
            System.out.println("(e) :" + Math.log(Math.E));
            System.out.println("(f) :" + Math.exp(1));
            System.out.println("(g) :" + Math.max(2, Math.min(3, 4)));
            System.out.println("(h) :" + Math.rint(-2.5));
            System.out.println("(i) :" + Math.ceil(-2.5));
            System.out.println("(j) :" + Math.floor(-2.5));
            System.out.println("(k) :" + Math.round(-2.5f));
            System.out.println("(l) :" + Math.round(-2.5));
            System.out.println("(m) :" + Math.rint(2.5));
            System.out.println("(n) :" + Math.ceil(2.5));
            System.out.println("(o) :" + Math.floor(2.5));
            System.out.println("(p) :" + Math.round(2.5f));
            System.out.println("(q) :" + Math.round(2.5));
            System.out.println("(r) :" + Math.round(Math.abs(-2.5)));

        }

        //Ejercicio 4.2.3
        {
            System.out.println(" ");

            double degreesToRadians = Math.toRadians(47);
            System.out.println("47 Degrees to radians :" + degreesToRadians);
        }

        //Ejercicio 4.2.4
        {
            System.out.println(" ");

            double radiansToDegree = Math.toDegrees(Math.PI / 7);
            System.out.println("1/7 PI Radians to degrees: " + radiansToDegree);
        }

        //Ejercicio 4.2.5
        {
            System.out.println(" ");

            System.out.println("Numero aleatorio entre 34 y 55: " + (int) (34 + Math.random() * 22));
            System.out.println("Numero aleatorio entre 0 y 999: " + (int) (Math.random() * 1000));
            System.out.println("Numero aleatorio entre 5.5 y 55.5 : " + (5.5 + Math.random() * 51));
        }

        //Ejercicio 4.2.7
        {
            System.out.println(" ");

            System.out.println("What is Math.log(Math.exp(5.5))?  " + Math.log(Math.exp(5.5)));
            System.out.println("What is Math.exp(Math.log(5.5))?  " + Math.exp(Math.log(5.5)));
            System.out.println("What is Math.asin(Math.sin(Math.PI / 6))?  " + Math.asin(Math.sin(Math.PI / 6)));
            System.out.println("What is Math.sin(Math.asin(Math.PI / 6))?  " + Math.sin(Math.asin(Math.PI / 6)));
        }

        //Ejercicio 4.3.2
        {
            System.out.println(" ");

            System.out.println("\\");
            System.out.println("''");
        }

        //Ejercicio 4.3.3
        {
            System.out.println(" ");

            int ch1 = '1';
            System.out.println(ch1);
            int ch2 = 'A';
            System.out.println(ch2);
            int ch3 = 'B';
            System.out.println(ch3);
            int ch4 = 'a';
            System.out.println(ch4);
            int ch5 = 'b';
            System.out.println(ch5);

            char ch6 = 40;
            System.out.println(ch6);
            char ch7 = 59;
            System.out.println(ch7);
            char ch8 = 79;
            System.out.println(ch8);
            char ch9 = 85;
            System.out.println(ch9);
            char ch10 = 90;
            System.out.println(ch10);

            char ch11 = (char) 0XAB0040;
            System.out.println(ch11);
            char ch12 = (char) 0XAB005A;
            System.out.println(ch12);
            char ch13 = (char) 0XAB0071;
            System.out.println(ch13);
            char ch14 = (char) 0XAB0072;
            System.out.println(ch14);
            char ch15 = (char) 0XAB007A;
            System.out.println(ch15);
        }

        //Ejercicio 4.3.4
        {
            System.out.println(" ");

            int i = '1';
            System.out.println(i);
            int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
            System.out.println(j);
            int k = 'a';
            System.out.println(k);
            char c = 90;
            System.out.println(c);
        }

        //Ejercicio 4.3.5
        {
            System.out.println(" ");

            char ch16 = 'A';
            System.out.println(ch16);
            int ch17 = (int) ch16;
            System.out.println(ch17);

            float f1 = 1000.34f;
            System.out.println(f1);
            int i1 = (int) f1;
            System.out.println(i1);

            double d1 = 1000.34;
            System.out.println(d1);
            int i2 = (int) d1;
            System.out.println(i2);

            int i3 = 97;
            System.out.println(i3);
            char c1 = (char) i3;
            System.out.println(c1);
        }

        //Ejercicio 4.3.5
        {
            System.out.println(" ");
            char x = 'a';

            char y = 'c';

            System.out.println(++x);
            System.out.println(y++);
            System.out.println(x - y);
        }

        //Ejercicio 4.3.6
        {
            System.out.println(" ");

            int x = (int) (97 + Math.random() * 27);
            System.out.println(x);
            char y = (char) x;
            System.out.println(y);
        }

        //Ejercicio 4.3.6
        {
            System.out.println(" ");

            System.out.println('a' < 'b');
            System.out.println('a' <= 'A');
            System.out.println('a' > 'b');
            System.out.println('a' >= 'A');
            System.out.println('a' == 'a');
            System.out.println('a' != 'b');
        }

        //4.4.1 Getting String Length
        {
            String message = "Welcome to Java";
            System.out.println("The length of " + message + " is " + message.length());

            int j = 1;
            int i = 2;
            System.out.println("j + i: " + (j + i));
        }

        //Ejercicio 4.4.1
        {
            System.out.println(" ");
            String s1 = "Welcome to Java";
            String s2 = "Programming is fun";
            String s3 = "Welcome to Java";

            System.out.println("(a): " + (s1 == s2));
            System.out.println("(b): " + (s2 == s3));
            System.out.println("(c): " + (s1.equals(s2)));
            System.out.println("(d): " + (s1.equals(s3)));
            System.out.println("(e): " + (s1.compareTo(s2)));
            System.out.println("(f): " + (s2.compareTo(s3)));
            System.out.println("(g): " + (s2.compareTo(s2)));
            System.out.println("(h): " + (s1.charAt(0)));
            System.out.println("(i): " + (s1.indexOf('j')));
            System.out.println("(j): " + (s1.indexOf("to")));
            System.out.println("(k): " + (s1.lastIndexOf('a')));
            System.out.println("(l): " + (s1.lastIndexOf("o", 15)));
            System.out.println("(m): " + (s1.length()));
            System.out.println("(n): " + (s1.substring(5)));
            System.out.println("(o): " + (s1.substring(5, 11)));
            System.out.println("(p): " + (s1.startsWith("Wel")));
            System.out.println("(q): " + (s1.endsWith("Java")));
            System.out.println("(r): " + (s1.toLowerCase()));
            System.out.println("(s): " + (s1.toUpperCase()));
            System.out.println("(t): " + (s1.concat(s2)));
            System.out.println("(u): " + (s1.contains(s2)));
            System.out.println("(v): " + ("\t Wel \t".trim()));


        }

        //Ejercicio 4.4.2
        {
            System.out.println(" ");
            String s = "Welcome to Java";
            String s1 = "Pokemon";
            String s2 = "Berserk";

            String s3 = s1 + s2;
            System.out.println("s3: " + s3);
            s1.compareTo(s2);
            System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
            int i = s1.length();
            System.out.println("i: " + i);
            char c = s1.charAt(0);
            System.out.println("c: " + c);
        }

        //Ejercicio 4.4.3
        {
            System.out.println(" ");

            System.out.println("1" + 1);
            System.out.println('1' + 1);  // '1' tiene asignado el 49 en Code Value in Decimal 49+1=50
            System.out.println("1" + 1 + 1);
            System.out.println("1" + (1 + 1));
            System.out.println('1' + 1 + 1); // '1' tiene asignado el 49 en Code Value in Decimal 49+1+1=51
        }

        //Ejercicio 4.4.4
        {
            System.out.println(" ");

            System.out.println(1 + "Welcome" + 1 + 1);
            System.out.println(1 + "Welcome" + (1 + 1));
            System.out.println(1 + "Welcome" + ('\u0001' + 1));
            System.out.println(1 + "Welcome" + 'a' + 1);

        }

        //Ejercicio 4.4.5
        {
            System.out.println(" ");

            String s1 = "Welcome";
            String s2 = " welcome ";

            //(a)
            boolean isEqual1 = s1.equals(s2);
            System.out.println(isEqual1);
            //(b)
            boolean isEqual2 = s1.equalsIgnoreCase(s2);
            System.out.println(isEqual2);
            //(c)
            int x1 = s1.compareTo(s2);
            System.out.println(x1);
            //(d)
            int x2 = s1.compareToIgnoreCase(s2);
            System.out.println(x2);
            //(e)
            boolean b1 = s1.startsWith("AAA");
            System.out.println(b1);
            //(f)
            boolean b2 = s1.endsWith("AAA");
            System.out.println(b2);
            //(g)
            int x3 = s1.length();
            System.out.println(x3);
            //(h)
            char ch1 = s1.charAt(1);
            System.out.println(ch1);
            //(i)
            String s3 = s1.concat(s2);
            System.out.println(s3);
            String s4 = s1 + s2;
            System.out.println(s4);
            //(j)
            String s5 = s1.substring(1);
            System.out.println(s5);
            //(k)
            String s6 = s1.substring(1, 4);
            System.out.println(s6);
            //(l)
            String s7 = s1.toLowerCase();
            System.out.println(s7);
            //(m)
            String s8 = s1.toUpperCase();
            System.out.println(s8);
            //(n)
            String s9 = s2.trim();
            System.out.println(s9);
            //(o)
            int x4 = s1.indexOf("e");
            System.out.println(x4);
            //(p)
            int x5 = s1.indexOf("abc");
            System.out.println(x5);

        }

        //Ejercicio 4.4.6
        {
            System.out.println(" ");
            int i = 1000;
            String s = i + "";
            System.out.println("Number of the digits in:" + i + " is " + (s.length()));

        }

        //Ejercicio 4.4.7
        {
            System.out.println(" ");
            double d = 3.1;
            String s = d + "";
            System.out.println("Number of the digits in:" + d + " is " + (s.length()));

        }

        //Ejercicio 4.6.2
        {
            //(a)
            System.out.printf("%5d %1d %1d", 1, 2, 3);
            //(b)
            System.out.printf("%5d %10.5f", 1, 100.247);
            //(c)
            System.out.printf("%5d %10.3f", 1, 2.33);
            //(d)
            System.out.printf("%10.2f\n%10.3f\n", 1.23456, 2.34);
            //(e)
            System.out.printf("%8s\n", "Java");
        }

        //Ejercicio 4.6.3
        {
            //(a)
            System.out.printf("amount is %f %e\n", 32.32, 32.32);
            //(b)
            System.out.printf("amount is %5.2f%% %5.4e\n", 32.327, 32.32);
            //(c)
            System.out.printf("%6b\n", (1 > 2));
            //(d)
            System.out.printf("%6s\n", "Java");
            //(e)
            System.out.printf("%-6b%s\n", (1 > 2), "Java");
            //(f)
            System.out.printf("%6b%-8s\n", (1 > 2), "Java");
            //(g)
            System.out.printf("%,3d %,6.1f\n", 321342, 315562.932);
            //(h)
            System.out.printf("%05d %010.5f\n", 32, 32.32);
        }












    }
}
