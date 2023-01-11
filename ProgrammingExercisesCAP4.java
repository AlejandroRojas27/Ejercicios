import java.util.Scanner;

public class ProgrammingExercisesCAP4 {
    public static void main(String[] args) {
        //4.1 Geometry: area of a pentagon
        {
            System.out.println("4.1 Geometry: area of a pentagon");
            //Datos
            double r = 5.5;
            double s = (2 * r) * (Math.sin(Math.PI / 5));

            //Compute
            double area = (5 * Math.pow(s, 2)) / (4 * (Math.tan(Math.PI / 5)));


            //Resultado
            System.out.println("The area of the pentagon is: " + (int) (area * 100) / 100.0);

        }
        System.out.printf("\n");

        // 4.2 Geometry: great circle distance
        {
            System.out.println("4.1 Geometry: great circle distance");

            double radius = 6371.01;

            //Primeras coordenadas
            double x1 = 39.55;
            double y1 = -116.25;
            System.out.println("Enter point 1 (latitude and longitude) in degrees: " + x1 + " , " + y1);

            //Segundas coordenadas
            double x2 = 41.5;
            double y2 = 87.37;
            System.out.println("Enter point 2 (latitude and longitude) in degrees: " + x2 + " , " + y2);

            //Convercion a radianes
            double x1Radians = Math.toRadians(x1);
            double y1Radians = Math.toRadians(y1);
            double x2Radians = Math.toRadians(x2);
            double y2Radians = Math.toRadians(y2);

            //Compute

            double d = radius * Math.acos(Math.sin(x1Radians) * Math.sin(x2Radians) +
                    Math.cos(x1Radians) * Math.cos(x2Radians) * Math.cos(y1Radians - y2Radians));

            //Resultado
            System.out.println("The distance between the two points is " + d + "km");

        }
        System.out.printf("\n");

        //4.3 Geography: estimate areas
        {
            System.out.println("4.3 Geography: estimate areas");
            System.out.println("Cities: Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina");

            double radius = 6371.01;

            //Datos Atlanta
            double xAtlanta = 33.756944;
            double yAtlanta = -84.390278;
            double xAtlantaToRadians = Math.toRadians(xAtlanta);
            double yAtlantaToRadians = Math.toRadians(yAtlanta);

            //Datos Orlando
            double xOrlando = 28.533611;
            double yOrlando = -81.386667;
            double xOrlandoToRadians = Math.toRadians(xOrlando);
            double yOrlandoToRadians = Math.toRadians(yOrlando);

            //Datos Savannah
            double xSavannah = 32.050833;
            double ySavannah = -81.103889;
            double xSavannahToRadians = Math.toRadians(xSavannah);
            double ySavannahToRadians = Math.toRadians(ySavannah);

            //Datos Charlotte
            double xCharlotte = 35.226944;
            double yCharlotte = -80.843333;
            double xCharlotteToRadians = Math.toRadians(xCharlotte);
            double yCharlotteToRadians = Math.toRadians(yCharlotte);

            //Distancias

            double distanceAtlantaToCharlotte = radius * Math.acos(Math.sin(xAtlantaToRadians) *
                    Math.sin(xCharlotteToRadians) * Math.cos(xAtlantaToRadians) * Math.cos(xCharlotteToRadians) *
                    Math.cos(yAtlantaToRadians - yCharlotteToRadians));

            double distanceCharlotteToSavannah = radius * Math.acos(Math.sin(xCharlotteToRadians) *
                    Math.sin(xSavannahToRadians) * Math.cos(xCharlotteToRadians) * Math.cos(xSavannahToRadians) *
                    Math.cos(yCharlotteToRadians - ySavannahToRadians));

            double distanceAtlantaToSavannah = radius * Math.acos(Math.sin(xAtlantaToRadians) *
                    Math.sin(xSavannahToRadians) * Math.cos(xAtlantaToRadians) * Math.cos(xSavannahToRadians) *
                    Math.cos(yAtlantaToRadians - ySavannahToRadians));

            double distanceAtlantaToOrlando = radius * Math.acos(Math.sin(xAtlantaToRadians) *
                    Math.sin(xOrlandoToRadians) * Math.cos(xAtlantaToRadians) * Math.cos(xOrlandoToRadians) *
                    Math.cos(yAtlantaToRadians - yOrlandoToRadians));

            double distanceSavannahToOrlando = radius * Math.acos(Math.sin(xSavannahToRadians) *
                    Math.sin(xOrlandoToRadians) * Math.cos(xSavannahToRadians) * Math.cos(xOrlandoToRadians) *
                    Math.cos(ySavannahToRadians - yOrlandoToRadians));

            //Area Atlanta - Charlotte - Savannah

            double s1 = (distanceAtlantaToCharlotte + distanceAtlantaToSavannah + distanceCharlotteToSavannah) / 2;

            double area1 = Math.pow((s1 - distanceAtlantaToCharlotte) *
                    (s1 - distanceAtlantaToSavannah) * (s1 - distanceCharlotteToSavannah) * s1, 0.5);

            //Area Atlanta - Savanah  - Orlando

            double s2 = (distanceAtlantaToOrlando + distanceAtlantaToSavannah + distanceSavannahToOrlando) / 2;

            double area2 = Math.pow((s2 - distanceAtlantaToOrlando) *
                    (s2 - distanceAtlantaToSavannah) * (s2 - distanceSavannahToOrlando) * s2, 0.5);

            //Resultados

            System.out.println("The estimated area enclosed by these four cities is: " + (area1 + area2) + "km");
        }
        System.out.printf("\n");

        //4.4 Geometry: area of a hexagon
        {
            System.out.println("4.4 Geometry: area of a hexagon");

            double side = 5.5;

            double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

            System.out.println("The area of the hexagon is: " + (int) (area * 100) / 100.0);
        }
        System.out.printf("\n");

        //4.5 Geometry: area of a regular polygon
        {
            System.out.println("4.5 Geometry: area of a regular polygon");

            double numberOfSides = 5;
            double lengthOfSide = 6.5;

            System.out.println("Enter the number of sides:" + numberOfSides);
            System.out.println("Enter the side: " + lengthOfSide);

            double area = (numberOfSides * Math.pow(lengthOfSide, 2) / (4 * Math.tan(Math.PI / numberOfSides)));
            System.out.println("The area of the polygon is: " + area);
        }
        System.out.printf("\n");

        //4.6 Random points on a circle
        {
            System.out.println("4.6 Random points on a circle");
            //Datos
            double radius = 40;
            //Angulos
            double a1 = Math.toRadians(1 + Math.random() * 360); //4.289739399894692;
            double a2 = Math.toRadians(1 + Math.random() * 360);//5.561648352449319;
            double a3 = Math.toRadians(1 + Math.random() * 360);//0.8935030336051346;
            //System.out.println("Angulo 1: " + a1);
            //System.out.println("Angulo 2: " + a2);
            //System.out.println("Angulo 3: " + a3);

            //Puntos
            double x1 = radius * Math.cos(a1);
            double y1 = radius * Math.sin(a1);
            System.out.println("Coordenadas punto 1: (" + x1 + " , " + y1 + ")");

            double x2 = radius * Math.cos(a2);
            double y2 = radius * Math.sin(a2);
            System.out.println("Coordenadas punto 2 : (" + x2 + " , " + y2 + ")");

            double x3 = radius * Math.cos(a3);
            double y3 = radius * Math.sin(a3);
            System.out.println("Coordenadas punto 3: (" + x3 + " , " + y3 + ")");

            //Computo de Distancias
            double d1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
            double d2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
            double d3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);

            //System.out.println("Distancia de 1 a 2 (d1): " + d1);
            //System.out.println("Distancia de 2 a 3 (d2): " + d2);
            //System.out.println("Distancia de 1 a 3 (d3): " + d3);

            double co = 0;
            double ca = 0;
            double hipotenusa = 0;

            if (d1 > d2 && d1 > d3) {
                hipotenusa = d1;
                co = d2;
                ca = d3;
            } else if (d2 > d1 && d2 > d3) {
                hipotenusa = d2;
                co = d1;
                ca = d3;
            } else if (d3 > d1 && d3 > d2) {
                hipotenusa = d3;
                co = d1;
                ca = d2;
            }
            //System.out.println("Hipotenusa: " + hipotenusa);
            //System.out.println("Co: " + co);
            //System.out.println("Ca: " + ca);

            //Computo de Angulos
            double anguloResultante2 = Math.toDegrees(Math.acos((Math.pow(ca, 2) + Math.pow(hipotenusa, 2) - Math.pow(co, 2)) / (2 * hipotenusa * ca)));
            double anguloResultante3 = Math.toDegrees(Math.acos((Math.pow(co, 2) + Math.pow(hipotenusa, 2) - Math.pow(ca, 2)) / (2 * hipotenusa * co)));
            double anguloResultante1 = 180 - anguloResultante2 - anguloResultante3;

            //Resultados
            System.out.println("Angulo 1: " + anguloResultante1);
            System.out.println("Angulo 2: " + anguloResultante2);
            System.out.println("Angulo 3: " + anguloResultante3);

            System.out.println("Comprobacion: ¿La suma de los angulos es 180? " +
                    ((anguloResultante1 + anguloResultante2 + anguloResultante3) == 180));
        }
        System.out.printf("\n");

