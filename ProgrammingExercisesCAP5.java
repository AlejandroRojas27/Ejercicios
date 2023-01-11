import java.util.Scanner;

public class ProgrammingExercisesCAP5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //5.1 Count positive and negative numbers and compute the average of numbers
        /*

            System.out.println("5.1 Count positive and negative numbers and compute the average of numbers");

            System.out.println("Enter an integer, the input ends if it is 0: ");
            int numero = input.nextInt();


            float averange = 0;
            int positivos = 0;
            int negativos = 0;
            int total = 0;
            int sumaDeNumeros = 0;

            if (numero != 0) {
                while (numero != 0) {
                    total++;
                    sumaDeNumeros += numero;
                    if (numero < 0)
                        negativos++;
                    else if (numero > 0)
                        positivos++;

                    System.out.println("Enter an integer, the input ends if it is 0: ");
                    numero = input.nextInt();
                    //System.out.println("Suma: " + sumaDeNumeros);

                }
                total++;
                System.out.println("The number of positives is: " + positivos);
                System.out.println("The number of negatives is: " + negativos);
                System.out.println("The total is: " + ((double) (total)));

                averange = (float) sumaDeNumeros / (float) (total - 1);
                System.out.printf("The average is: %-10.2f", averange);

            } else
                System.out.println("No numbers are entered except 0");

         */
        System.out.println(" ");

        //5.2 Repeat additions
        /*
        System.out.println("5.2 Repeat additions");

        final int NUMBER_OF_QUESTIONS = 10; //Number of questions
        int correctCount = 0; //Count the number of correct answers
        int count = 0; //Count the number of questions
        long startTime = System.nanoTime();
        String output = " "; // output string is initially empty

        while (count < NUMBER_OF_QUESTIONS){
            // 1. Generate two random sigle-digit integers
            int number1 = (int)(1 + Math.random() * 15);
            int number2 = (int)(1 + Math.random() * 15);

            //2. If number1 < number2, swap number1 with number2
            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            //3. Prompt the student to answer "What is number1 – number2?"
            System.out.print(
                    "What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer){
                System.out.println("You are correct!");
                correctCount++; //Increase the correct answer count
            }
            else
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));

            //Increase the question count
            count++;

            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct": " wrong");
        }

        long endTime = System.nanoTime();
        long timeTest = endTime - startTime;

        System.out.println("Correct cont is " + correctCount +
                "\nTest time is " + (timeTest / 1000000000)  + " seconds\n" + output);

         */
        System.out.println(" ");

        //5.3 Conversion from kilograms to pounds
        {
            System.out.println("5.3 Conversion from kilograms to pounds");
            int kilo = 0;
            final double KILOGRAMS_TO_POUNDS = 2.2;
            System.out.printf("%-12s  %-12s\n", "Kilograms", "Pounds");

            for (kilo = 1; kilo < 10; kilo++) {
                double pounds = KILOGRAMS_TO_POUNDS * kilo;
                if (kilo % 2 == 0)
                    continue;

                System.out.printf("%1d             %-10.1f\n", kilo, pounds);
            }
        }
        System.out.println(" ");

        //5.4 Conversion from miles to kilometers
        {
            System.out.println("5.4 Conversion from miles to kilometers");
            int miles = 0;
            final double MILES_TO_KILOMETERS = 1.609;

            System.out.printf("%-12s %12s\n", "Miles", "Kilometers");

            for (miles = 1; miles < 11; miles++) {
                double kilometros = miles * MILES_TO_KILOMETERS;
                System.out.printf("%-5d        %10.3f\n", miles, kilometros);
            }

        }
        System.out.println(" ");

        //5.5 Conversion from kilograms to pounds and pounds to kilograms
        {
            System.out.println("5.5 Conversion from kilograms to pounds and pounds to kilograms");
            int kilo = 0;
            int pounds = 0;
            double poundsResultado = 0;
            double kiligramosResultado = 0;
            final double KILOGRAMS_TO_POUNDS = 2.2;
            System.out.printf("%-12s  %-12s |   %-12s  %-12s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

            for (kilo = 1, pounds = 20; kilo < 10 && pounds < 520; kilo += 2, pounds += 5) {
                poundsResultado = KILOGRAMS_TO_POUNDS * kilo;
                kiligramosResultado = pounds / KILOGRAMS_TO_POUNDS;

                System.out.printf("%1d             %-10.1f   |   %1d             %-10.2f\n"
                        , kilo, poundsResultado, pounds, kiligramosResultado);
            }
        }
        System.out.println(" ");

        //5.6 Conversion from miles to kilometers
        {
            System.out.println("5.6 Conversion from miles to kilometers");

            int kilometros = 0;
            int millas = 0;
            double kilometrosResultado = 0;
            double millasResultado = 0;
            final double MILES_TO_KILOMETERS = 1.609;
            System.out.printf("%-12s  %-12s |   %-12s  %-12s\n", "Miles", "Kilometers", "Kilometers", "Miles");

            for (kilometros = 20, millas = 1; kilometros < 70 && millas < 11; kilometros += 5, millas++) {
                kilometrosResultado = millas * MILES_TO_KILOMETERS;
                millasResultado = kilometros / MILES_TO_KILOMETERS;

                System.out.printf("%1d             %-10.3f  |   %1d             %-10.3f\n"
                        , millas, kilometrosResultado, kilometros, millasResultado);

            }

        }
        System.out.println(" ");

        //5.7 Financial application: compute future tuition
        {
            System.out.println("5.7 Financial application: compute future tuition");
            double tuition = 10000; //Year 0
            double tuitionAcumulado = 0;
            int year = 0;
            for (year = 1; year <= 10; year++) {
                tuition = tuition * 1.05;
                tuitionAcumulado += tuition;
            }
            System.out.printf("The tuition in 10 years is:  $%,10.2f\n", tuition);
            System.out.printf("the total tuition starting after the tenth year is: $%,10.2f", tuitionAcumulado);
        }
        System.out.println(" ");

        //5.8 Find the highest score
        System.out.println("5.8 Find the highest score");
        /*

            int score = 0;
            int scoreMayor = 0;
            int pruebas = 0;
            String name = "";
            String mejorAlumno = "";

            while (pruebas != 1) {
                System.out.print("Nombre: ");
                name = input.next();
                System.out.print("Score: ");
                score = input.nextInt();
                if (scoreMayor < score) {
                    scoreMayor = score;
                    mejorAlumno = name;
                }
                System.out.println("¿Continuar? (Para si 0, para No 1): ");
                pruebas = input.nextInt();
            }
            //System.out.println("Mayor score: " + scoreMayor);
            System.out.println("Mejor alumno: " + mejorAlumno);

         */
        System.out.println(" ");

        //5.9 Find the two highest scores
        System.out.println("5.9 Find the two highest scores");
        /*
        int score = 10;
        int pruebas = 1;
        int mejorScore = 0;
        int segundoMejorScore = 0;
        String name = "";
        String mejorAlumno = "";
        String segundoMejorAlumno = "";

        while (pruebas != 0){
            System.out.print("Enter name: ");
            name = input.next();
            System.out.print("Enter the score: ");
            score = input.nextInt();

            if (mejorScore < score) {
                int temp = mejorScore;
                mejorScore = score;
                segundoMejorScore = temp;
                String temp2 = mejorAlumno;
                mejorAlumno = name;
                segundoMejorAlumno = temp2;
            }
            System.out.println("¿Continuar? (1 para continuar, 0 para finalizar) ");
            pruebas = input.nextInt();
        }
        //System.out.println("Mejor score: " + mejorScore + " Segundo mejor score: " + segundoMejorScore);
        System.out.println("Mejor alumno:" + mejorAlumno + "  Segundo: " + segundoMejorAlumno);

         */
        System.out.println(" ");

        //5.10 Find numbers divisible by 5 and 6
        {
            System.out.println("5.10 Find numbers divisible by 5 and 6");
            int numero = 0;
            int count = 0;

            for (numero = 100; numero <= 1000; numero += 10) {
                if (numero % 6 == 0 && numero % 5 == 0) {
                    System.out.printf("%d ", numero);
                    count++;
                    continue;
                }
                if (count == 10) {
                    System.out.println(" ");
                    count = 0;
                    continue;
                }
            }

        }
        System.out.println(" ");

        //5.11 Find numbers divisible by 5 or 6, but not both
        {
            System.out.println("5.11 Find numbers divisible by 5 or 6, but not both");
            int numero = 0;
            int count = 0;

            for (numero = 100; numero <= 200; numero++) {
                if (numero % 6 == 0 ^ numero % 5 == 0) {
                    System.out.printf("%d ", numero);
                    count++;
                    continue;
                }
                if (count == 10) {
                    System.out.println(" ");
                    count = 0;
                    continue;
                }
            }

        }
        System.out.println(" ");

        //5.12 Find the smallest n such that n2 > 12,000
        {
            System.out.println("Find the smallest n such that n2 > 12,000");
            int n = 0;
            while ((n * n) < 12000) {
                n++;
            }
            System.out.println("n: " + n);
        }
        System.out.println(" ");

        //5.13 Find the largest n such that n3 < 12,000
        {
            System.out.println("5.13 Find the largest n such that n3 < 12,000");
            int n = 0;
            while (n < 12000) {
                if (((int) (Math.pow(n, 3)) > 12000)) {
                    System.out.println("n: " + (n - 1));
                    break;
                }
                n++;
            }
        }
        System.out.println(" ");

        //5.14 Compute the greatest common divisor
        {
            System.out.println("5.14 Compute the greatest common divisor");
            int n2 = 125;
            int n1 = 2525;
            int gcd = 0;
            int d = Math.min(n1, n2);
            ;//numero menor

            while (d != 1) {
                if (n1 % d == 0 && n2 % d == 0) {
                    gcd = d;
                    break;
                }
                d--;
            }
            System.out.println("GCD: " + gcd);
        }
        System.out.println(" ");

        //5.15 Display the ASCII character table
        {
            System.out.println("5.15 Display the ASCII character table");
            char charapter1 = '!';
            char charapter2 = '~';
            int count = 0;
            int numero1 = charapter1;
            int numero2 = charapter2;

            for (numero1 = charapter1; numero1 <= numero2; numero1++) {
                if (numero1 <= numero2) {
                    System.out.printf("%c ", numero1);
                    count++;
                }
                if (count == 10) {
                    System.out.println(" ");
                    count = 0;
                    continue;
                }
            }

        }
        System.out.println(" ");

        //5.16 Find the factors of an integer
        {
            System.out.println("5.16 Find the factors of an integer");
            // Encontrar los factores del siguiente numero
            int n = 120;
            System.out.println("Enter a integer: " + n);

            System.out.print("Factores: ");

            int count = 0;
            int number = 2;//Iniciando del primer numero primo
            int factor = 0;
            int primeNumber = 0;

            //Repeatedly find prime numbers
            while (count < n) {
                //Assume the number prime
                boolean isPrime = true;
                //Test whether number is prime
                for (int divisor = 2; divisor <= number / 2; divisor++) {
                    if (number % divisor == 0) { //If true, number is ot prime
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    count++;
                    primeNumber = number;

                    //Computo de factores
                    while (n != 1) {
                        if (n % primeNumber != 0) {
                            break;
                        }
                        if (n % primeNumber == 0) {
                            factor = primeNumber;
                            n = n / factor;
                        }
                        System.out.print(factor + ", ");
                    }

                    if (n == 1) {
                        break;
                    }

                }
                //Check if the next number is prime
                number++;
            }

        }
        System.out.println(" ");

        //5.17 Display pyramid
        {
            System.out.println("5.17 Display pyramid");
            int lineas = 3;//(int) (2 + Math.random() * 14);
            int y = 0; //Columnas
            int x = 0;
            int z = 0;
            int w = 0;
            System.out.println("Piramide");

            for (y = 1; y <= lineas; y++) {
                //System.out.print(y + "|" + "espacios" + "|");

                for (x = lineas - y; x > 0; x--) {
                    System.out.print("  ");
                }

                for (w = 2; w <= y; w++) {
                    int a = y - (lineas + 1) - w + (lineas + 3);
                    System.out.printf("%s %d", " ", a);
                }

                for (z = 1; z <= y; z++) {
                    System.out.printf("%s %d", " ", z);
                }

                System.out.println("\n");

            }

        }
        System.out.println(" ");

        //5.18 Display four patterns using loops
        {
            System.out.println("5.18 Display four patterns using loops");

            System.out.println("Pattern A");
            {
                int x = 0;
                int y = 0;
                int lineas = 6;
                for (x = 1; x <= lineas; x++) {
                    //System.out.print(x + "|");
                    for (y = 1; y <= x; y++) {
                        System.out.printf("%2d", y);
                    }
                    System.out.println("");
                }
            }

            System.out.println("Pattern B");
            {
                int x = 0;
                int y = 0;
                int lineas = 6;

                for (x = lineas; x >= 1; x--) {
                    //System.out.print(x + "|");

                    for (y = 1; y <= x; y++) {
                        System.out.printf("%2d", y);
                    }

                    System.out.println(" ");

                }
            }

            System.out.println("Pattern C");
            {
                int x = 0;
                int y = 0;
                int z = 0;
                int lineas = 6;

                for (x = 1; x <= lineas; x++) {
                    //System.out.print(x + "|");

                    for (y = (lineas - 1); y >= x; y--) {
                        System.out.printf("%2s", " ");
                    }

                    for (z = 1; z <= x; z++) {
                        int a = 0;
                        a = y - (lineas + 1) - z + (lineas + 3);
                        System.out.printf("%2d", a);
                    }

                    System.out.println(" ");

                }

            }

            System.out.println("Pattern D");
            {
                int x = 0;
                int y = 0;
                int z = 0;
                int lineas = 6;

                for (x = 1; x <= lineas; x++) {
                    //System.out.print(x + "|");

                    for (y = 2; y <= x; y++) {
                        System.out.printf("%2s", " ");
                    }


                    for (z = lineas; z >= x; z--) {
                        int a = 0;
                        a = lineas - z + 1;
                        System.out.printf("%2d", a);
                    }

                    System.out.println(" ");

                }
            }

        }
        System.out.println(" ");

        //5.19 Display numbers in a pyramid pattern
        {
            System.out.println("5.19 Display numbers in a pyramid pattern");

            int lineas = 8;

            int x = 0;
            int y = 0;
            int i = 0;
            int j = 0;
            int z = 0;
            int w = 0;

            for (x = 0, i = 0; x <= (lineas - 1); x++, i++) {

                for (y = (lineas - 1); y >= x; y--) {
                    System.out.printf("%4s", " ");
                }

                for (z = 0, j = 0; z <= x; z++, j++) {
                    if (z == 0) {
                        continue;
                    }
                    int a = j - 1;
                    int b = (int) (Math.pow(2, a));
                    System.out.printf("%4s", b);
                }

                for (y = 0, j = 0; y <= x; y++, j++) {
                    int a = i - j;
                    int b = (int) (Math.pow(2, a));
                    System.out.printf("%4s", b);
                }
                System.out.println(" ");
            }

        }
        System.out.println(" ");

        //5.20 Display prime numbers between 2 and 1,000
        {
            System.out.println("5.20 Display prime numbers between 2 and 1,000");

            final int NUMBERS_OF_PRIMES_PER_LINE = 8;
            int count = 0;
            int number = 2;
            int ultimoPrime = 1000;
            System.out.println("The prime numbers between 2 and 1,000 are ");
            //Repeatedly find prime numbers
            System.out.println("--------------------------------");
            while (number <= ultimoPrime) {
                //Assume the number prime
                boolean isPrime = true;
                //Test whether number is prime
                for (int divisor = 2; divisor <= number / 2; divisor++) {
                    if (number % divisor == 0) { //If true, number is ot prime
                        isPrime = false;
                        break;
                    }
                }
                //Display the prime number and increase the count

                if (isPrime) {
                    count++;
                    System.out.print((count % NUMBERS_OF_PRIMES_PER_LINE == 0) ? number + "\n" : number + " ");

                }
                //Check if the next number is prime
                number++;
            }
            System.out.println("--------------------------------");

            System.out.println("Total: " + count);

        }
        System.out.println(" ");

        //5.21 Financial application: compare loans with various interest rates
        {
            System.out.println("5.21 Financial application: compare loans with various interest rates");

            int loan = 10000;
            int years = 5;
            double interestRate = 5;
            double to = 8;
            final double INCREMENTO = 0.125;
            System.out.println("Loan Amount: " + loan);
            System.out.println("Numbers of Years: " + years);

            for (interestRate = interestRate; interestRate <= to; interestRate += 0.125) {
                if (interestRate == 5) {
                    System.out.printf("%10s    %10s    %10s\n", "Interest Rate", "Monthly Payment", "Total Payment");
                }
                double y = interestRate / 1200; //Monthy Interest Raste
                double x = (loan * y) / (1 - (1 / (Math.pow(1 + y, years * 12))));//MonthyPayment
                double z = x * years * 12; //Total Payment
                System.out.printf("%3.3f%c             %3.2f             %3.2f\n", interestRate, '%', x, z);

            }

        }
        System.out.println(" ");

        //5.22 Financial application: loan amortization schedule
        {
            System.out.println("5.22 Financial application: loan amortization schedule");
            int loanAmount = 10000;
            int years = 1;
            double annualInterestRate = 7;
            double m = annualInterestRate / 1200; //Monthly interest rate
            int p = 1;//Payment
            double x = (loanAmount * m) / (1 - (1 / (Math.pow(1 + m, years * 12)))); //Monthly Payment

            double balance = loanAmount;
            double principal = 0;

            for (p = 1; p <= years * 12; p++) {
                if (p == 1) {
                    System.out.printf("%s    %s    %s    %s\n", "Payment#", "Interest", "Principal", "Balance");
                }
                double interest = m * balance;
                principal = x - interest;
                balance = balance - principal;

                System.out.printf("%-10d    %3.2f        %3.2f    %3.2f\n", p, interest, principal, balance);

            }
        }
        System.out.println(" ");

        //5.23 Demonstrate cancellation errors
        {
            System.out.println("5.23 Demonstrate cancellation errors");
            double i = 1;
            double x = 0.0;
            for (i = 1.0; i <= 50000.0; i++) {
                x += 1.0 / i;
            }
            System.out.println("Resultado de izquierda  a derecha: " + x);

            double j = 1;
            double y = 0.0;
            for (j = 50000.0; j > 0; j--) {
                y += 1.0 / j;
            }
            System.out.println("Resultado de derecha a izquierda: " + y);
        }
        System.out.println(" ");

        //5.24 Sum a series
        {
            System.out.println("5.24 Sum a series");

            double x = 1.0;
            double y = 1.0;
            double a = 0.0;

            for (y = 1, x = 3; x < 100; y += 2, x += 2) {
                a += y / x;
            }
            System.out.println("Resultado de sumatoria:" + a);
        }
        System.out.println(" ");

        //5.25 Compute pi
        {
            System.out.println("5.25 Compute pi");

            double i = 1.0;
            double j = 1.0;
            double x = 1.0;
            double pi = 1.0;
            double a = 0.0;

            i = 10000.0;
            for (j = 1.0; j < i; j += 2, x++) {
                pi = 4 * (Math.pow(-1, x + 1) / (2 * x - 1));
                a += pi;

            }
            System.out.println("Cuando i:" + i + " pi:" + a);


            i = 20000.0;
            for (j = 1.0; j < i; j += 2, x++) {
                pi = 4 * (Math.pow(-1, x + 1) / (2 * x - 1));
                a += pi;

            }
            System.out.println("Cuando i:" + i + " pi:" + a);

            i = 100000.0;
            for (j = 1.0; j < i; j += 2, x++) {
                pi = 4 * (Math.pow(-1, x + 1) / (2 * x - 1));
                a += pi;

            }
            System.out.println("Cuando i:" + i + " pi:" + a);

        }
        System.out.println(" ");

        //5.26 Compute e
        {
            System.out.println("5.26 Compute e");

            {
                double i = 1.0;

                double x = 0.0;
                double e = 0.0;
                double f = 0.0;
                double y = 1.0;

                for (x = 1; x <= i; x++) {
                    if (x == 1) {
                        f = 1;
                    }
                    f = x * f;
                    e = 1 / f;
                    y += e;
                }
                //System.out.println("Para i:" + i + "e: " + (y));

                System.out.printf("Para i:%1.0f e:%2.16f\n", i, y);

            }

            {
                double i = 2.0;

                double x = 0.0;
                double e = 0.0;
                double f = 0.0;
                double y = 1.0;

                for (x = 1; x <= i; x++) {
                    if (x == 1) {
                        f = 1;
                    }
                    f = x * f;
                    e = 1 / f;
                    y += e;
                }
                //System.out.println("Para i:" + i + "e: " + (y));

                System.out.printf("Para i:%1.0f e:%2.16f\n", i, y);

            }

            {
                double i = 20.0;

                double x = 0.0;
                double e = 0.0;
                double f = 0.0;
                double y = 1.0;

                for (x = 1; x <= i; x++) {
                    if (x == 1) {
                        f = 1;
                    }
                    f = x * f;
                    e = 1 / f;
                    y += e;
                }
                //System.out.println("Para i:" + i + "e: " + (y));

                System.out.printf("Para i:%1.0f e:%2.16f\n", i, y);

            }

        }
        System.out.println(" ");

        //5.27 Display leap years
        {
            System.out.println("Display leap years");

            int yearFrom = 101;
            int yearTo = 2100;
            final int YEARS_PER_LINE = 10;
            int count = 0;

            for (yearFrom = 101; yearFrom <= yearTo; yearFrom++) {
                if ((yearFrom % 4 == 0 && yearFrom % 100 != 0) || (yearFrom % 400 == 0)) {
                    count++;
                    System.out.print(yearFrom + " ");
                    if (count % YEARS_PER_LINE == 0) {
                        System.out.print("\n");
                    }
                }
            }

            System.out.println("\nNumber of leap years in this period: " + count);

        }
        System.out.println(" ");

        //5.28 Display the first days of each month
        {
            int year = 2013;
            int day = 2;

            int meses = 12;
            String mes = " ";
            String stDay = " ";
            int daysElapsed = 1;
            int futureDay = 0;

            System.out.println("Enter a year: " + year);
            System.out.println("Enter the first day of the year (0 for Sunday, 1 for Monday, 2 for Tuesday, 3 for Wednesday,\n" +
                    "4 for Thursday, 5 for Friday , 6 for Saturday): " + day + "\n");


            final int JAN_FUTUREDAY = 31;
            int FEB_FUTUREDAY = 0;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                FEB_FUTUREDAY = 29;
            } else {
                FEB_FUTUREDAY = 28;
            }
            final int MARCH_FUTUREDAY = 31;
            final int APR_FUTUREDAY = 30;
            final int MAY_FUTUREDAY = 31;
            final int JUN_FUTUREDAY = 30;
            final int JUL_FUTUREDAY = 31;
            final int AUG_FUTUREDAY = 31;
            final int SEP_FUTUREDAY = 30;
            final int OCT_FUTUREDAY = 31;
            final int NOV_FUTUREDAY = 30;
            final int DEC_FUTUREDAY = 31;

            int y = 0;

            for (meses = 1; meses <= 12; meses++) {

                switch (meses) {
                    case 1:
                        mes = "January 1";
                        break;
                    case 2:
                        mes = "Febrary 1";
                        break;
                    case 3:
                        mes = "March 1";
                        break;
                    case 4:
                        mes = "April 1";
                        break;
                    case 5:
                        mes = "May 1";
                        break;
                    case 6:
                        mes = "June 1";
                        break;
                    case 7:
                        mes = "July 1";
                        break;
                    case 8:
                        mes = "August 1";
                        break;
                    case 9:
                        mes = "September 1";
                        break;
                    case 10:
                        mes = "October 1";
                        break;
                    case 11:
                        mes = "November 1";
                        break;
                    case 12:
                        mes = "December 1";
                        break;
                }

                switch (meses) {
                    case 1:
                        daysElapsed = day + JAN_FUTUREDAY;
                        break;
                    case 2:
                        daysElapsed = JAN_FUTUREDAY;
                        break;
                    case 3:
                        daysElapsed = FEB_FUTUREDAY;
                        break;
                    case 4:
                        daysElapsed = MARCH_FUTUREDAY;
                        break;
                    case 5:
                        daysElapsed = APR_FUTUREDAY;
                        break;
                    case 6:
                        daysElapsed = MAY_FUTUREDAY;
                        break;
                    case 7:
                        daysElapsed = JUN_FUTUREDAY;
                        break;
                    case 8:
                        daysElapsed = JUL_FUTUREDAY;
                        break;
                    case 9:
                        daysElapsed = AUG_FUTUREDAY;
                        break;
                    case 10:
                        daysElapsed = SEP_FUTUREDAY;
                        break;
                    case 11:
                        daysElapsed = OCT_FUTUREDAY;
                        break;
                    case 12:
                        daysElapsed = NOV_FUTUREDAY;
                        break;
                }

                y += daysElapsed;

                if (meses == 1) {
                    y = day;
                }
                futureDay = y % 7;

                //System.out.println("mes: " + meses + " day elapsed: " + y + " future day: " + futureDay);


                switch (futureDay) {
                    case 0:
                        stDay = " is Sunday";
                        break;
                    case 1:
                        stDay = " is Monday";
                        break;
                    case 2:
                        stDay = " is Tuesday";
                        break;
                    case 3:
                        stDay = " is Wednesday";
                        break;
                    case 4:
                        stDay = " is Thursday";
                        break;
                    case 5:
                        stDay = " is Friday";
                        break;
                    case 6:
                        stDay = " is Saturday";
                        break;

                }

                System.out.printf("%s, %d %s\n", mes, year, stDay);

            }

        }
        System.out.println(" ");

        //5.29 Display calendars
        {
            System.out.println("5.29 Display calendars");

            int year = 2013;
            int day = 2;

            int month = 0;
            int count = 0;
            int futureDay = 3;
            int daysElapsed = 31;
            int x = 0;
            int y = 0;

            final int JANUARY = 31;
            int FEBRARY = 0;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                FEBRARY = 29;
            } else {
                FEBRARY = 28;
            }
            final int MARCH = 31;
            final int APRIL = 30;
            final int MAY = 31;
            final int JUNE = 30;
            final int JULY = 31;
            final int AUGUST = 31;
            final int SEPEMBER = 30;
            final int OCTOBER = 31;
            final int NOVEMBER = 30;
            final int DECEMBER = 31;

            String sMonth = " ";

            for (month = 1; month <= 12; month++) {
                switch (month) {
                    case 1:
                        sMonth = "January";
                        break;
                    case 2:
                        sMonth = "Febrary";
                        break;
                    case 3:
                        sMonth = "March";
                        break;
                    case 4:
                        sMonth = "April";
                        break;
                    case 5:
                        sMonth = "May";
                        break;
                    case 6:
                        sMonth = "June";
                        break;
                    case 7:
                        sMonth = "July";
                        break;
                    case 8:
                        sMonth = "August";
                        break;
                    case 9:
                        sMonth = "September";
                        break;
                    case 10:
                        sMonth = "October";
                        break;
                    case 11:
                        sMonth = "Noveber";
                        break;
                    case 12:
                        sMonth = "December";
                        break;

                }
                System.out.printf("%15s\n", sMonth);
                System.out.println("__________________________");
                System.out.printf("%1s %1s %1s %1s %1s %1s %1s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "San");

                switch (month) {
                    case 1:
                        daysElapsed = day + JANUARY;
                        break;
                    case 2:
                        daysElapsed = JANUARY;
                        break;
                    case 3:
                        daysElapsed = FEBRARY;
                        break;
                    case 4:
                        daysElapsed = MARCH;
                        break;
                    case 5:
                        daysElapsed = APRIL;
                        break;
                    case 6:
                        daysElapsed = MAY;
                        break;
                    case 7:
                        daysElapsed = JUNE;
                        break;
                    case 8:
                        daysElapsed = JULY;
                        break;
                    case 9:
                        daysElapsed = AUGUST;
                        break;
                    case 10:
                        daysElapsed = SEPEMBER;
                        break;
                    case 11:
                        daysElapsed = OCTOBER;
                        break;
                    case 12:
                        daysElapsed = NOVEMBER;
                        break;
                }

                int z = 0;
                switch (month) {
                    case 1:
                        z = JANUARY;
                        break;
                    case 2:
                        z = FEBRARY;
                        break;
                    case 3:
                        z = MARCH;
                        break;
                    case 4:
                        z = APRIL;
                        break;
                    case 5:
                        z = MAY;
                        break;
                    case 6:
                        z = JUNE;
                        break;
                    case 7:
                        z = JULY;
                        break;
                    case 8:
                        z = AUGUST;
                        break;
                    case 9:
                        z = SEPEMBER;
                        break;
                    case 10:
                        z = OCTOBER;
                        break;
                    case 11:
                        z = NOVEMBER;
                        break;
                    case 12:
                        z = DECEMBER;
                        break;
                }

                y += daysElapsed;
                if (month == 1) {
                    y = day;
                }
                futureDay = y % 7;
                char espacios = ' ';
                for (x = 1; x <= futureDay; x++) {
                    System.out.printf("%4c", espacios);
                }
                for (count = 1; count <= z; count++) {
                    System.out.printf("%-4d", count);
                    if ((count + futureDay) % 7 == 0) {
                        System.out.println(" ");
                    }
                }

                System.out.println(" ");
            }

        }
        System.out.println(" ");

        //5.30 Financial application: compound value
        {
            System.out.println("5.30 Financial application: compound value");

            double amount = 100.0;
            double annualInteresRate = 5.0;
            double monthlyInterestRate = annualInteresRate / 1200.0;
            int month = 0;
            double savings = 0;
            double x = 0;
            double a = 0;

            for (month = 1; month <= 6; month++) {
                if (month == 1) {
                    x = amount;
                }
                savings = (x + savings) * (1 + monthlyInterestRate);

                if (month == 6) {
                    break;
                }
            }
            System.out.printf("Savings after %2d months is: %3.3f\n", month, savings);

        }
        System.out.println(" ");

        //5.31 Financial application: compute CD value
        {
            System.out.println("5.31 Financial application: compute CD value");

            double amount = 10000.0;
            double annualPercentageYield = 5.75;
            double monthyPercentage = annualPercentageYield / 1200;
            int months = 18; //Maturity Period
            double value = 0;
            System.out.printf("%s     %s\n", "Month", "CD Value");
            for (months = 1; months <= 18; months++) {
                double x = 0;
                if (months == 1)
                    x = amount;
                else
                    x = value;

                value = (x + x * monthyPercentage);
                System.out.printf("%3d      %10.2f\n", months, value);

            }

        }
        System.out.println(" ");

        //5.32 Game: lottery
        {
            System.out.println("5.32 Game: lottery");

            int numeroPropuesto = 23;

            int primerDigitoPropuesto = numeroPropuesto / 10;
            int segundoDigitoPropuesto = numeroPropuesto % 10;

            int primerDigitoGanador = 1 + (int) (Math.random() * 9);
            int segundoDigitoGanador = 0;
            int count;

            for (count = 0; count <= 9; count++) {
                segundoDigitoGanador = 1 + (int) (Math.random() * 9);
                if (primerDigitoGanador != segundoDigitoGanador) {
                    break;
                }
            }

            String numeroGanador = String.valueOf(primerDigitoGanador).concat(String.valueOf(segundoDigitoGanador));
            System.out.println("Numero propuesto: " + numeroPropuesto);
            System.out.println("Numero ganador: " + numeroGanador);

            //Premiacion
            if ((numeroGanador.equals(String.valueOf(numeroPropuesto))))
                System.out.println("Exact, the award is $10,000");
            else if (primerDigitoGanador * segundoDigitoGanador == primerDigitoPropuesto * segundoDigitoPropuesto) {
                System.out.println("Match all digits, the award is $3,000");
            } else if ((primerDigitoGanador == primerDigitoPropuesto) || (primerDigitoGanador == segundoDigitoPropuesto) ||
                    (segundoDigitoGanador == primerDigitoPropuesto) ||
                    (segundoDigitoGanador == segundoDigitoPropuesto)) {
                System.out.println("Match one digit, the award is $1,000");
            } else
                System.out.println("Sorry, no match");

        }
        System.out.println(" ");

        //5.33 Perfect number
        {
            System.out.println("5.33 Perfect number");

            int limite = 10000;
            int numero = 0;
            int x = 0;
            int a = 0;
            int b = 0;

            while (limite >= 2) {
                for (x = 2; x <= (limite - 1); x++) {
                    if (limite % x == 0) {
                        a = limite / x;
                        b += x;
                    }
                }
                if (limite == b) {
                    System.out.println(b + " is perfect");
                }
                b = 1;
                limite--;
            }

        }
        System.out.println(" ");

        //5.34 Game: scissor, rock, paper
        {
        System.out.println("5.34 Game: scissor, rock, paper");

        int user = 0;
        int compu = 0;
        int count = 0;
        int diferencia = 2;
        String d = " ";

        while (count != 1) {
            System.out.println("scissor (0), rock (1), paper (2)");
            System.out.println("User: ");
            int you = (int) (Math.random() * 3);
            int computer = (int) (Math.random() * 3);
            if (computer == 0) {
                d = "Scissor";
            } else if (computer == 1) {
                d = "Rock";
            } else if (computer == 2) {
                d = "Paper";
            }
            System.out.println("Computer: " + d);

            if ((you == 0) && (computer == 0)) {
                System.out.println("The computer is scissor. You are scissor too. It is a draw.");
            } else if ((you == 0) && (computer == 1)) {
                System.out.println("The computer is rock. You are scissor. Your lose.");
                compu++;
            } else if (((you == 0) && (computer == 2))) {
                System.out.println("The computer is paper. You are scissor. You win.");
                user++;
            } else if ((you == 1) && (computer == 0)) {
                System.out.println("The computer is scissor. You are rock. You win.");
                user++;
            } else if ((you == 1) && (computer == 1)) {
                System.out.println("The computer is rock. You are rock. It is a draw.");
            } else if ((you == 1) && (computer == 2)) {
                System.out.println("The computer is paper. You are rock. You lose.");
                compu++;
            } else if ((you == 2) && (computer == 0)) {
                System.out.println("The computer is scissor. You are paper. You lose.");
                compu++;

            } else if ((you == 2) && (computer == 1)) {
                System.out.println("The computer scissor. You are rock. You win.");
                user++;
            } else if ((you == 2) && (computer == 2)) {
                System.out.println("The computer scissor. You are scissor. It is a draw.");
            }
            System.out.println("User: " + user + "| Compu: " + compu);
            if (user - diferencia == computer) {
                System.out.println("Gana usuario");
                count++;
                break;
            }
            if (compu - diferencia == user) {
                System.out.println("Gana compu");
                count++;
                break;
            }
        }

        }
        System.out.println(" ");

        //5.35 Summation
        {
            System.out.println("5.35 Summation");
            double a = 1;
            double b = 0;
            double resultado = 0.0;

            for (b = 2; b <= 625; b++, a++) {
                double divisor = (Math.pow(a, 0.5) + Math.pow(b, 0.5));
                double fraccion = 1.0 / divisor;
                resultado += fraccion;
            }
            System.out.println("Resultado: " + resultado);

        }
        System.out.println(" ");

        //5.36 Business application: checking ISBN
        {
            System.out.println("5.36 Business application: checking ISBN");
            int d1 = 0;
            int d2 = 1;
            int d3 = 3;
            int d4 = 0;
            int d5 = 3;
            int d6 = 1;
            int d7 = 9;
            int d8 = 9;
            int d9 = 7;
            int d10 = 0;
            int count = 0;

            for (count = 0; count <= 10; count++) {
                d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);
                if (d10 == 10) {
                    System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
                    break;
                } else {
                    System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
                    break;
                }
            }
            System.out.println(" ");

        }
        System.out.println(" ");

        //5.37 Decimal to binary
        {
            System.out.println("5.37 Decimal to binary");
            int num = 271296;//(int) (Math.random() * 99999);
            System.out.println("Number to convert: " + num);
            String sNum = num + "";
            String bin = " ";
            int x = sNum.length();
            int y = 0;

            System.out.print("Number in binary: ");
            for (x = 1; x <= sNum.length(); x++) {
                for (y = (x); y <= x; y++) {
                    int a = Integer.parseInt(String.valueOf(sNum.charAt((y - 1))));
                    switch (a) {
                        case 0:
                            bin = "0000";
                            break;
                        case 1:
                            bin = "0001";
                            break;
                        case 2:
                            bin = "0010";
                            break;
                        case 3:
                            bin = "0011";
                            break;
                        case 4:
                            bin = "0100";
                            break;
                        case 5:
                            bin = "0101";
                            break;
                        case 6:
                            bin = "0110";
                            break;
                        case 7:
                            bin = "0111";
                            break;
                        case 8:
                            bin = "1000";
                            break;
                        case 9:
                            bin = "1001";
                            break;

                    }
                    //System.out.print("|a: " + a + "|bin: " + bin);
                    System.out.printf("%4s ", bin);
                }
            }
        }
        System.out.println(" ");

        //5.38 Decimal to octal
        {
            System.out.println("5.38 Decimal to octal");
            int num = 271296;
            System.out.println("Number to convert: " + num);
            String sNum = num + "";
            int x = sNum.length();
            int y = 0;
            int oct = 0;
            int count = 0;
            int a = 0;
            int b = 0;

            for (x = 1; x <= 1; x++) {
                for (y = 1; y <= sNum.length() + 1; y++, count++) {
                    a = (int) (Math.pow(10, count));
                    oct = num % 8;
                    num = num / 8;
                    b += oct * a;
                }
            }
            System.out.println("Number in octal: " + b);
        }
        System.out.println(" ");

        //5.39 Financial application: find the sales amount
        {
            System.out.println("5.39 Financial application: find the sales amount");

            int goal = 30000;
            int x = 0;
            double commissionRate1 = 0.08;
            double commissionRate2 = 0.10;
            double commissionRate3 = 0.12;

            double saleAmount1 = 0;
            double saleAmount2 = 0;
            double saleAmount3 = 0;

            if (goal > 1 && goal <= 5000 || goal > 5000)
                saleAmount1 = 5000 * commissionRate1;

            if (goal > 5001 && goal <= 10000 || goal > 10000)
                saleAmount2 = 5000 * commissionRate2;

            if (goal >= 10001)
                saleAmount3 = (goal - saleAmount1 - saleAmount2) / 0.12;

            System.out.println("Commission necessary: " +
                    (saleAmount3 + (saleAmount2 / commissionRate2) + (saleAmount1 / commissionRate1)));

        }
        System.out.println(" ");

        //5.40 Simulation: heads or tails
        {
            System.out.println("5.40 Simulation: heads or tails");

            int limite = 1000000;
            int head = 0;
            int tail = 0;
            for (int x = limite; x > 0; x--) {
                int test = (int) (Math.random() * 2);
                if (test == 1) {
                    head++;
                }
                if (test == 0) {
                    tail++;
                }
            }
            System.out.println("Head: " + head + "| Tail: " + tail);

        }
        System.out.println(" ");

        //5.41 Occurrence of max numbers
        System.out.println("5.41 Occurrence of max numbers");
        /*

        int num = 0;
        int sentinel = 0;
        int max = 0;
        int x = 0;
        int count = 1;
        for(sentinel=1;sentinel!=0;sentinel = input.nextInt()){
            x = max;
            System.out.println("Enter a number:");
            num = input.nextInt();
            max = Math.max(x,num);
            if (x < max){
                count=1;
            }
            if (max == num && x == max){
                count++;
            }
            System.out.println(sentinel + "| num: " + num + " x: " + x + " max: " + max + " count: " + count);
            System.out.println("You want to continue yes (1) or no(0)?");
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is: " + count);

         */
        System.out.println(" ");

        //5.42 Financial application: find the sales amount
        {
            System.out.println("5.42 Financial application: find the sales amount");
            final double COMMISSION_SOUGHT = 30000.0;
            double saleAmount = 0;
            double commissionRate1 = 0.08;
            double commissionRate2 = 0.10;
            double commissionRate3 = 0.12;
            double saleAmount1 = 0;
            double saleAmount2 = 0;
            double saleAmount3 = 0;

            for (saleAmount = 1; saleAmount != COMMISSION_SOUGHT; saleAmount++) {

                if (COMMISSION_SOUGHT > 1 && COMMISSION_SOUGHT <= 5000 || COMMISSION_SOUGHT > 5000)
                    saleAmount1 = 5000 * commissionRate1;

                if (COMMISSION_SOUGHT > 5001 && COMMISSION_SOUGHT <= 10000 || COMMISSION_SOUGHT > 10000)
                    saleAmount2 = 5000 * commissionRate2;
                if (COMMISSION_SOUGHT >= 10001)
                    saleAmount3 = (COMMISSION_SOUGHT - saleAmount1 - saleAmount2) / 0.12;
            }
            double x = (saleAmount3 + (saleAmount2 / commissionRate2) + (saleAmount1 / commissionRate1));
            System.out.println("Commission necessary: " + x);

        }
        System.out.println(" ");

        //5.43 Math: combinations
        {
            System.out.println("5.43 Math: combinations");
            int x = 0;
            int y = 0;
            int z = 0;

            for (x = 1; x <= 7; x++) {
                for (y = (x + 1); y <= 7; y++, z++) {
                    System.out.println(x + " " + y);
                }
            }
            System.out.println("The total number of all combinations is: " + z);
        }
        System.out.println(" ");

        //5.44 Computer architecture: bit-level operations
        {
            System.out.println("Computer architecture: bit-level operations");
            int num = 5;
            int x = 0;
            int y = 1;

            for (x = 15; x >= 0; x--) {
                int a = num >> x;
                int bit = a & y;
                System.out.print(bit);
            }

        }
        System.out.println(" ");

        //5.45 Statistics: compute mean and standard deviation
        System.out.println("5.45 Statistics: compute mean and standard deviation");
        /*

        double numero = 0;
        int sentinel = 0;
        double count = 0;
        double mean = 0;
        double a = 0;
        double b = 0;
        double deviation = 0;

        for (sentinel=1;sentinel>0;sentinel = input.nextInt()){
            System.out.println("Enter a number: ");
            numero = input.nextDouble();
            a+=numero;
            b+=Math.pow(numero,2);
            count++;
            mean = a / count;
            deviation = Math.pow((((b) - ((Math.pow(a,2)) / count)) / (count-1)),0.5);
            System.out.println("Continue? (1 for yes, 0 for no)");
        }

        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);

         */
        System.out.println(" ");

        //5.46 Reverse a string
        {
            System.out.println("5.46 Reverse a string");
            String word = "ABCD";
            System.out.println("Enter a string: " + word);
            int x = word.length();
            int y = 0;
            System.out.print("The reversed string is: ");
            for (y = x - 1; y >= 0; y--) {
                System.out.print(word.charAt(y));
            }
        }
        System.out.println(" ");

        //5.47 Business: check ISBN-13
        {
            System.out.println("5.47 Business: check ISBN-13");
            String isbm = "978013213079";
            int length = isbm.length();
            int x = 0;
            int z = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            System.out.println("Enter the first 12 digits of an ISBN-13 as a string: " + isbm);
            for (x = 0, z = 1; x < length; x += 2, z += 2) {
                if (length != 12) {
                    System.out.println(isbm + "  is an invalid input");
                    break;
                }
                int y = Integer.parseInt(String.valueOf(isbm.charAt(x)));
                int w = Integer.parseInt(String.valueOf(isbm.charAt(z)));
                a += y;
                b += w * 3;
                c = a + b;
                d = 10 - c % 10;
                if (d == 10) {
                    d = 0;
                }
                if (z == 11) {
                    String d13 = d + "";
                    System.out.println("The ISBN-13 number is " + isbm.concat(d13));
                }
            }
        }
        System.out.println(" ");

        //5.48 Process string
        {
            System.out.println("5.48 Process string");
            String word = "Beijing Chicago";
            int x = word.length();
            int y = 0;
            System.out.println("Enter a string: " + word);
            for (y = 0; y <= x; y += 2) {
                char letter = word.charAt(y);
                System.out.print(letter);
            }
        }
        System.out.println(" ");

        //5.49 Count vowels and consonants
        {
            System.out.println("5.49 Count vowels and consonants");
            String word = "Programming is fun";

            int x = word.length();
            int y = 0;
            int count = 0;
            int vowel = 0;
            int space = 0;
            char ch = ' ';
            System.out.println("Enter a string: " + word);

            for (y = 0; y < x; y++) {
                ch = word.toUpperCase().charAt(y);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel++;
                } else if (ch == ' ') {
                    space++;
                }
            }
            System.out.println("The number of vowels is " + vowel);
            System.out.println("The number of consonants is " + (x - vowel - space));

        }
        System.out.println(" ");

        //5.50 Count uppercase letters
        {
            System.out.println("5.50 Count uppercase letters");
            String word = "Welcome to Java";
            int x = word.length();
            int y = 0;
            int count = 0;

            for (y = 0; y < x; y++) {
                char ch = word.charAt(y);
                char ch1 = word.toUpperCase().charAt(y);
                if (ch == ch1 && ch != ' ') {
                    count++;
                }
            }
            System.out.println("The number of uppercase letters is " + count);
        }
        System.out.println(" ");

        //5.51 Longest common prefix
        {
            System.out.println("5.51 Longest common prefix");
            String word1 = "Atlanta";//"Welcome to C++";
            String word2 = "Macon";//"Welcome to programming";
            int lenght1 = word1.length();
            int lenght2 = word2.length();
            int lenghtMin = Math.min(lenght1, lenght2);
            int y = 0;
            int count = 0;
            System.out.println("Enter the first string: " + word1);
            System.out.println("Enter the second string: " + word2);

            for (y = 0; y < lenghtMin; y++) {
                char ch1 = word1.charAt(y);
                char ch2 = word2.charAt(y);
                if (ch1 == ch2) {
                    count++;
                }
                if (count != (y + 1)) {
                    break;
                }
            }
            if (count > 0) {
                System.out.println("The common prefix is " + word1.substring(0, count));
            } else if (count == 0) {
                System.out.println(word1 + " and " + word2 + " have no common prefix");
            }
        }
        System.out.println(" ");



















        }

}
