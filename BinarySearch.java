public class BinarySearch {
    /** Main method */
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binarySeach(list,2); //Return 2;
        int j = binarySeach(list,11); //Return 4;
        int k = binarySeach(list,12); //Return -6;
        int l = binarySeach(list,1); //Return -1;
        int m = binarySeach(list,3); //Return -2;


        System.out.println("Search of i: " + i);
        System.out.println("Search of j: " + j);
        System.out.println("Search of k: " + k);
        System.out.println("Search of l: " + l);
        System.out.println("Search of m: " + m);
    }

    /** Use binary search to find the key in the list */
    public static int binarySeach (int[] list, int key){
        int low = 0;
        int high = list.length-1;
        while (high >= low){
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid -1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return  - low-1; //Now high < low, key not found
    }
}