        //4.7 Corner point coordinates
        {
            System.out.println("4.7 Corner point coordinates");
            double radius = 100.52;
            System.out.println("Enter the radius of the bounding circle: " + radius);

            double a1 = Math.toRadians(90 - 72);
            double a2 = Math.toRadians(90);
            double a3 = Math.toRadians(90 + 72);
            double a4 = Math.toRadians(90 + 72 + 72);
            double a5 = Math.toRadians(90 + 72 + 72 + 72);

            //Puntos
            double x1 = radius * Math.cos(a1);
            double y1 = radius * Math.sin(a1);
            double x2 = radius * Math.cos(a2);
            double y2 = radius * Math.sin(a2);
            double x3 = radius * Math.cos(a3);
            double y3 = radius * Math.sin(a3);
            double x4 = radius * Math.cos(a4);
            double y4 = radius * Math.sin(a4);
            double x5 = radius * Math.cos(a5);
            double y5 = radius * Math.sin(a5);

            System.out.printf("(%1.2f, %1.2f)", x1, y1);
            System.out.printf("\n(%1.2f, %1.2f)", x2, y2);
            System.out.printf("\n(%1.2f, %1.2f)", x3, y3);
            System.out.printf("\n(%1.2f, %1.2f)", x4, y4);
            System.out.printf("\n(%1.2f, %1.2f)", x5, y5);

            System.out.println(" ");
        }
        System.out.printf("\n");

