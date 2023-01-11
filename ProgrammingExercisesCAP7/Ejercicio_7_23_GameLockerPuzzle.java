package ProgrammingExercisesCAP7;

public class Ejercicio_7_23_GameLockerPuzzle {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("How many lockers are? " + n);
        boolean[] lockers = new boolean[n];

        //S1
        java.util.Arrays.fill(lockers, true);


        //S2
        java.util.Arrays.fill(lockers, 1,lockers.length,false);


        //S3
        for (int i = 2;i < lockers.length;i++){

            for (int j = i; j < lockers.length;j+=(i+1)){

                if(lockers[j]) {
                    lockers[j] = false;
                }
                else if (!lockers[j]) {
                    lockers[j] = true;
                }
            }
        }


        //Print
        System.out.println("Which lockers are open");
        System.out.print("Lockers number: ");

        for (int i = 0;i < lockers.length; i++){
            if(i % 10 == 0){
                if(lockers[i]){
                    System.out.println((i+1) + " ");
                }

            }
            else
                System.out.print((i+1) + " ");




        }




    }
}
