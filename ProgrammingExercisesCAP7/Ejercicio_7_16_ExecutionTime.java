package ProgrammingExercisesCAP7;

public class Ejercicio_7_16_ExecutionTime {
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        int key = (int)(Math.random()*1000);

        for (int i = 0; i < numbers.length;i++){
            numbers[i] = (int)(Math.random()*1000);
        }

        long startTimeLinear = System.nanoTime();

        System.out.println("Search the key " + key);
        //System.out.println(java.util.Arrays.toString(numbers));
        int indexLinear = LinearSearch.linearSearch(numbers,key);
        long endTimeLinear = System.nanoTime();
        System.out.println("The index obtained by linear search is " + indexLinear);

        long executionTimeLinear = endTimeLinear - startTimeLinear;

        long startTimeBinary = System.nanoTime();
        java.util.Arrays.sort(numbers);
        int indexBinary = BinarySearch.binarySeach(numbers, key);
        System.out.println("The index obtained by linear search is " + indexBinary);
        long endTimeBinary = System.nanoTime();

        long executionTimeBinary = endTimeBinary - startTimeBinary;

        System.out.println("Linear search execution time: " + (executionTimeLinear ));
        System.out.println("Binary search execution time: " + (executionTimeBinary));



    }
}
