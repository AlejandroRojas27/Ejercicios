package ProgrammingExercisesCAP7;

public class Ejercicio_7_18_BubbleSort {
    public static void main(String[] args) {
        double[] list = {1,2,4.5,7.7,3.3,6,3,9,1,5.4};
        System.out.println("Before sort");
        System.out.println(java.util.Arrays.toString(list));
        System.out.println("After sort");
        System.out.println(java.util.Arrays.toString(bubbleSort(list)));

    }

    public static double[] bubbleSort(double[] list){


        for (int i = 0;i < list.length-1;i++){
            for (int j = 1; j < list.length;j++){
                if(list[j-1] > list[j]){
                   double temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }

            }

        }

        return list;
    }
}