        //4.8 Find the character of an ASCII code
        {
            System.out.println("4.8 Find the character of an ASCII code");

            int numero = (int) (Math.random() * 128);
            char codigo = (char) numero;
            System.out.println("Enter an ASCII code: " + numero);

            if (codigo >= 0 && codigo < 127)
                System.out.println("The character for ASCII code " + numero + " is " + codigo);
            else
                System.out.println("Wrong code");
        }
        System.out.printf("\n");

        //4.9 Find the Unicode of a character
        {
            System.out.println("4.9 Find the Unicode of a character");
            char letra = 'R';
            int numero = letra;
            System.out.println("The Unicode for the character " + letra + " is " + numero);
        }
        System.out.printf("\n");

        //4.10 Guess birthday
        {
            System.out.println("4.10 Guess birthday");
            String set1 =
                    "1 3 5 7\n" +
                            "9 11 13 15\n" +
                            "17 19 21 23\n" +
                            "23 27 29 31";

            String set2 =
                    "2 3 6 7\n" +
                            "10 11 14 15\n" +
                            "18 19 22 23\n" +
                            "26 27 30 31";

            String set3 =
                    "4 5 6 7\n" +
                            "12 13 14 15\n" +
                            "20 21 22 23\n" +
                            "28 29 30 31";

            String set4 =
                    "8 9 10 11\n" +
                            "12 13 14 15\n" +
                            "24 25 26 27\n" +
                            "28 29 30 31\n";

            String set5 =
                    "16 17 18 19\n" +
                            "20 21 22 23\n" +
                            "24 25 26 27\n" +
                            "28 29 30 31";

            int day = 0;
            char ch = (char) 'A';

            //Create a Scanner
            Scanner input = new Scanner(System.in);

            //Prompt the user to answer questions
            System.out.print("Is your birthday in Set1?\n");
            System.out.print(set1);
            System.out.print("\nEnter N for No and Y for Yes: ");
            String answer = "No";//input.next();

            if (answer.charAt(0) == 'Y')
                day += 1;

            //Prompt the user to answer questions
            System.out.print("\nIs your birthday in Set2?\n");
            System.out.print(set2);
            System.out.print("\nEnter N for No and Y for Yes: ");
            answer = "No";//input.next();


            if (answer.charAt(0) == 'Y')
                day += 2;

            //Prompt the user to answer questions
            System.out.print("\nIs your birthday in Set3?\n");
            System.out.print(set3);
            System.out.print("\nEnter N for No and Y for Yes: ");
            answer = "No";//input.next();

            if (answer.charAt(0) == 'Y')
                day += 4;

            //Prompt the user to answer questions
            System.out.print("\nIs your birthday in Set4?\n");
            System.out.print(set4);
            System.out.print("\nEnter N for No and Y for Yes: ");
            answer = "No";//input.next();

            if (answer.charAt(0) == 'Y')
                day += 8;

            //Prompt the user to answer questions
            System.out.print("\nIs your birthday in Set5?\n");
            System.out.print(set5);
            System.out.print("\nEnter N for No and Y for Yes: ");
            answer = "No";//input.next();

            if (answer.charAt(0) == 'Y')
                day += 16;

            System.out.print("\nYour birthday is " + day + "!");
        }
        System.out.printf("\n");

