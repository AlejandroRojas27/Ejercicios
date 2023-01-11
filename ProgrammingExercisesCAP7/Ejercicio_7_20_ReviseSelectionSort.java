package ProgrammingExercisesCAP7;

public class Ejercicio_7_20_ReviseSelectionSort {
    /**Main method */
    public static void main(String[] args) {
        double[] list = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        System.out.println("Before sort");
        for (int i = 0; i < list.length; i++ ){
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");

        selectionSort(list);

        System.out.println("After sort");
        for (int i = 0; i < list.length; i++ ){
            System.out.print(list[i] + " ");
        }

    }


    /**The method for sorting the numbers */
    public static void selectionSort(double[] list){
        for (int i = list.length -1; i > 0; i--){
            double currentMax = list[i];
            int currentMaxIndex = i;


            for (int j = i-1; j >=0; j--){
                if (currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            //Swap list[i] with list[currentMinIndex] if necessary
            if (currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }


        }

    }
}
