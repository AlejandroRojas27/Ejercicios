package ProgrammingExercisesCAP8;

public class Ejercicio_8_4_ComputeTheWeeklyHoursForEachEmployee {
    public static void main(String[] args) {

        //Hours to work per week of the employees
        int[][] employeeHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        String[] employees = new String[employeeHours.length];

        //Give name to the employees
        for (int i = 0; i < employeeHours.length; i++) {
            employees[i] = "Employee " + i;
        }

        //Sum the hours
        int[] totalHour = new int[employeeHours.length];
        for (int i = 0; i < employeeHours.length; i++) {
            int sum = 0;

            for (int j = 0; j < employeeHours.length - 1; j++) {
                sum += employeeHours[i][j];
            }
            totalHour[i] = sum;
        }

        //Sort the hours
        int[] totalHourSorted = new int[totalHour.length];
        System.arraycopy(totalHour, 0, totalHourSorted, 0, totalHour.length);
        java.util.Arrays.sort(totalHourSorted);

        //Sort employees

        String[] employeesSorted = new String[employees.length];
        for (int i = 0; i < totalHour.length; i++) {
            //System.out.println("totalHourSorted[i] " + totalHourSorted[i]);
            for (int j = 0; j < totalHour.length; j++) {
                //System.out.println("    totalHour[j] " + totalHour[j] + " | j: " + j);
                if (totalHour[j] == totalHourSorted[i]) {
                    employeesSorted[i] = employees[j];
                    totalHour[j] = 0; //To ignore the values evaluated already
                    break;
                }
            }
        }

        //Display
        for (int i = totalHour.length - 1; i >= 0; i--) {
            System.out.println(employeesSorted[i] + " weekly hours are " + totalHourSorted[i]);
        }


    }

}