        //4.11 Decimal to hex
        {
            System.out.println("4.11 Decimal to hex");

            int numero = (int) (Math.random() * 30);
            System.out.println("Enter a decimal value (0 to 15): " + numero);

            if (numero <= 9)
                System.out.println("The hex value is " + numero);
            else if (numero == 10)
                System.out.println("The hex value is A");
            else if (numero == 11)
                System.out.println("The hex value is B");
            else if (numero == 12)
                System.out.println("The hex value is C");
            else if (numero == 13)
                System.out.println("The hex value is D");
            else if (numero == 14)
                System.out.println("The hex value is E");
            else if (numero == 15)
                System.out.println("The hex value is A");
            else
                System.out.println(numero + " is an invalid input");
        }
        System.out.printf("\n");

        //4.12 Hex to binary
        {
            System.out.println("4.12 Hex to binary");
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a hex digit: ");
            String hexDigit = "A";//input.nextLine();
            char ch = Character.toUpperCase(hexDigit.charAt(0));

            int value = 0;

            if (hexDigit.length() != 1) {
                System.out.println(hexDigit + " is an invalid input");
                System.exit(1);
            }

            if ('A' <= ch && ch <= 'F') {
                value = ch - 'A' + 10;
                switch (value) {
                    case 10:
                        System.out.println("The binary value is: 1010");
                        break;
                    case 11:
                        System.out.println("The binary value is: 1011");
                        break;
                    case 12:
                        System.out.println("The binary value is: 1100");
                        break;
                    case 13:
                        System.out.println("The binary value is: 1101");
                        break;
                    case 14:
                        System.out.println("The binary value is: 1110");
                        break;
                    case 15:
                        System.out.println("The binary value is: 1111");
                        break;
                }
            } else if ('1' <= ch && ch <= '9') {
                value = ch - '1' + 1;
                switch (value) {
                    case 1:
                        System.out.println("The binary value is: 0001");
                        break;
                    case 2:
                        System.out.println("The binary value is: 0010");
                        break;
                    case 3:
                        System.out.println("The binary value is: 0011");
                        break;
                    case 4:
                        System.out.println("The binary value is: 0100");
                        break;
                    case 5:
                        System.out.println("The binary value is: 0101");
                        break;
                    case 6:
                        System.out.println("The binary value is: 0110");
                        break;
                    case 7:
                        System.out.println("The binary value is: 0111");
                        break;
                    case 8:
                        System.out.println("The binary value is: 1000");
                        break;
                    case 9:
                        System.out.println("The binary value is: 1001");
                        break;
                }
            } else if (ch > 'F')
                System.out.println(ch + " is an invalid input");

        }
        System.out.printf("\n");

