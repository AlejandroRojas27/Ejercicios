import java.util.Scanner;

public class ProgrammingExercisesCAP3 {
    public static void main(String[] args) {
        //Create scanner
        Scanner input = new Scanner(System.in);

        //Ejercicio 3.1
        {
            System.out.println("Ejercicio 3.1");

            //Valores
            int a = 1;
            int b = 2;
            int c = 3;

            //Compute area
            double discriminante = b * b - 4 * a * c;
            double raiz1 = ((-b + Math.pow(discriminante, 0.5)) / (2 * a));
            double raiz2 = ((-b - Math.pow(discriminante, 0.5)) / (2 * a));

            //Resultados
            System.out.println("a: " + a + ", b: " + b + ", c: " + c);
            //System.out.println("Discriminante b * b - 4 * a * c: " + discriminante);

            //If..
            if ((discriminante) > 0)
                System.out.println("The equation has two roots: " + (int) (raiz1 * 1000000) / 1000000.0
                        + " and " + (int) (raiz2 * 1000000) / 1000000.0);
            else if ((discriminante) == 0)
                System.out.println("The equation has one root : " + raiz1);
            else
                System.out.println("The equation has no real roots");
        }

        //Ejercicio 3.2
        {
            System.out.println("Ejercicio 3.2");

            int number1 = (int) (1 + Math.random() * 8);
            int number2 = (int) (1 + Math.random() * 8);
            int number3 = (int) (1 + Math.random() * 8);


            System.out.println("What is " + number1 + " + " + number2 + " + " +
                    number3 + "? ");

            int answer = number1 + number2 + number3;

            System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is "
                    + (number1 + number2 + number3 == answer));
        }

        //Ejercicio 3.3
        {
            System.out.println("Ejercicio 3.3");

            //Valores de la primera ecuacuion
            int a = 9;
            int b = 4;
            int c = 3;
            //Valores de la segunda ecuacuion
            int d = -5;
            int e = -6;
            int f = -21;


            if (((a * d) - (b * c)) == 0)
                System.out.println("The equation has no solution.");
            else
                System.out.println("x: " + (((e * d) - (b * f)) / ((a * d) - (b * c))));
            System.out.println("y: " + (((a * f) - (e * c)) / ((a * d) - (b * c))));

        }

