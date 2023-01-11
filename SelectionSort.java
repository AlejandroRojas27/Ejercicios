public class SelectionSort {
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
        for (int i = 0; i < list.length -1; i++ ){
            //Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1; j < list.length; j++){
                //this "if" found the min, if we want to change to max, we must change the restriction
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }

    }
}