        //4.13 Vowel or consonant?
        {
            System.out.println("4.13 Vowel or consonant?");
            char letra = 'G';
            int numero = letra;
            System.out.println("The Unicode for the character " + letra + " is " + numero);

            if (numero == 65 || numero == 69 || numero == 73 || numero == 79
                    || numero == 85 || numero == 97 || numero == 101
                    || numero == 105 || numero == 111 || numero == 117)
                System.out.println(letra + " is a vowel");
            else if (numero > 65 && numero <= 90)
                System.out.println(letra + " is a consonant");
            else if (numero >= 91 && numero <= 96)
                System.out.println(letra + " is an invalid input");
            else if (numero >= 97 && numero <= 122)
                System.out.println(letra + " is a consonant");
            else
                System.out.println(letra + " is an invalid input");

        }
        System.out.printf("\n");

        //4.14 Convert letter grade to number
        {
            System.out.println("4.14 Convert letter grade to number");
            char letterGrade = 'A';
            System.out.println("Enter a letter grade: " + letterGrade);
            int numericValue = letterGrade;

            if (numericValue == 65)
                System.out.println("The numeric value for grade " + letterGrade + " is 4");
            else if (numericValue == 66)
                System.out.println("The numeric value for grade " + letterGrade + " is 3");
            else if (numericValue == 67)
                System.out.println("The numeric value for grade " + letterGrade + " is 2");
            else if (numericValue == 68)
                System.out.println("The numeric value for grade " + letterGrade + " is 1");
            else if (numericValue == 70)
                System.out.println("The numeric value for grade " + letterGrade + " is 0");
            else
                System.out.println(letterGrade + "is an invalid grade");
        }
        System.out.printf("\n");

        //4.15 Phone key pads
        {
            System.out.println("4.15 Phone key pads");

            String letter = "+";
            System.out.println("Enter a letter: " + letter);
            String letterUpperCase = letter.toUpperCase();

            if (letterUpperCase.equals("A") || letterUpperCase.equals("B") || letterUpperCase.equals("C"))
                System.out.println("The corresponding number is 2");
            else if (letterUpperCase.equals("D") || letterUpperCase.equals("E") || letterUpperCase.equals("F"))
                System.out.println("The corresponding number is 3");
            else if (letterUpperCase.equals("G") || letterUpperCase.equals("H") || letterUpperCase.equals("I"))
                System.out.println("The corresponding number is 4");
            else if (letterUpperCase.equals("J") || letterUpperCase.equals("K") || letterUpperCase.equals("L"))
                System.out.println("The corresponding number is 5");
            else if (letterUpperCase.equals("M") || letterUpperCase.equals("N") || letterUpperCase.equals("0"))
                System.out.println("The corresponding number is 6");
            else if (letterUpperCase.equals("P") || letterUpperCase.equals("Q") || letterUpperCase.equals("R") || letterUpperCase.equals("S"))
                System.out.println("The corresponding number is 7");
            else if (letterUpperCase.equals("T") || letterUpperCase.equals("U") || letterUpperCase.equals("V"))
                System.out.println("The corresponding number is 8");
            else if (letterUpperCase.equals("W") || letterUpperCase.equals("X") || letterUpperCase.equals("Y") || letterUpperCase.equals("Z"))
                System.out.println("The corresponding number is 9");
            else
                System.out.println(letterUpperCase + " is an invalid input");

        }
        System.out.printf("\n");

        //4.16 Random character
        {
            System.out.println("4.16 Random character");

            int numero = (int) (47 + Math.random() * 75);
            char charapter = (char) numero;
            System.out.println("Number: " + numero);
            System.out.println("Charapter: " + charapter);
        }
        System.out.printf("\n");