        //Ejercicio 3.4
        {
            System.out.println("Ejercicio 3.4");

            int mountNumber = (int) (1 + Math.random() * 11);
            System.out.println("Mount: " + mountNumber);

            switch (mountNumber) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("Febrary");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");

            }

        }

        //Ejercicio 3.5
        {
            System.out.println("Ejercicio 3.5");
            int dayOfTheWeek = 0;
            int daysElapsed = 31;

            int futureday = ((dayOfTheWeek + daysElapsed) % 7);

            switch (dayOfTheWeek) {
                case 0:
                    System.out.print("Today is Sunday and ");
                    break;
                case 1:
                    System.out.print("Today is Monday and ");
                    break;
                case 2:
                    System.out.print("Today is Tuesday and ");
                    break;
                case 3:
                    System.out.print("Today is Wednesday and ");
                    break;
                case 4:
                    System.out.print("Today is Thursday and ");
                    break;
                case 5:
                    System.out.print("Today is Friday and ");
                    break;
                case 6:
                    System.out.print("Today is Saturday and ");
                    break;
            }

            switch (futureday) {
                case 0:
                    System.out.println("the future day is Sunday");
                    break;
                case 1:
                    System.out.println("the future day is Monday");
                    break;
                case 2:
                    System.out.println("the future day is Tuesday");
                    break;
                case 3:
                    System.out.println("the future day is Wednesday");
                    break;
                case 4:
                    System.out.println("the future day is Thursday");
                    break;
                case 5:
                    System.out.println("the future day is Friday");
                    break;
                case 6:
                    System.out.println("the future day is Saturday");
                    break;

            }

        }

        //Ejercicio 3.6
        {
            System.out.println("Ejercicio 3.6");

            // Prompt the user to enter weight in pounds
            double weight = 140; //Math.random() * 300;
            System.out.println("Enter weight in pounds: " + (int) weight);

            // Prompt the user to enter height in feets and inches
            double feet = 5;
            double inches = 10;//Math.random() * 100;
            System.out.println("Enter height in feets: " + (int) feet + " and inches " + (int) inches);
            final double KILOGRAMS_PER_POUND = 0.45359237;
            final double METERS_PER_INCH = 0.0254;

            double kilograms = weight * KILOGRAMS_PER_POUND;
            double meters = ((feet * 12) + inches) * METERS_PER_INCH;
            double bmi = kilograms / (Math.pow(meters, 2));
            System.out.println("BMI is: " + bmi);

            //Display result
            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25)
                System.out.println("Normal");
            else if (bmi < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");

        }

        //Ejercicio 3.7
        {
            System.out.println("Ejercicio 3.7");

            System.out.print("Amount: $");
            double amount = 1.21;

            int remainingAmount = (int) (amount * 100);

            //Find the number of one dollars
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            //Results
            System.out.println("Amout " + amount + " consists of");
            if (numberOfOneDollars == 1)
                System.out.println(" " + numberOfOneDollars + " dollar");
            else
                System.out.println(" " + numberOfOneDollars + " dollars");

            if (numberOfPennies == 1)
                System.out.println(" " + numberOfPennies + " penny");
            else
                System.out.println(" " + numberOfPennies + " pennies");

        }

        //Ejercicio 3.8
        {
            System.out.println("Ejercicio 3.8");

            int primerNumero = (int) (1 + Math.random() * 10);
            int segundoNumero = (int) (1 + Math.random() * 10);
            int tercerNumero = (int) (1 + Math.random() * 10);
            System.out.println("Primer numero: " + primerNumero + " Segundo numero: " + segundoNumero +
                    " Tercer numero: " + tercerNumero);

            System.out.println("Orden de mayor a menor");

            {
                if ((primerNumero > segundoNumero) && (primerNumero > tercerNumero))
                    System.out.println("Primer numero: " + primerNumero);
                else if ((segundoNumero > primerNumero) && (segundoNumero > tercerNumero))
                    System.out.println("Segundo numero: " + segundoNumero);
                else if ((tercerNumero > primerNumero) && (tercerNumero > segundoNumero))
                    System.out.println("Tercer numero: " + tercerNumero);
                else if ((tercerNumero == segundoNumero))
                    System.out.println("Segundo numero: " + segundoNumero);
                else if ((primerNumero == tercerNumero))
                    System.out.println("Tercer numero: " + tercerNumero);
            }

            {
                if ((primerNumero < segundoNumero) && (primerNumero > tercerNumero))
                    System.out.println("Primer numero: " + primerNumero);
                else if ((primerNumero > segundoNumero) && (primerNumero < tercerNumero))
                    System.out.println("Primer numero: " + primerNumero);
                else if ((segundoNumero < primerNumero) && (segundoNumero > tercerNumero))
                    System.out.println("Segundo numero: " + segundoNumero);
                else if ((segundoNumero > primerNumero) && (segundoNumero < tercerNumero))
                    System.out.println("Segundo numero: " + segundoNumero);
                else if ((tercerNumero < primerNumero) && (tercerNumero > segundoNumero))
                    System.out.println("Tercer numero: " + tercerNumero);
                else if ((tercerNumero > primerNumero) && (tercerNumero < segundoNumero))
                    System.out.println("Tercer numero: " + tercerNumero);
                else if ((primerNumero == segundoNumero)) {
                    System.out.println("Primer numero: " + primerNumero);
                    System.out.println("Segundo numero: " + segundoNumero);
                } else if ((primerNumero == tercerNumero)) {
                    System.out.println("Primer numero: " + primerNumero);
                    System.out.println("Tercer numero: " + tercerNumero);
                } else if ((segundoNumero == tercerNumero)) {
                    System.out.println("Segundo numero: " + segundoNumero);
                    System.out.println("Tercer numero: " + tercerNumero);
                }

            }

            {
                if ((primerNumero < segundoNumero) && (primerNumero < tercerNumero))
                    System.out.println("Primer numero: " + primerNumero);
                else if ((segundoNumero < primerNumero) && (segundoNumero < tercerNumero))
                    System.out.println("Segundo numero: " + segundoNumero);
                else if ((tercerNumero < primerNumero) && (tercerNumero < segundoNumero))
                    System.out.println("Tercer numero: " + tercerNumero);
            }
        }

        //Ejercicio 3.9
        {
            System.out.println("Ejercicio 3.9");
            int d1 = 0;
            int d2 = 1;
            int d3 = 3;
            int d4 = 0;
            int d5 = 3;
            int d6 = 1;
            int d7 = 9;
            int d8 = 9;
            int d9 = 7;
            int d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);

            System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);

            if (d10 == 10)
                System.out.println("X");
            else
                System.out.println(d10);
        }

        //Ejercicio 3.10
        {
            System.out.println("Ejercicio 3.10");

            // 1. Generate random single-digit integers
            int number1 = (int) (10 + Math.random() * 89);
            int number2 = (int) (10 + Math.random() * 89);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer "What is number1 – number2?"
            System.out.print("What is " + number1 + "-" + number2 + "? ");
            int answer = 10;//input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 - number2 == answer)
                System.out.println("You are correct!");
            else {
                System.out.println("Your answer is wrong");
                System.out.println(number1 + "-" + number2 + " should be " + (number1 - number2));
            }
        }

        //Ejercicio 3.11
        {
            System.out.println("Ejercicio 3.11");
            int mounth = (int) (1 + Math.random() * 11);
            int year = (int) (1900 + Math.random() * 150);

            switch (mounth) {
                case 1:
                    System.out.print("January " + year + " has ");
                    break;
                case 2:
                    System.out.print("Febrary " + year + " has ");
                    break;
                case 3:
                    System.out.print("March " + year + " has ");
                    break;
                case 4:
                    System.out.print("April " + year + " has ");
                    break;
                case 5:
                    System.out.print("May " + year + " has ");
                    break;
                case 6:
                    System.out.print("June " + year + " has ");
                    break;
                case 7:
                    System.out.print("July " + year + " has ");
                    break;
                case 8:
                    System.out.print("August " + year + " has ");
                    break;
                case 9:
                    System.out.print("September " + year + " has ");
                    break;
                case 10:
                    System.out.print("October " + year + " has ");
                    break;
                case 11:
                    System.out.print("November " + year + " has ");
                    break;
                case 12:
                    System.out.print("December " + year + " has ");
                    break;

            }

            switch (mounth) {
                case 1:
                    System.out.println("31 days");
                    break;
                case 2:
                    if ((year % 4 == 0) ^ (year % 100 == 0))
                        System.out.println("29 days");
                    else if (year % 400 == 0)
                        System.out.println("29 days");
                    else
                        System.out.println("28 days");
                    break;

                case 3:
                    System.out.println("31 days");
                    break;
                case 4:
                    System.out.println("30 days");
                    break;
                case 5:
                    System.out.println("31 days");
                    break;
                case 6:
                    System.out.println("30 days");
                    break;
                case 7:
                    System.out.println("31 days");
                    break;
                case 8:
                    System.out.println("31 days");
                    break;
                case 9:
                    System.out.println("30 days");
                    break;
                case 10:
                    System.out.println("31 days");
                    break;
                case 11:
                    System.out.println("30 days");
                    break;
                case 12:
                    System.out.println("31 days");
                    break;

            }

        }

        //Ejercicio 3.12
        {
            System.out.println("Ejercicio 3.12");

            int numero = (int) (99 + Math.random() * 900);
            System.out.println("Numero: " + numero);

            int numeroCentenas = numero / 100;
            int numeroDecenas = numero % 10;

            if (numeroCentenas == numeroDecenas)
                System.out.println(numero + " is a palindrome");
            else
                System.out.println(numero + " is not a palindrome");

        }

        //Ejercicio 3.13
        {
            System.out.println("Ejercicio 3.13");

            //Filing statuses

            System.out.println("Filing statuses");
            System.out.println("Enter:");
            System.out.println("0 for single filers ");
            System.out.println("1 for married filing jointly or qualified widow(er)");
            System.out.println("2 for married filing separately");
            System.out.println("3 for head of household");
            System.out.print("What is your status? ");
            int status = 3; //input.nextInt();

            double income = 400000;
            System.out.println("For a income of: " + income);

            double tax = 0;

            //For single filers
            if (status == 0) {
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 82250)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                else if (income <= 171550)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                else if (income <= 372950)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                            (income - 171550) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                            (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            } else if (status == 1) {
                if (income <= 16700)
                    tax = income * 0.10;
                else if (income <= 67900)
                    tax = 16700 * 0.10 + (income - 16700) * 0.15;
                else if (income <= 137050)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
                else if (income <= 208850)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
                else if (income <= 372950)
                    tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 + 137050) * 0.28 +
                            (income - 208850) * 0.33;
                else tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) +
                            (372950 - 208850) * 0.33 + (income - 372950);
            } else if (status == 2) {
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 68525)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                else if (income <= 104425)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
                else if (income <= 186475)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                            (income - 186475) * 0.33;
                else tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                            (185475 - 104425) * 0.33 + (income - 186476);
            } else if (status == 3) {
                if (income <= 11950)
                    tax = income * 0.10;
                else if (income <= 45500)
                    tax = 11950 * 0.10 + (income - 11950) * 0.15;
                else if (income <= 117450)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
                else if (income <= 190200)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
                else if (income <= 372950)
                    tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                            (income - 190200) * 0.33;
                else tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                            (372950 - 190200) * 0.33 + (income - 372950);
            } else {
                System.out.println("Error: invalid status");
                System.exit(1);
            }

            System.out.println("Your total tax is: " + (int) (tax * 100) / 100.0);

        }

        //Ejercicio 3.14
        {
            System.out.println("Ejercicio 3.14");

            int coin = (int) (Math.random() * 2);
            System.out.println("HEAD OR TAIL? (head = 0, tail = 1): ");
            int guess = 1;//input.nextInt();
            System.out.println(coin);

            if ((coin == 0) && (guess == 0))
                System.out.println("Correct, the answer is HEAD");
            else if ((coin == 1) && (guess == 1))
                System.out.println("Correct, the answer is TAIL");
            else if ((coin == 1) && (guess == 0))
                System.out.println("Incorrect, the answer is HEAD");
            else if ((coin == 0) && (guess == 1))
                System.out.println("Incorrect, the answer is TAIL");

        }

        //Ejercicio 3.15
        {
            System.out.println("Ejercicio 3.15");

            int numeroPropuesto = 634;//(int)(100 + Math.random() * 899);//input.nextInt();
            System.out.println("Numero participante: " + numeroPropuesto);

            int primerDigitoPropuesto = numeroPropuesto / 100;
            int segundoDigitoPropuesto = numeroPropuesto / 10 % 10;
            int tercerDigitoPropuesto = numeroPropuesto % 10;


            int numeroGanador = 644;//(int)(100 + Math.random() * 899);
            System.out.println("Numero ganador: " + numeroGanador);
            int primerDigitoGanador = numeroGanador / 100;
            int segundoDigitoGanador = numeroGanador / 10 % 10;
            int tercerDigitoGanador = numeroGanador % 10;

            //Premiacion

            if (numeroGanador == numeroPropuesto)
                System.out.println("Exact, the award is $10,000");
            else if ((primerDigitoGanador * segundoDigitoGanador * tercerDigitoGanador) == (primerDigitoPropuesto *
                    segundoDigitoPropuesto * tercerDigitoPropuesto))
                System.out.println("Match all digits, the award is $3,000");
            else if (((primerDigitoGanador == primerDigitoPropuesto) || (primerDigitoGanador == segundoDigitoPropuesto) ||
                    (primerDigitoGanador == tercerDigitoPropuesto)) || ((segundoDigitoGanador == primerDigitoPropuesto) ||
                    (segundoDigitoGanador == segundoDigitoPropuesto) || (segundoDigitoGanador == tercerDigitoPropuesto)) ||
                    ((tercerDigitoGanador == primerDigitoPropuesto) || (tercerDigitoGanador == segundoDigitoPropuesto) ||
                            (tercerDigitoGanador == tercerDigitoPropuesto)))
                System.out.println("Match one digit, the award is $1,000");
            else
                System.out.println("Sorry, no match");
        }

        //Ejercicio 3.16
        {
            System.out.println("//Ejercicio 3.16");

            int x = (int) (-50 + Math.random() * 100);
            int y = (int) (-100 + Math.random() * 200);

            System.out.println("Cordenadas dentro del un rectangulo de 200 altura y 100 de ancho");
            System.out.println("X: " + x);
            System.out.println("Y: " + y);

        }

        //Ejercicio 3.17
        {
            System.out.println("Ejercicio 3.17");

            int you = (int) (Math.random() * 3);
            System.out.println("scissor (0), rock (1), paper (2): " + you);

            int computer = (int) (Math.random() * 3);
            System.out.println("Computer: " + computer);


            if ((you == 0) && (computer == 0))
                System.out.println("The computer is scissor. You are scissor too. It is a draw.");
            else if ((you == 0) && (computer == 1))
                System.out.println("The computer is rock. You are scissor. Your lose.");
            else if (((you == 0) && (computer == 2)))
                System.out.println("The computer is paper. You are scissor. You win.");
            else if ((you == 1) && (computer == 0))
                System.out.println("The computer is scissor. You are rock. You win.");
            else if ((you == 1) && (computer == 1))
                System.out.println("The computer is rock. You are rock. It is a draw.");
            else if ((you == 1) && (computer == 2))
                System.out.println("The computer is paper. You are rock. You lose.");
            else if ((you == 2) && (computer == 0))
                System.out.println("The computer is scissor. You are paper. You lose.");
            else if ((you == 2) && (computer == 1))
                System.out.println("The computer scissor. You are rock. You win.");
            else if ((you == 2) && (computer == 2))
                System.out.println("The computer scissor. You are scissor. It is a draw.");
        }

        //Ejercicio 3.18
        {
            System.out.println("Ejercicio 3.18");
            double w = 20;
            double cost = 0;

            if (w <= 0)
                System.out.println("Invalid input");
            else if ((w > 0) && (w <= 1)) {
                cost = 3.5;
                System.out.println("The cost is: " + (cost * w));
            } else if ((w > 1) && (w <= 3)) {
                cost = 5.5;
                System.out.println("The cost is: " + (cost * w));
            } else if ((w > 3) && (w <= 10)) {
                cost = 8.5;
                System.out.println("The cost is: " + (cost * w));
            } else if ((w > 10) && (w <= 20)) {
                cost = 10.5;
                System.out.println("The cost is: " + (cost * w));
            } else if (w > 20)
                System.out.println("Cannot be shippet");

        }

        //Ejercicio 3.19
        {
            System.out.println("Ejercicio 3.19");

            int edge1 = 7;
            int edge2 = 5;
            int edge3 = 3;
            int perimeter = 0;

            if (((edge1 + edge2) > edge3) && ((edge1 + edge3) > edge2) && ((edge2 + edge3) > edge1))
                System.out.println("Perimeter is: " + (edge1 + edge2 + edge3));
            else
                System.out.println("The input is invalid");

        }

        //Ejercicio 3.20
        {
            System.out.println("Ejercicio 3.20");
            double temperatura = 5.3;
            double windSpeed = 6;

            double twc = 35.74 + 0.6215 * temperatura - 35.75 * Math.pow(windSpeed, 0.16) +
                    0.4275 * temperatura * Math.pow(windSpeed, 0.16);

            if (((temperatura < -58) ^ (temperatura > 41)) && (windSpeed < 2))
                System.out.println("Temperature and wind speed are invalid");
            else if (windSpeed < 2)
                System.out.println("Wind speed is invalid");
            else if ((temperatura < -58) ^ (temperatura > 41))
                System.out.println("Temperature is invalid");
            else
                System.out.println("The wind chill index is: " + (int) (twc * 100000) / 100000.0);
        }

        //Ejercicio 3.21
        {
            System.out.println("Ejercicio 3.21");

            int year = 2022;
            System.out.println("Enter year: " + year);
            int month = 10;
            System.out.println("Enter month: " + month);
            int dayOfTheMonth = 1;
            System.out.println("Enter day of the month: " + dayOfTheMonth);


            if (month == 1) {
                month = 13;
                year = year - 1;
            } else if (month == 2) {
                month = 14;
                year = year - 1;
            }

            int q = dayOfTheMonth;
            int m = month;
            int j = year / 100;
            int k = year % 100;

            int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

            System.out.println("q: " + q);
            System.out.println("m: " + m);
            System.out.println("j: " + j);
            System.out.println("k: " + k);

            System.out.println("h: " + h);

            switch (h) {
                case 0:
                    System.out.print("Day of the week is Saturday");
                    break;
                case 1:
                    System.out.print("Day of the week is Sunday");
                    break;
                case 2:
                    System.out.print("Day of the week is Monday");
                    break;
                case 3:
                    System.out.print("Day of the week is Tuesday");
                    break;
                case 4:
                    System.out.print("Day of the week is Wednesday ");
                    break;
                case 5:
                    System.out.print("Day of the week is Thursday");
                    break;
                case 6:
                    System.out.print("Day of the week is Friday");
                    break;

            }

        }

        //Ejercicio 3.22
        {
            System.out.println("Ejercicio 3.22");
            System.out.println("In a circle centered at (0, 0) with radius 10.");
            int x = (int) (-10 + Math.random() * 20);
            int y = (int) (-10 + Math.random() * 20);
            System.out.println("Enter the coordinate x: " + x);
            System.out.println("Enter the coordinate y: " + y);

            int distance = (int) (Math.pow((Math.pow(x, 2)) + (Math.pow(y, 2)), 0.5));
            if (distance < 10)
                System.out.println("Point (" + x + " , " + y + ") is in the circle");
            else
                System.out.println("Point (" + x + " , " + y + ") is not in the circle");

        }

        //Ejercicio 3.23
        {
            System.out.println("Ejercicio 3.23");
            System.out.println("For a rectangle centered at (0, 0), with width 10 and height 5. ");
            double x = -5.1;
            double y = -2.4;

            if (((x > -5.0) && (x < 5)) && ((y > -2.5) && (y < 2.5)))
                System.out.println("Point (" + x + " , " + y + ") is in the rectangle");
            else
                System.out.println("Point (" + x + " , " + y + ") is not in the rectangle");
        }

        //Ejercicio 3.24
        {
            System.out.println("Ejercicio 3.24");

            int rank = (int) (1 + Math.random() * 13);
            int suit = (int) (1 + Math.random() * 4);

            switch (rank) {
                case 1:
                    System.out.print("The card you picked is Ace of ");
                    break;
                case 2:
                    System.out.print("The card you picked is 2 of ");
                    break;
                case 3:
                    System.out.print("The card you picked is 3 of ");
                    break;
                case 4:
                    System.out.print("The card you picked is 4 of ");
                    break;
                case 5:
                    System.out.print("The card you picked is 5 of ");
                    break;
                case 6:
                    System.out.print("The card you picked is 6 of ");
                    break;
                case 7:
                    System.out.print("The card you picked is 7 of ");
                    break;
                case 8:
                    System.out.print("The card you picked is 8 of ");
                    break;
                case 9:
                    System.out.print("The card you picked is 9 of ");
                    break;
                case 10:
                    System.out.print("The card you picked is 10 of ");
                    break;
                case 11:
                    System.out.print("The card you picked is Jack of ");
                    break;
                case 12:
                    System.out.print("The card you picked is Queen of ");
                    break;
                case 13:
                    System.out.print("The card you picked is King of ");
                    break;
            }

            switch (suit) {
                case 1:
                    System.out.println("Clubs");
                    break;
                case 2:
                    System.out.println("Diamonds");
                    break;
                case 3:
                    System.out.println("Hearts");
                    break;
                case 4:
                    System.out.println("Spades");
                    break;
            }

        }

        //Ejercicio 3.25
        {
            System.out.println("Ejercicio 3.25");

            //Primera recta
            double x1 = 0;
            double y1 = 100;
            double x2 = 200;
            double y2 = 0;

            //Segunda recta
            double x3 = 100.5;
            double y3 = 25.5;
            double x4 = 0;
            double y4 = 0;

            //Ecuacion de la recta
            double x = 1;
            double y = 1;
            //Primera ecuacion
            double m1 = (y2 - y1) / (x2 - x1);
            double a = m1 * x;
            double b = y * -1;
            double e = (y1 + (-x1 * m1)) * -1;
            System.out.println(a + "x " + b + "y = " + e);

            //Segunda ecuacion
            double m2 = (y4 - y3) / (x4 - x3);
            double c = m2 * x;
            double d = y * -1;
            double f = (y3 + (-x3 * m2)) * -1;
            System.out.println(c + "x " + d + "y = " + f);

            //Para Cramer

            /*
            double a = 1;//(y1 - y2);
            double b = 1;//(x1 - x2);
            double c = 0.8;//(y3 -y4);
            double d = -1;//(x3 - x4);
            double e = 4;//((y1 - y2) * x1) - ((x1 - x2) * y1);
            double f = 1.2;//((y3 - y4) * x3) - ((x3 - x4) * y3);


            System.out.println("a: " + a + ", b: " + b + ", e: " + e);
            System.out.println("c: " + c + ", d: " + d + ", f: " + f);

            System.out.println(a + "x +" + b + "y =" + e);
            System.out.println(c + "x + " + d + "y =" + f);

             */

            double puntoInterseccionX = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double puntoInterseccionY = ((a * f) - (e * c)) / ((a * d) - (b * c));

            if (((a * d) - (b * c)) == 0)
                System.out.println("The two lines are parallel");
            else
                System.out.println("The intersecting point is at (" + puntoInterseccionX
                        + " , " + puntoInterseccionY + ")");
        }

        //Ejercicio 3.26
        {
            System.out.println("Ejercicio 3.26");

            int numero = 30;
            System.out.println("Enter an integer: " + numero);

            boolean divisibleBy5And6 = (numero % 5 == 0) && (numero % 6 == 0);
            System.out.println("Is " + numero + " divisible by 5 and 6? " + divisibleBy5And6);

            boolean divisibleBy5Or6 = (numero % 5 == 0) || (numero % 6 == 0);
            System.out.println("Is " + numero + " divisible by 5 or 6? " + divisibleBy5Or6);

            boolean divisibleBy5Or6ButNotBoth = (numero % 5 == 0) ^ (numero % 6 == 0);
            System.out.println("Is " + numero + " divisible by 5 or 6, but not both? " + divisibleBy5Or6ButNotBoth);

        }

        //Ejercicio 3.27
        {
            System.out.println("Ejercicio 3.27");

            //Datos
            double x3 = 100.5;
            double y3 = 50.5;
            System.out.println("Enter a point´s X and Y coordinates : (" + x3 + " , " + y3 + ")");

            //Primera recta
            double x1 = 0;
            double y1 = 100;
            double x2 = 200;
            double y2 = 0;
            //Origen
            double origenX = 0;
            double origenY = 0;

            //Ecuacion de la recta
            double x = 1;
            double y = 1;
            //Primera ecuacion
            double m1 = (y2 - y1) / (x2 - x1);
            double a = m1 * x;
            double b = y * -1;
            double e = (y1 + (-x1 * m1)) * -1;
            //System.out.println(a + "x " + b + "y = " + e);

            //Segunda ecuacion
            double m2 = (origenY - y3) / (origenX - x3);
            double c = m2 * x;
            double d = y * -1;
            double f = (y3 + (-x3 * m2)) * -1;
            //System.out.println(c + "x " + d + "y = " + f);

            double puntoInterseccionX = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double puntoInterseccionY = ((a * f) - (e * c)) / ((a * d) - (b * c));

            double distanciaRectaPropuesta = Math.pow((Math.pow((x3 - origenX), 2) + Math.pow((y3 - origenY), 2)), 0.5);
            //System.out.println("Distancia entre los puntos: (" + x3 + " , " + y3 + ") y el origen: " + distanciaRectaPropuesta );

            double distanciaPuntoInterseccion = Math.pow((Math.pow((puntoInterseccionX - origenX), 2) +
                    Math.pow((puntoInterseccionY - origenY), 2)), 0.5);
            //System.out.println("Distancia entre los puntos interseccion de las rectas: (" + puntoInterseccionX + " , " + puntoInterseccionY + ") y el origen: " + distanciaPuntoInterseccion );

            if (distanciaPuntoInterseccion > distanciaRectaPropuesta)
                System.out.println("The point is in the triangle");
            else
                System.out.println("The point is not in the triangle");

        }

        //Ejercicio 3.28
        {
            System.out.println("Ejercicio 3.28");

            //Datos primer rectangulo
            double r1CentroX = 1;
            double r1CentroY = 2;
            double r1Width = 3;
            double r1Height = 3;

            //Datos segundo rectangulo
            double r2CentroX = 40;
            double r2CentroY = 45;
            double r2Width = 3;
            double r2Height = 2;

            //Determinacion de ubicacio

            if (((r1Width / 2) >= ((Math.abs(r1CentroX - r2CentroX)) + (r2Width / 2))) &&
                    ((r1Height / 2) >= ((Math.abs(r1CentroY - r2CentroY)) + (r2Height / 2))))
                System.out.println("r2 is inside r1");
            else if ((((r1Width / 2) + (r2Width / 2)) > ((Math.abs(r1CentroX - r2CentroX)))) && (((r1Height / 2) + (r2Height / 2)) > ((Math.abs(r1CentroY - r2CentroY)))))
                System.out.println("r2 overlaps r1");
            else
                System.out.println("r2 does not overlap r1");

        }

        //Ejercicio 3.29
        {
            System.out.println("Ejercicio 3.29");

            //Circulo 1
            double c1CentroX = 3.4;
            double c1CentroY = 5.5;
            double radio1 = 1;

            //Circulo 2
            double c2CentroX = 5.5;
            double c2CentroY = 7.2;
            double radio2 = 1;

            double distanciaEntreSusCentros = Math.pow(((Math.pow(c2CentroX - c1CentroX, 2))
                    + (Math.pow(c2CentroY - c1CentroY, 2))), 0.5);

            if (distanciaEntreSusCentros <= (radio1 - radio2))
                System.out.println("circle2 is inside circle1");
            else if (distanciaEntreSusCentros <= (radio1 + radio2))
                System.out.println("circle2 overlaps circle1");
            else
                System.out.println("circle2 does not overlap circle1");
        }

        //Ejercicio 3.30
        {
            System.out.println("Ejercicio 3.30");

            System.out.println("2.8 Current time");
            long timeMilliseconds = System.currentTimeMillis();
            long totalSeconds = timeMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long currentHour = totalHours % 24;
            System.out.println("Ajuste de zona horaria respecto a GMT:");
            int Ajuste = -5; //input.nextInt();

            if (currentHour > 12)
                System.out.println("Current hours is: " + (currentHour + Ajuste - 12) + ":" + currentMinute + ":" + currentSecond + " PM");
            else
                System.out.println("Current hours is: " + (currentHour + Ajuste) + ":" + currentMinute + ":" + currentSecond + " AM");

        }

        //Ejercicio 3.31
        {
            System.out.println("Ejercicio 3.31");

            final double DOLLARSTORMB = 6.81;
            double amountRMB = 0;

            System.out.println("Enter the exchange rate from dollars to RMB: " + DOLLARSTORMB);

            int convertDollarsToRMB = (int) (Math.random() * 3);

            System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: " + convertDollarsToRMB);

            if (convertDollarsToRMB == 0) {
                System.out.print("Enter the dollar amount: ");
                double dollarAmount = 10000;//input.nextDouble();
                double convercion = dollarAmount * DOLLARSTORMB;
                System.out.println("$" + dollarAmount + " is " + convercion + " yuan");
            } else if (convertDollarsToRMB == 1) {
                System.out.println("Enter the RMB amount: ");
                double rmbAmount = 10000;//input.nextDouble();
                double convercion = rmbAmount / DOLLARSTORMB;
                System.out.println(rmbAmount + " yuan is $" + (int) (convercion * 100) / 100.0);
            } else
                System.out.println("Incorrect input");

        }

        //Ejercicio 3.32
        {
            System.out.println("Ejercicio 3.32");

            double x0 = 3.4;
            double y0 = 2;
            double x1 = 6.5;
            double y1 = 9.5;
            double x2 = 5;
            double y2 = 2.5;

            double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));

            if (ecuacion > 0)
                System.out.println("p2 is on the left side of the line");
            else if (ecuacion == 0)
                System.out.println("p2 is on the same line");
            else if (ecuacion < 0)
                System.out.println("p2 is on the right side of the line");

        }

        //Ejercicio 3.33
        {
            System.out.println("Ejercicio 3.33");

            double weight1 = 50;
            double price1 = 25;
            System.out.println("Enter weight and price for package 1: " + weight1 + ", $" + price1);

            double weight2 = 25;
            double price2 = 12.5;
            System.out.println("Enter weight and price for package 2: " + weight2 + ", $" + price2);

            if ((weight1 / price1) < (weight2 / price2))
                System.out.println("Package 2 has a better price.");
            else if ((weight1 / price1) > (weight2 / price2))
                System.out.println("Package 1 has a better price.");
            else if ((weight1 / price1) == (weight2 / price2))
                System.out.println("Two packages have the same price.");
        }

        //Ejercicio 3.34
        {
            System.out.println("Ejercicio 3.34");

            double x0 = 1;
            double y0 = 1;
            double x1 = 2.5;
            double y1 = 2.5;
            double x2 = 1.5;
            double y2 = 1.5;

            double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));

            double distanciap0Ap1 = Math.pow((Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2)), 0.5);
            double distanciap0Ap2 = Math.pow((Math.pow(x2 - x0, 2) + Math.pow(y2 - y0, 2)), 0.5);

            if ((ecuacion == 0) && (distanciap0Ap1 >= distanciap0Ap2))
                System.out.println("(" + x2 + " , " + y2 + ") is on the line segment from (" + x0 + " , " + y0 + ") "
                        + "to (" + x1 + " , " + y1 + ")");
            else if (!(ecuacion == 0) || (distanciap0Ap1 < distanciap0Ap2))
                System.out.println("(" + x2 + " , " + y2 + ") is not on the line segment from (" + x0 + " , " + y0 + ") "
                        + "to (" + x1 + " , " + y1 + ")");

        }


    }
}
