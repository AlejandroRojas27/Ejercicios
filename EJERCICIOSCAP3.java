public class EJERCICIOSCAP3 {
    public static void main(String[] args) {


        //Ejercicio 3.2.2
        int x = 1;
        System.out.println("x > 0 " + (x > 0));
        System.out.println("x < 0 " + (x < 0));
        System.out.println("x != 0 " + (x != 0));
        System.out.println("x >= 0 " + (x >= 0));
        System.out.println("x != 1 " + (x != 1));

        //Ejercicio 3.3.1
        int y = -2;
        int z = 0;

        if (y > 0)
            z = 1;

        System.out.println("z: " + z);

        //Ejercicio 3.3.2 y 3.4.1
        int score = 90;
        int percent = 0;

        if (score > 90)
            percent = 3;
        else
            percent = 1;
        int pay = score * (1 + percent);
        System.out.println("Pay is: " + pay + " and percent is " + percent);

        //Ejercicio 3.3.3
        double radius = 1;
        final double PI = 3.14159;
        double area = radius * radius * PI;

        if (radius >= 0) {
            area = radius * radius * PI;
            System.out.println("The area for the circle of " +
                    " radius " + radius + " is " + area);
        }

        //Ejercicio 3.5.1
        x = 1;
        y = 2;
        if (x > 2) {
            if (y > 2) {
                z = x + y;
                System.out.println("z is: " + z);
            }
        } else
            System.out.println("x is: " + x);

        //Ejercicio 3.5.2
        System.out.println("Ejercicio 3.5.2");
        x = 1;
        y = 3;
        if (x > 2) {
            if (y > 2) {
                int z1 = x + y;
                System.out.println("z is: " + z1);
            } else
                System.out.println("x is: " + x);
        }
        //Ejercicio 3.5.3
        score = 75;
        if (score >= 90)
            System.out.println("A");
        else if (score >=80)
            System.out.println("B");
        else if (score >= 70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else {
            System.out.println("F");
        }

        //Ejercicio 3.6.2
        double count = 100;
        boolean newLine =
                count % 10 == 0;
        System.out.println("count % 10 == 0 " + newLine );

        int number = 30;
        if (number % 2 == 0)
            System.out.println
                    (number + " is even");
        if (number % 5 == 0) {
            System.out.println
                    (number + " is multiple of 5");
        }

        //Ejercicio 3.7.1
        double soles = Math.random();
        System.out.println("soles: " + soles);

        //Ejercicio 3.7.2

        // a.
        int ia = (int) (Math.random() * 21);
        System.out.println("i = " + ia);
        // b.
        int ib = 10 + (int)(Math.random() * 9);
        System.out.println("i = " + ib);
        // c.
        int ic = 10 + (int)(Math.random() * 50);
        System.out.println("i = " + ic);
        // d.
        int id = (int)(Math.random() * 100);
        System.out.println("id = " + id);
        int answer = id % 2 ;
        System.out.println("Write an expression that returns 0 or 1 randomly: " + answer);

        //Ejercicio 3.10.1
        x = 1;
        System.out.println((true) && (3 > 4));
        System.out.println(!(x > 0) && (x > 0));
        System.out.println((x > 0) || (x < 0));
        System.out.println((x != 0) || (x == 0));
        System.out.println((x >= 0) || (x < 0));
        System.out.println((x != 1) == !(x == 1));

        //Ejercicio 3.10.2
        System.out.println("(a)");
        double num = Math.random()*100;
        System.out.println((num > 0) && (num <= 100));

        System.out.println("(b)");
        num = -1;
        System.out.println((num <= 0) || (num > 0));

        //Ejercicio 3.10.3
        System.out.println("(a)");
        x = 1;
        System.out.println(Math.abs(x - 5) < 4.5);
        System.out.println(Math.abs(x - 5) > 4.5);

        //Ejercicio 3.10.6
        x=45;
        System.out.print("Para x: " + x + ", (x >= 50) && (x <= 100): ");
        System.out.println((x >= 50) && (x <= 100));

        x=67;
        System.out.print("Para x: " + x + ", (x >= 50) && (x <= 100): ");
        System.out.println((x >= 50) && (x <= 100));

        x=101;
        System.out.print("Para x: " + x + ", (x >= 50) && (x <= 100): ");
        System.out.println((x >= 50) && (x <= 100));

        //Ejercicio 3.10.7
        x = 2;
        y = 3;
        z = 6;
        System.out.println("(x < y && y < z) is " + (x < y && y < z));
        System.out.println("(x < y || y < z) is " + (x < y || y < z));
        System.out.println("!(x < y) is " + !(x < y));
        System.out.println("(x + y < z) is " + (x + y < z));
        System.out.println("(x + y > z) is " + (x + y > z));

        //Ejercicio 3.10.8
        double age = 13 + (Math.random() * 5);
        System.out.println("Age is: " + (int)age);
        System.out.println(((int)age > 13) && ((int)age < 18));

        //Ejercicio 3.10.9 a 3.10.11
        double weight = Math.random() * 100;
        double height = Math.random() * 100;
        System.out.println("weight: " + (int)weight);
        System.out.println("height: " + (int)height);
        //3.10.9
        System.out.print("(weight > 50) || (height > 60) is: ");
        System.out.println((weight > 50) || (height > 60));
        //3.10.10
        System.out.print("(weight > 50) && (height > 60) is: ");
        System.out.println((weight > 50) && (height > 60));
        //3.10.11
        System.out.print("(weight > 50) ^ (height > 60) is: ");
        System.out.println((weight > 50) ^ (height > 60));

        //Ejercicio 3.13.2

        //Generar datos
        x = (int) (1 + Math.random() * 10);
        y = 1;

        //Imprimir en terminal los datos
        System.out.println("x = " + (int)x);
        System.out.println("y = " + (int)y);

        System.out.print("x + 3: ");
        System.out.println(x + 3);

        //Statement usando switch
        switch (x + 3) {
            case 6: y =1; break;
            default: y += 1;
        }
        System.out.println("Y is: " + y);

        //Statement usando if
        x = x;
        y = 1;
        if ((x + 3) == 6)
            y=1;
        else y +=1;
        System.out.println("Y is: " + y);

        //Ejercicio 3.13.3
        System.out.println("Ejercicio 3.13.3");

        x = 0;
        int a = 3;

        //Usando if
        if (a == 1)
            x +=5;
        else if (a == 2)
            x += 10;
        else if (a == 3)
            x += 16;
        else if (a == 4)
            x += 34;

        System.out.println("X is: " + x);

        //Usando switch
        x = 0;
        a = a;

        switch (a) {
            case 1: x += 5; break;
            case 2: x += 10; break;
            case 3: x += 16; break;
            case 4: x += 34; break;
        }
        System.out.println("x is: " + x);

        //Ejercicio 3.13.4
        int day = (int)(Math.random() * 6);
        System.out.println("Dia numero: " + day);
        switch (day){
            case 0: System.out.println("Domingo"); break;
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
        }

        //Ejercicio 3.13.5

        int year = (int)(Math.random() * 9999);
        System.out.println("Year: " + year);
        System.out.print("Year % 12: " );
        System.out.println(year % 12);

        if ((year % 12) == 0)
            System.out.println("monkey");
        else if ((year % 12) == 1)
            System.out.println("rooster");
        else if ((year % 12) == 2)
            System.out.println("dog");
        else if ((year % 12) == 3)
            System.out.println("pig");
        else if ((year % 12) == 4)
            System.out.println("rat");
        else if ((year % 12) == 5)
            System.out.println("ox");
        else if ((year % 12) == 6)
            System.out.println("tiger");
        else if ((year % 12) == 7)
            System.out.println("rabbit");
        else if ((year % 12) == 8)
            System.out.println("dragon");
        else if ((year % 12) == 9)
            System.out.println("snake");
        else if ((year % 12) == 10)
            System.out.println("horse");
        else if ((year % 12) == 11)
            System.out.println("sheep");

        {}//Ejercicio 3.14.1
        System.out.println("Ejercicio 3.14.1");

        x = 2;
        y = 3;
        z = 6;

        System.out.println((x < y && y < z)? "sorted": "not sorted");

        //Ejercicio 3.14.2

        age = (int)(Math.random() * 35);
        System.out.println("Age is: " + (int)age);

        int ticketPrice = ((age >=16)? 20: 10);

        System.out.println("Ticket price is: " + ticketPrice);

        //Ejercicio 3.14.3
        //a
        int variable = (int)(Math.random() * 20);
        score = 0;
        int scale = 1;

        System.out.println("Variable: " + variable + " and scale: " + scale);

        if (variable > 10)
            score = (scale * 3);
        else
            score = (scale * 4);

        System.out.println("Score: " + score);

        //b
        double tax = 1;
        int income = (int)(9990 + Math.random() * 20);
        System.out.println("Income: " + income);

        if (income > 10000)
            tax = income * 0.20;
        else
            tax = income * 0.17 + 1000;

        System.out.println("Tax: " + tax);

        //c
        number = (int)(Math.random() * 100);
        System.out.println("Number: " + number);

        if (number % 3 == 0)
            System.out.println("i");
        else
            System.out.println("j");

        //Ejercicio 3.14.4
        number = (int)(-5 + Math.random() * 10);
        System.out.println("Number: " + number);
        System.out.println((number >= 1)? 1: -1);

        //Ejercicio 3.15.3
        System.out.print("((2 * 2 - 3) > 2) && ((4 - 2)) > 5 ");
        System.out.println(((2 * 2 - 3) > 2) && ((4 - 2)) > 5);

        System.out.print("((2 * 2 - 3) > 2) || ((4 -2) > 5)");
        System.out.println(((2 * 2 - 3) > 2) || ((4 -2) > 5));

        //Ejercicio 3.15.4
        x = 1;
        y = 1;
        System.out.print("(x > 0 || x < 10 && y < 0)");
        System.out.println((x > 0 || x < 10 && y < 0));
        System.out.print("(x > 0 || (x < 10 && y < 0))");
        System.out.println((x > 0 || (x < 10 && y < 0)));




    }
}