        //4.17 Days of a month
        {
            System.out.println("4.17 Days of a month");
            //Datos
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a year: ");
            int year = 2003;//input.nextInt();
            System.out.println("Enter a month: ");
            String month = "Oct";//input.next();

            if (month.equals("Jan"))
                System.out.println(month + " " + year + " has 31 days");
            else if (month.equals("Feb")) {
                if ((year % 4 == 0) ^ (year % 100 == 0))
                    System.out.println(month + " " + year + " has 29 days");
                else if (year % 400 == 0)
                    System.out.println(month + " " + year + " has 29 days");
                else
                    System.out.println(month + " " + year + " has 28 days");
            } else if (month.equals("Mar"))
                System.out.println(month + " " + year + " has 31 days");
            else if (month.equals("Apr"))
                System.out.println(month + " " + year + " has 30 days");
            else if (month.equals("May"))
                System.out.println(month + " " + year + " has 31 days");
            else if (month.equals("Jun"))
                System.out.println(month + " " + year + " has 30 days");
            else if (month.equals("Jul"))
                System.out.println(month + " " + year + " has 31 days");
            else if (month.equals("Aug"))
                System.out.println(month + " " + year + " has 31 days");
            else if (month.equals("Sep"))
                System.out.println(month + " " + year + " has 30 days");
            else if (month.equals("Oct"))
                System.out.println(month + " " + year + " has 31 days");
            else if (month.equals("Nov"))
                System.out.println(month + " " + year + " has 30 days");
            else if (month.equals("Dic"))
                System.out.println(month + " " + year + " has 31 days");
        }
        System.out.printf("\n");

        //4.18 Student major and status
        {
            System.out.println("4.18 Student major and status");
            Scanner input = new Scanner(System.in);

            System.out.println("Enter two characters: ");
            String twoCharapters = "i3".toUpperCase();//input.next().toUpperCase();

            //Grados
            String major = "0";
            String status = "0";
            if (twoCharapters.charAt(0) == 'M')
                major = "Mathematics";
            else if (twoCharapters.charAt(0) == 'C')
                major = "Computer Science";
            else if (twoCharapters.charAt(0) == 'I')
                major = "Information Technology";

            if (twoCharapters.charAt(1) == '1')
                status = "Freshman";
            else if (twoCharapters.charAt(1) == '2')
                status = "Sophomore";
            else if (twoCharapters.charAt(1) == '3')
                status = "Junior";
            else if (twoCharapters.charAt(1) == '4')
                status = "Senior";

            //Display
            if (twoCharapters.length() == 1 || twoCharapters.length() > 2) {
                System.out.println("Invalid input");
                System.exit(1);
            } else if ((twoCharapters.charAt(0) == 'M' || twoCharapters.charAt(0) == 'C'
                    || twoCharapters.charAt(0) == 'I') && (twoCharapters.charAt(1) > '0' && twoCharapters.charAt(1) < '5'))
                System.out.println(major + " " + status);
            else
                System.out.println("Invalid input");
        }
        System.out.printf("\n");

        //4.19 Business: check ISBN-10
        {
            System.out.println("4.19 Business: check ISBN-10");
            String isbn = "013031997";
            int d1 = isbn.charAt(0) - 48;
            int d2 = isbn.charAt(1) - 48;
            int d3 = isbn.charAt(2) - 48;
            int d4 = isbn.charAt(3) - 48;
            int d5 = isbn.charAt(4) - 48;
            int d6 = isbn.charAt(5) - 48;
            int d7 = isbn.charAt(6) - 48;
            int d8 = isbn.charAt(7) - 48;
            int d9 = isbn.charAt(8) - 48;
            int d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);

