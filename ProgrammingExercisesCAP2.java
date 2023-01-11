import java.util.Scanner;

public class ProgrammingExercisesCAP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2.1 Covert to Fahrenheit
        {
            System.out.println("2.1 Covert to Fahrenheit");
            System.out.print("Enter a degree un Celsius: ");
            double Celsius = 43.5; //input.nextDouble();

            double Fahrenheit = (9.0 / 5) * Celsius + 32;
            System.out.println("Celsius: º" + Celsius + " is " + "Fahrenheit: º" + Fahrenheit);

            System.out.println(" ");
        }

        // 2.2 Compute the volume of a cylinder
        {
            System.out.println("2.2 Compute the volume of a cylinder");
            System.out.print("Radius: ");
            double radius = 5.5; //input.nextDouble();
            System.out.print("Length: ");
            double length = 12; //input.nextDouble();
            final double PI = 3.14159265358979323846;
            //Compute
            double area = PI * Math.pow(radius, 2);
            double volume = area * length;
            System.out.println("Area: " + (int) (area * 10000) / 10000.0);
            System.out.println("Volume: " + (int) (volume * 10) / 10.0);

            System.out.println(" ");
        }

        // 2.3 Convert feet into meters
        {
            System.out.println("// 2.3 Convert feet into meters");
            System.out.print("Feet: ");
            double feets = 16.5; //input.nextDouble();
            double meters = feets * 0.305;
            System.out.println("Meters: " + (int) (meters * 10000) / 1000.0);

            System.out.println(" ");
        }

        //2.4 Convert pounds into kilograms
        {
            System.out.println("//2.4 Convert pounds into kilograms");
            System.out.print("Pounds: ");
            double pounds = 55.5; //input.nextDouble();
            double kilo = pounds * 0.454;
            System.out.println("Kilograms: " + (int) (kilo * 1000) / 1000.0);

            System.out.println(" ");
        }

        //2.5 Financial application: calculate tips
        {
            System.out.println("Financial application: calculate tips");
            double subtotal = 10;
            double gratuityRate = 15;
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Gratuity rate: " + gratuityRate + "%");
            double gratuity = subtotal * gratuityRate / 100;
            double total = gratuity + subtotal;
            System.out.println("Gratuity is: $" + gratuity);
            System.out.println("Total is: $" + total);

            System.out.println(" ");
        }

        //2.6 Sum the digits in an integer
        {
            System.out.println("2.6 Sum the digits in an integer");
            System.out.print("Enter a number between 0 and 1000: ");
            int num = 123; //input.nextInt();
            int numUnidades = num % 10;
            int numDecenas = (num / 10) % 10;
            int numCentenas = (num / 100);
            int sum = numCentenas + numDecenas + numUnidades;
            System.out.println("The sum of the digits is: " + sum);

            System.out.println(" ");
        }

        //2.7 Find the number of years
        {
            System.out.println("2.7 Find the number of years");
            System.out.print("Enter the number of minutes: ");
            long minutes = 1000000000; //input.nextLong();
            int minutesPerDay = 1440;
            int daysInAYear = 365;
            //Compute area
            long minutesYear = minutes / (minutesPerDay * daysInAYear);
            long remainingDays = (minutes % (minutesPerDay * daysInAYear) / minutesPerDay);
            long remainingHours = ((minutes % (minutesPerDay * daysInAYear) % minutesPerDay) / 60);
            long remainigMinutes = ((minutes % (minutesPerDay * daysInAYear) % minutesPerDay) % 60);

            System.out.println(minutes + " minutes is approximately " + minutesYear + " years " +
                    "and " + remainingDays + " days and " + remainingHours + " hours and " +
                    remainigMinutes + " minutes");

            System.out.println(" ");
        }

        //2.8 Current time
        {
            System.out.println("2.8 Current time");
            long timeMilliseconds = System.currentTimeMillis();
            long totalSeconds = timeMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long currentHour = totalHours % 24;
            System.out.print("Ajuste de zona horaria respecto a GMT:");
            int Ajuste = -5; //input.nextInt();
            System.out.println("Current hours is: " + (currentHour + Ajuste) + ":" + currentMinute + ":" + currentSecond);

            System.out.println(" ");
        }

        //2.9 Physics: acceleration
        {
            System.out.println("2.9 Physics: acceleration");
            System.out.print("Velocity v0 in meters/sec: ");
            double v0 = 5.5; //input.nextDouble();
            System.out.print("Ending velocity v1 in meters/sec: ");
            double v1 = 50.9; //input.nextDouble();
            System.out.print("Time span: ");
            double timeSpan = 4.5; //input.nextDouble();
            double acceleration = (v1 - v0) / timeSpan;
            System.out.println("The average acceleration is: " + (int) (acceleration * 10000) / 10000.0);

            System.out.println(" ");
        }

        //2.10 Science: calculating energy
        {
            System.out.println("Science: calculating energy");
            System.out.print("Amount of water in kilograms: ");
            double amountWater = 55.5; //input.nextDouble();
            System.out.print("Initial temperature in Celsius: ");
            double initialTemperature = 3.5; //input.nextDouble();
            System.out.print("Final temperature in Celsius: ");
            double finalTemperature = 10.5; //input.nextDouble();
            double energy = amountWater * (finalTemperature - initialTemperature) * 4184;
            System.out.println("The energy needed is: " + energy + " joules");

            System.out.println(" ");
        }

        //2.11 Population projection
        {
            System.out.println("Population projection");

            System.out.println("Para una población de inicial de 312032486 calculada año");
            final int DAYSINYEAR = 365;
            int birthEvery7SecondsByYear = DAYSINYEAR * (24 * 3600) / 7;
            int deathEvery13SecondsByYear = DAYSINYEAR * (24 * 3600) / 13;
            int newImmigrantEvery45SecondsByYear = DAYSINYEAR * (24 * 3600) / 45;
            int populationprojection = birthEvery7SecondsByYear + newImmigrantEvery45SecondsByYear - deathEvery13SecondsByYear;
            System.out.print("Enter the number of years: ");
            int year = 5;//nput.nextInt();
            System.out.print("The population in " + year + " is: ");
            System.out.print(312032486 + populationprojection * year);

            System.out.println(" ");
        }

        //2.12 Physics: finding runway length
        {
            System.out.println("Physics: finding runway length");
            System.out.print("Enter speed: ");
            double speed = 60; //input.nextDouble();
            System.out.print("Enter acceleration: ");
            double airplanesAcceleration = 3.5; //input.nextDouble();
            double lengthForAirplane = (Math.pow(speed, 2)) / (2 * airplanesAcceleration);
            System.out.println("The minimum runway length for this airplane is: " + (int) (lengthForAirplane * 1000) / 1000.0);

            System.out.println(" ");
        }

        //2.13 Financial application: compound value
        {
            System.out.println("Financial application: compound value");
            double monthlySavingAmount = 100.0;
            System.out.println("Enter the monthly saving amount: " + monthlySavingAmount);
            System.out.println("With an annual interest rate of 5%");
            double interestRate = 0.05 / 12;
            double month1 = monthlySavingAmount * (1 + interestRate);
            double month2 = (monthlySavingAmount + month1) * (1 + interestRate);
            double month3 = (monthlySavingAmount + month2) * (1 + interestRate);
            double month4 = (monthlySavingAmount + month3) * (1 + interestRate);
            double month5 = (monthlySavingAmount + month4) * (1 + interestRate);
            double mouth6 = (monthlySavingAmount + month5) * (1 + interestRate);
            System.out.println("After the sixth month, the account value is: $" + (int) (mouth6 * 100) / 100.0);

            System.out.println(" ");
        }

        //2.14 Health application: computing BMI
        {
            System.out.println("2.14 Health application: computing BMI (Body Mass Index");
            System.out.print("Enter weight in pounds: ");
            double weightInPounds = 95.5; //input.nextDouble();
            System.out.print("Enter height in inches: ");
            double heightInInches = 50; //input.nextDouble();
            //compute
            double poundsToKilo = weightInPounds * 0.45359237;
            double inchesToMeters = heightInInches * 0.0254;
            double bmi = poundsToKilo / (Math.pow(inchesToMeters, 2));
            System.out.println("BMI is " + (int) (bmi * 10000) / 10000.0);

            System.out.println(" ");
        }

        //2.15 Geometry: distance of two points
        {
            System.out.println("2.15 Geometry: distance of two points");
            double x1 = 1.5;
            double y1 = -3.4;
            double x2 = 4;
            double y2 = 5;
            System.out.println("If x1 is: " + x1 + " and y1 is: " + y1 + " and x2 is: " + x2 + " and y2 is: " + y2);
            double a = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
            System.out.println("The distance between the two points is: " + Math.pow(a, 0.5));

            System.out.println(" ");
        }

        //2.16 Geometry: area of a hexagon
        {
            System.out.println("2.16 Geometry: area of a hexagon");
            double lengthOfTheSide = 5.5;
            System.out.println("Enter the length of the side: " + lengthOfTheSide);
            double areaOfTgeHexagon = Math.pow(lengthOfTheSide, 2) * 3 * Math.pow(3, 0.5) / 2;
            System.out.println("The area of the hexagon is: " + (int) (areaOfTgeHexagon * 10000) / 10000.0);

            System.out.println(" ");
        }

        //2.17 Science: wind-chill temperature
        {
            System.out.println("2.17 Science: wind-chill temperature");
            System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
            double temperature = 5.3; //input.nextDouble();
            System.out.print("Enter the wind speed ( 7 = 2) in miles per hour: ");
            double windSpeed = 6; //input.nextDouble();
            double twc = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
            System.out.println("The wind chill index is: " + (int) (twc * 100000) / 100000.0);

            System.out.println(" ");
        }

        //2.18 Print a table
        {
            System.out.println("2.18 Print a table");
            System.out.println("a   b   pow( a, b)");
            System.out.println("1   2   " + (int) Math.pow(1, 2));
            System.out.println("2   3   " + (int) Math.pow(2, 3));
            System.out.println("3   4   " + (int) Math.pow(3, 4));
            System.out.println("4   5   " + (int) Math.pow(4, 5));
            System.out.println("5   6   " + (int) Math.pow(5, 6));

            System.out.println(" ");
        }

        //2.19 Geometry: area of a triangle
        {
            System.out.println("2.19 Geometry: area of a triangle");
            double pointx1 = 1.5;
            double pointy1 = -3.4;
            double pointx2 = 4.6;
            double pointy2 = 5;
            double pointx3 = 9.5;
            double pointy3 = -3.4;
            System.out.println("Enter the coordinates of three points separated by spaces like: ");
            System.out.println("x1: " + pointx1 + ", y1: " + pointy1 + ", x2: " + pointx2 + ", y2: " + pointy2 + ", x3: " + pointx3 + ", y3: " + pointy3);
            double side1 = Math.pow(Math.pow(pointx2 - pointx1, 2) + Math.pow(pointy2 - pointy1, 2), 0.5);
            double side2 = Math.pow(Math.pow(pointx3 - pointx2, 2) + Math.pow(pointy3 - pointy2, 2), 0.5);
            double side3 = Math.pow(Math.pow(pointx3 - pointx1, 2) + Math.pow(pointy3 - pointy1, 2), 0.5);
            final double S = (side1 + side2 + side3) / 2;
            double areaThreePoints = Math.pow((S - side1) * (S - side2) * (S - side3) * S, 0.5);
            System.out.println("The area of the triangle is: " + (int) (areaThreePoints * 10) / 10.0);

            System.out.println(" ");
        }

        //2.20 Financial application: calculate interest
        {
            System.out.println("2.20 Financial application: calculate interest");
            double balance = 1000;
            double annualPercentageInterestRate = 3.5;
            System.out.println("For balance: " + balance + ", and interest rate: " + annualPercentageInterestRate);
            double interest = balance * annualPercentageInterestRate / 1200;
            System.out.println("The interest is: " + (int) (interest * 100000) / 100000.0);

            System.out.println(" ");
        }

        //2.21 Financial application: calculate future investment value
        {
            System.out.println("2.21 Financial application: calculate future investment value");
            double investmentAmount = 1000.56;
            double annualInterestRateInPercentage = 4.25;
            double monthlyInterestRate = annualInterestRateInPercentage / 1200;
            double numberOfYears = 1;
            double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));
            System.out.println("Enter investment amount: " + investmentAmount);
            System.out.println("Enter annual interest rate in percentage: " + annualInterestRateInPercentage);
            System.out.println("Enter number of years: " + numberOfYears);
            System.out.println("Future value is: $" + (int) (futureInvestmentValue * 100) / 100.0);

            System.out.println(" ");
        }

        //2.22 Financial application: monetary units
        {
            System.out.println("2.22 Financial application: monetary units");
            System.out.print("Amount: $");
            double amount = 11.56; //input.nextDouble();

            int remainingAmount = (int) (amount * 100);

            //Find the number of one dollar
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            //Find the number of cents in the remaining amount
            int numberOfCent = remainingAmount % 100;

            //Results
            System.out.println("Amout " + amount + " consists of");
            System.out.println(" " + numberOfOneDollars + " dollars");
            System.out.println(" " + numberOfCent + " cents");

            System.out.println(" ");
        }

        //2.23 Cost of driving
        {
            System.out.println("2.23 Cost of driving");
            double distance = 900.5;
            double millesPerGallon = 25.5;
            double pricePerGallon = 3.55;
            double costOfDriving = distance / millesPerGallon * pricePerGallon;
            System.out.println("Enter the driving distance: " + distance);
            System.out.println("Enter miles per gallon: " + millesPerGallon);
            System.out.println("Enter price per gallon: $" + pricePerGallon);
            System.out.println("The cost of driving is: $" + (int) (costOfDriving * 100) / 100.0);
        }
    }
}
