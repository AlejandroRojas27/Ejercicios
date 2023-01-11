package ProgrammingExercisesCAP7;

import java.util.Scanner;

public class Ejercicio_7_32_PartitionOfAList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size: ");
        //int size = input.nextInt();

        int[] list = {8,69,83,10,31,11,75,28,68,85,79,57,26,92,14,41}; //{64,4,13,46,21,1,51,70,41,41,66,14,35,4,46,28};//{10, 1, 5, 16, 61, 9, 11, 1};


        partition(list);


        //System.out.print(partition(list));
    }

    public static int partition (int[] list){
        int first = 0;
        int last = list.length -1;
        int pivot = list[first];
        int count = 0;

        for(int low = 1; low < list.length;low++){

            if (list[low] > pivot){

                for (int high = (last-count);high > 0;high--){

                    if(list[high] <= pivot && low <= high) {
                        int temp = list[low];
                        list[low] = list[high];
                        list[high] = temp;
                        //System.out.println(java.util.Arrays.toString(list));
                        break;
                    }

                }
                count++;
            }

        }

        for(int i = 1;i < list.length;i++){
            if(list[i] > pivot){
                int temp = list[i-1];
                list[i-1] = list[0];
                list[0] = temp;
                break;
            }
        }

        System.out.print(java.util.Arrays.toString(list));


        return first;
    }
}