            if (d10 == 10)
                System.out.println("The ISBN-10 number is: " + isbn + 'X');
            else
                System.out.println("The ISBN-10 number is: " + isbn + d10);
        }
        System.out.printf("\n");

        //4.20 Process a string
        {
            System.out.println("4.20 Process a string");
            String oracion = "The Cure";
            System.out.println(oracion + " length is :" + oracion.length());
            System.out.println(oracion + " first character :" + oracion.charAt(0));
        }
        System.out.printf("\n");

        //4.21 Check SSN
        {
            System.out.println("4.21 Check SSN");
            String snn = "23−253−5435";
            System.out.println("Enter a SSN:" + snn);

            if (snn.length() != 11) {
                System.out.println(snn + " is an invalid social security number");
                System.exit(1);
            }

            char d0 = snn.charAt(0);
            char d1 = snn.charAt(1);
            char d2 = snn.charAt(2);

            char d4 = snn.charAt(4);
            char d5 = snn.charAt(5);

            char d7 = snn.charAt(7);
            char d8 = snn.charAt(8);
            char d9 = snn.charAt(9);
            char d10 = snn.charAt(10);

            if (Character.isDigit(d0) && Character.isDigit(d1) && Character.isDigit(d2) && Character.isDigit(d4)
                    && Character.isDigit(d5) && Character.isDigit(d7) && Character.isDigit(d8)
                    && Character.isDigit(d9) && Character.isDigit(d10))
                System.out.println(snn + " is a valid social security number");
            else
                System.out.println(snn + " is an invalid social security number");
        }
        System.out.printf("\n");

        //4.22 Check substring
        {
            System.out.println("4.22 Check substring");
            String s1 = "ABCD";
            String s2 = "BSC";

            System.out.println("Enter string s1: ");
            System.out.println("Enter string s2: ");

            if (s1.contains(s2))
                System.out.println(s2 + " is a substring of " + s1);
            else
                System.out.println(s2 + " is not a substring of " + s1);
        }
        System.out.printf("\n");

        //4.23 Financial application: payroll
        {
            System.out.println("4.23 Financial application: payroll");
            //Datos
            String name = "Smith";
            double hoursWorked = 10;
            double hourlyPayRate = 9.75;
            double federalTaxWithholdingRate = 0.20;
            double stateTaxWithholdingRate = 0.09;

            //Compute
            double grossPay = hourlyPayRate * hoursWorked;
            double deductionFederalTaxWithholdingRate = grossPay * federalTaxWithholdingRate;
            double deductionStateTaxWithholdingRate = grossPay * stateTaxWithholdingRate;
            double totalDeduction = deductionStateTaxWithholdingRate + deductionFederalTaxWithholdingRate;
            double netPay = grossPay - totalDeduction;

            //Formato
            System.out.printf("Employee Name: %s", name);
            System.out.printf("\nHours Worked: %-10.1f", hoursWorked);
            System.out.printf("\nPay Rate: $%-10.2f", hourlyPayRate);
            System.out.printf("\nGross Pay: $%-10.2f", grossPay);
            System.out.printf("\nDeduction: ");
            System.out.printf("\n Federal Withholding %s: $%-10.2f", "(20.0%)", deductionFederalTaxWithholdingRate);
            System.out.printf("\n State Withholding %s: $%-10.2f", "(9.0%)", deductionStateTaxWithholdingRate);
            System.out.printf("\n Total Deduction: $%-10.2f", totalDeduction);
            System.out.printf("\nNet Pay: $%-10.2f", netPay);
            System.out.printf("\n");
        }
        System.out.printf("\n");

        //4.24 Order three cities
        {
            System.out.println("4.24 Order three cities");
            String city1 = "Chicago";
            String city2 = "Los Angeles";
            String city3 = "Atlanta";

            String orden1 = "0";
            String orden2 = "0";
            String orden3 = "0";

            char firtsWordCity1 = city1.charAt(0);
            char firtsWordCity2 = city2.charAt(0);
            char firtsWordCity3 = city3.charAt(0);

            int unicodefirtsWordCity1 = firtsWordCity1;
            int unicodefirtsWordCity2 = firtsWordCity2;
            int unicodefirtsWordCity3 = firtsWordCity3;

            //Orden
            if (unicodefirtsWordCity1 < unicodefirtsWordCity2 && unicodefirtsWordCity1 < unicodefirtsWordCity3) {
                orden1 = city1;
            } else if (unicodefirtsWordCity2 < unicodefirtsWordCity1 && unicodefirtsWordCity2 < unicodefirtsWordCity3) {
                orden1 = city2;
            } else if (unicodefirtsWordCity3 < unicodefirtsWordCity1 && unicodefirtsWordCity3 < unicodefirtsWordCity2) {
                orden1 = city3;
            }


            if ((unicodefirtsWordCity1 < unicodefirtsWordCity2 && unicodefirtsWordCity1 > unicodefirtsWordCity3) ||
                    (unicodefirtsWordCity1 > unicodefirtsWordCity2 && unicodefirtsWordCity1 < unicodefirtsWordCity3)) {
                orden2 = city1;
            } else if ((unicodefirtsWordCity2 < unicodefirtsWordCity1 && unicodefirtsWordCity2 > unicodefirtsWordCity3) ||
                    (unicodefirtsWordCity2 > unicodefirtsWordCity1 && unicodefirtsWordCity2 < unicodefirtsWordCity3)) {
                orden2 = city2;
            } else if ((unicodefirtsWordCity3 < unicodefirtsWordCity1 && unicodefirtsWordCity3 > unicodefirtsWordCity2) ||
                    (unicodefirtsWordCity3 > unicodefirtsWordCity1 && unicodefirtsWordCity3 < unicodefirtsWordCity2)) {
                orden2 = city3;
            }


            if (unicodefirtsWordCity1 > unicodefirtsWordCity2 && unicodefirtsWordCity1 > unicodefirtsWordCity3) {
                orden3 = city1;
            } else if (unicodefirtsWordCity2 > unicodefirtsWordCity1 && unicodefirtsWordCity2 > unicodefirtsWordCity3) {
                orden3 = city2;
            }
            if (unicodefirtsWordCity3 > unicodefirtsWordCity1 && unicodefirtsWordCity3 > unicodefirtsWordCity2) {
                orden3 = city3;
            }

            System.out.println("The three cities in alphabetical order are: " + orden1 + " , " + orden2 + " , " + orden3);
        }
        System.out.printf("\n");

        //4.25 Generate vehicle plate numbers
        {
            System.out.println("4.25 Generate vehicle plate numbers");

            char vehiclePlateLetter1 = (char) ((int) (65 + Math.random() * 24));
            char vehiclePlateLetter2 = (char) ((int) (65 + Math.random() * 24));
            char vehiclePlateLetter3 = (char) ((int) (65 + Math.random() * 24));

            char vehiclePlateNumber1 = (char) ((int) (48 + Math.random() * 9));
            char vehiclePlateNumber2 = (char) ((int) (48 + Math.random() * 9));
            char vehiclePlateNumber3 = (char) ((int) (48 + Math.random() * 9));
            char vehiclePlateNumber4 = (char) ((int) (48 + Math.random() * 9));

            System.out.println("The plate number is: " + vehiclePlateLetter1 + vehiclePlateLetter2 + vehiclePlateLetter3
                    + vehiclePlateNumber1 + vehiclePlateNumber2 + vehiclePlateNumber3 + vehiclePlateNumber4);
        }
        System.out.printf("\n");

        //4.26 Financial application: monetary units
        {
            System.out.println("4.26 Financial application: monetary units");
            String amount = "11.67";
            System.out.println("Enter an amount in double: " + amount);

            int numeroIndex = (int) (amount.indexOf('.'));
            int dollars = Integer.parseInt((amount.substring(0, (numeroIndex))));
            int decimales = Integer.parseInt((amount.substring(numeroIndex + 1)));

            int remainingAmount = decimales;

            // Find the number of one dollars
            int numberOfOneDollars = dollars;

            // Find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            // Find the number of nickels in the remaining amount
            int numberOfNickels = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            // Find the number of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // Display results
            System.out.println("Your amount " + amount + " consists of");
            System.out.println(" " + numberOfOneDollars + " dollars");
            System.out.println(" " + numberOfQuarters + " quarters ");
            System.out.println(" " + numberOfDimes + " dimes");
            System.out.println(" " + numberOfNickels + " nickels");
            System.out.println(" " + numberOfPennies + " pennies");

        }

    }
}
