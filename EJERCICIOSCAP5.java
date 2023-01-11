import java.util.Scanner;

public class EJERCICIOSCAP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ejercicio 5.2.1
        {
            System.out.println("Ejercicio 5.2.1");
            int count = 0;
            while (count < 2) {
                System.out.println("Welcome to Java!");
                count++;
            }
            System.out.println("");
        }

        //Ejercicio 5.2.2
        {
            System.out.println("Ejercicio 5.2.2");
            //a INFINITO
        /*
        int i = 1;
        while (i < 10){
            if (i % 2 == 0);
            System.out.println(i);
        }
         */
            //b NO SE IMPRIMIO
        /*
        int i = 1;
        while (i < 10)
            if ( i % 2 == 0 )
                System.out.println(i++);
         */
            //c
            int i = 1;
            while (i < 10)
                if ((i++) % 2 == 0)
                    System.out.println(i);

            System.out.println("");
        }

        //Ejercicio 5.2.3
        {
            System.out.println("Ejercicio 5.2.3");
            int x = 5;//80000000;
            while (x < 90)
                x++;
            System.out.println("x is " + x);
            System.out.println("");
        }

        //Ejercicio 5.5.1
        {
            System.out.println("Ejercicio 5.5.1");

            /*
            int number, max;
            number = input.nextInt();
            max = number;

            while (number != 0) { //Con o se acaba cierra el loop
                number = input.nextInt();
                if (number > max)
                    max = number;
            }
            System.out.println("max is " + max);
            System.out.println("number " + number);

             */

            System.out.println("");
        }

        //Ejercicio 5.6.1
        {
            System.out.println("Ejercicio 5.6.1");

            /*
            int number, max;
            number = input.nextInt();
            max = number;

            do {
                number = input.nextInt();
                if (number > max)
                    max = number;
            } while (number != 0);
            System.out.println("max is " + max);
            System.out.println("number is " + number);

             */

            System.out.println("");

        }

        //Ejercicio 5.6.2
        {
            System.out.println("Ejercicio 5.6.2");

            int sum = 0;
            int number = 0;

            do {
                System.out.println("Enter an integer " + "(the input ends if it is 0)");
                number = (int) (Math.random() * 2);
                sum += number;
            } while (number != 0);
            System.out.println("sum: " + sum);

            System.out.println("");
        }

        //Ejercicio 5.7.1
        {
            System.out.println("Ejercicio 5.7.1");
            //(a)
            int sum = 0;
            for (int i = 0; i < 10; ++i) {
                sum += i;
            }
            System.out.println(sum);
            //(b)
            int sum2 = 0;
            for (int i = 0; i < 10; i++) {
                sum2 += i;
            }
            System.out.println(sum2);

            System.out.println("");
        }

        //Ejercicio 5.7.2
        {
            System.out.println("Ejercicio 5.7.2");

            for (int i = 1; i < 21; i++) {
                System.out.println(i);
            }
            System.out.println("");

        }

        //Ejercicio 5.7.3
        {
            System.out.println("Ejercicio 5.7.3");


            int number, sum = 0, count;

            for (count = 0; count < 5; count++) {
                number = 10;//input.nextInt(); el 10 se suma ciclicamente hasta que count sea 5 (count ===5)
                sum += number;
            }
            System.out.println("sum: " + sum);
            System.out.println("count: " + count);

            System.out.println("");
        }

        //Ejercicio 5.7.4
        {
            System.out.println("Ejercicio 5.7.4");
        /* Este statement no hace nada por que no tiene definida la variable de control, la loop-continuation-condition
        ni la action-after-each-iteration
        for ( ; ; ;){
          //Do something
        }

         */
        }

        //Ejercicio 5.7.6
        {
            System.out.println("Ejercicio 5.7.6");
            long sum = 0;
            int i = 0;
            //conviertir a while
            while (i <= 1000) {
                i++;
            }
            System.out.println(i);
            //conviertir a do
            do {
                i++;
            } while (i <= 1000);
            System.out.println(i);

            System.out.println("");
        }

        //Ejercicio 5.7.7
        {
            System.out.println("Ejercicio 5.7.7");
            //(a)
            int countA = 0;
            while (countA < 5) {
                countA++;
                System.out.println("count (a): " + countA);
            }
            //(b)
            for (int countB = 0; countB <= 7; countB++) {
                System.out.println("count (b): " + countB);
            }
            //(c)
            int countC = 5;
            while (countC < 10) {
                countC++;
                System.out.println("count (c): " + countC);
            }
            //(d)
            int countD = 5;
            while (countD < 10) {
                countD = countD + 3;
                System.out.println("count (d): " + countD);
            }

            System.out.println("");
        }

        //Ejercicio 5.8.2
        {
            System.out.println("Ejercicio 5.8.1");
            int i, sum = 0;
            for (i = 1, sum = 0; sum < 100; sum = sum + i, i++) {
                System.out.println("i: " + i + " ,sum: " + sum);
            }
            System.out.println("");
        }

        //Ejercicio 5.8.3
        {
            System.out.println("Ejercicio 5.8.3");

            int i = 0;
            int sum = 0;
            int j = 0;

            for (i = 0; i < 10; i++) {
                sum += i;

                if (i > j)
                    System.out.println("i: " + i);
                else
                    System.out.println("j: " + j);

                while (j < 10) {
                    j++;
                }

                do {
                    j++;
                } while (j < 10);
            }
        }

        //Ejercicio 5.8.4
        {
            System.out.println("Ejercicio 5.8.4");
            //(a)
            int i = 0;
            do {
                System.out.println(i + 4);
                i++;
            } while (i < 10);
            System.out.println("");
            //(b)
            for (i = 0; i < 10; i++) {
                System.out.println(i + 4);
            }
            System.out.println("");
        }

        //Ejercicio 5.9.1
        {
            System.out.println("Ejercicio 5.9.1");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " | ");
                for (int j = 0; j < i; j++) {
                    //Display the product and aling properly
                    System.out.printf("%4d", i * j);
                }
                System.out.println("");
            }

        }

        //Ejercicio 5.9.2
        {
            System.out.println("Ejercicio 5.9.2");
            System.out.println("(a)");
            {
                for (int i = 1; i < 5; i++) {
                    int j = 0;
                    while (j < i) {
                        System.out.println(j + " ");
                        j++;
                    }
                }
            }
            System.out.println("(b)");
            {
                int i = 0;
                while (i < 5) {
                    for (int j = i; j > 1; j--)
                        System.out.println(j + " ");
                    System.out.println("****");
                    i++;
                }
            }
            System.out.println("(c)");
            {
                int i = 5;
                while (i >= 1) {
                    int num = 1;
                    for (int j = 1; j <= 1; j++) {
                        System.out.print(num + "xxx");
                        num *= 2;
                    }
                    System.out.println();
                    i--;
                }
            }
            System.out.println("(d)");
            {
                int i = 1;
                do {
                    int num = 1;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(num + "G");
                        num += 2;
                    }

                    System.out.println();
                    i++;
                } while (i <= 5);
            }

            System.out.println("");
        }

        //Ejercicio 5.11.1
        {
            System.out.println("Ejercicio 5.11.1");
            //Propt the user to enter two integers
            System.out.print("Enter first integer: ");
            int n1 = 1254;//(int)(Math.random() * 51);//input.nextInt();
            System.out.print("Enter second integer: ");
            int n2 = 25254;//(int)(Math.random() * 51);//input.nextInt();

            int gcd = 1; //Initial great common divisor
            int k = 2; //Possible gcd
            while (k <= n1 / 2 && k < n2 / 2) {
                if (n1 % k == 0 && n2 % k == 0)
                    gcd = k;
                k++;

            }

            System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
            System.out.println("");
        }

        //Ejercicio 5.12.1
        {
            System.out.println("Ejercicio 5.12.1");
            //a
            int balance = 10;
            while (true) {
                if (balance < 9)
                    break;
                balance = balance - 9;
            }

            System.out.println("Balance is " + balance);

            System.out.println("");
        }

        //Ejercicio 5.12.2
        {
            System.out.println("Ejercicio 5.12.2");
            int i = 0;
            int sum = 0;
            while (i < 4) {
                i++;
                if (i % 3 == 0) {
                    continue;
                }
                sum += 1;
                System.out.println("(a)i: " + i + ", sum: " + sum);
            }
            System.out.println("");

            for (i = 0, sum = 0; i < 4; sum += 1) {
                i++;
                if (i % 3 == 0) {
                    continue;
                }
                System.out.println("(b)i: " + i + ", sum: " + sum);
            }
            System.out.println("");

        }

        //Ejercicio 5.12.3
        {
            System.out.println("Ejercicio 5.12.3");
            //Test break without break
            {
                int sum = 0;
                int number = 0;
                boolean found = false;

                while (number < 20 && !found) {
                    if (sum >= 100)
                        found = true;
                    else {
                        number++;
                        sum += number;
                    }
                }

                System.out.println("The number is " + number);
                System.out.println("The sum is " + sum);

            }

            //Test continue without continue
            {
                int sum = 0;
                int number = 0;
                boolean found = false;


                while (number < 20) {
                    number++;
                    if (number != 10 && number != 11) {
                        sum += number;
                    }

                }
                System.out.println("The number is " + number + " sum is " + sum);

            }

            System.out.println("");
        }

        //Ejercicio 5.12.4
        {
            System.out.println("Ejercicio 5.12.4");
            //(a)
            System.out.println("a");
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < 4; j++) {
                    if (i * j > 2)
                        break;

                    System.out.println("j: " + j);
                    System.out.println("i * j: " + (i * j));
                }

                System.out.println("i:" + i);
            }

            //(b)
            System.out.println("b");
            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < 4; j++) {
                    if (i * j > 2)
                        continue;

                    System.out.println("j: " + j);
                    System.out.println("i * j: " + (i * j));
                }

                System.out.println("i: " + i);
            }
        }

        int x = 10;
        int y = 20;

        int z = (x < y)? 1: -1;
        System.out.println(z);

         //(x < y)? System.out.println("Sipi :)"): System.out.println(":(");


    }
}
