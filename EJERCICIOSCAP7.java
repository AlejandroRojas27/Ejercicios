public class EJERCICIOSCAP7 {
    public static void main(String[] args) {

        //Ejercicio 7.2.4
        {
            int x = 30;
            int[] numbers = new int[x];
            x = 60;
            System.out.println("x is " + x);
            System.out.println("The size of numbers is " + numbers.length);

            System.out.println(" ");

        }

        //Ejercicio 7.2.8
        {
            //a. Create an array to hold 10 double values.
            double[] x = new double[10];
            x[0] = 7.5;
            x[1] = 3.5;
            x[2] = 4.5;
            x[3] = 5.5;
            x[4] = 6.5;
            x[5] = 7.5;
            x[6] = 2.5;
            x[7] = 9.5;
            x[8] = 3.5;


            //b. Assign the value 5.5 to the last element in the array.
            x[x.length - 1] = 5.5;

            //c. Display the sum of the first two elements.
            double total = 0;
            for (int y = 0; y < x.length; y++) {
                if (y == 2)
                    break;

                total += x[y];
            }
            System.out.println(x[0] + " + " + x[1] + " = " + total);

            //d. Write a loop that computes the sum of all elements in the array.
            double answer = 0;
            for (int y = 0; y < x.length; y++) {
                answer += x[y];
            }
            System.out.println(answer);

            //e. Write a loop that finds the minimum element in the array.
            double min = x[0];
            for (int y = 0; y < x.length; y++) {
                if (x[y] < min)
                    min = x[y];
            }
            System.out.println("Min value: " + min);

            //f. Randomly generate an index and display the element of this index in the array.
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("Ranbom number: " + randomNumber + " Element of this index in the array: " + x[randomNumber]);

            //g. Use an array initializer to create another array with the initial values 3.5, 5.5, 4.52, and 5.6.
            double[] g = {3.5, 5.5, 4.52, 5.6};
            for (int y = 0; y < g.length; y++) {
                System.out.print(g[y] + "  ");
            }

            System.out.println(" ");

        }

        //Ejercicio 7.2.10
        {
            double[] r = new double[100];

            for (int i = 0; i < r.length; i++) {
                r[i] = Math.random() * 100;
            }

            System.out.println(" ");
        }

        //Ejercicio 7.2.11
        {
            int list[] = {1, 2, 3, 4, 5, 6};
            for (int i = 1; i < list.length; i++) {
                list[i] = list[i - 1];
            }

            for (int i = 1; i < list.length; i++) {
                System.out.print(list[i] + " ");
            }

            System.out.println(" ");
        }

        //Ejercicio 7.4.1
        {
            int[] deck = new int[51];
            String[] suits = {"Spades", "Heats", "Diamods", "Clubs"};
            String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

            //Inicializar cartas
            for (int i = 0; i < deck.length; i++) {
                deck[i] = i;
            }

            //Shuffle the card
            for (int i = 0; i < deck.length; i++) {
                //Generate an index ramdomly
                int index = (int) (Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }

            //Display the first four cards
            for (int i = 0; i < 15; i++) {
                int cardNumber = (int) (Math.random() * deck.length);
                String suit = suits[cardNumber / 13];
                String rank = ranks[cardNumber % 13];

                System.out.println("Card number " + cardNumber + ": " + rank + " of " + suit);
            }

            System.out.println(" ");
        }

        //Ejercicio 7.5.1  ----**** TO COPY ARRAY ****----
        {
            int[] source = {3, 4, 5};
            int[] t = new int[source.length];
            System.arraycopy(source, 0, t, 0, source.length);
            for (int i = 0; i < source.length; i++) {
                System.out.println("Source: " + source[i] + " t: " + t[i]);
            }

            System.out.println(" ");
        }

        //Ejercicio 7.5.2
        {
            int[] myList;
            myList = new int[10];
            int size = myList.length;
            System.out.println("Size before: " + size);
            // Sometime later you want to assign a new array to myList
            myList = new int[20];
            System.out.println("Size after: " + size);

            System.out.println(" ");
        }

        //Ejercicio 7.7.1
        {
            int[] list = {1, 2, 3, 5, 4};

            for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
                int[] listReverse = new int[list.length];
                listReverse[i] = list[j];
                System.out.println("List: " + list[i] + " List Reverse: " + listReverse[i]);
            }

            System.out.println(" ");

        }

        //Ejercicio 7.8.1
        //a
        /*
    public static void main(String[] args) {
     int number = 0;
     int[] numbers = new  int[1];

     m(number, numbers);
     System.out.println("number is " + number + " and numbers[0] is " + numbers[0]);
    }

    public static void m(int x, int[] y){
        x = 3;
        y[0] = 3;
    }

     */
        //b
        /*
    public static void main(String[] args) {
     int[] list = {1,2,3,4,5};
     reverse(list);
     for (int i = 0; i < list.length; i++){
         System.out.print(list[i] + " ");
     }

    }

    public static void reverse(int[] list){
        int[] newList = new int[list.length];

        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 -i];
        list = newList;
        // No se copina los valores por que list = newlist, no copia valores
    }
    */

        //Ejercicio 7.9.1
        /*
            public static void print(double... mumbers) ---> Only one
             variable-length parameter may be specified in a method

            public static void print(String name, double... numbers) ---> The variable-length parameter
             must be the last parameter

            public static void print(double d1, double d2) ---> The elipsis must be
             in the list of parameters
            */

        //Ejercicio 7.9.2  ----**** Overloading a method ****----
        /*
        public static void main(String[] args) {
            printMax(34, 3,3,2,56.5);
            printMax(new double[]{1,2,3});
            printMax(new int[]{9,4,7});
        }

        public static void printMax(double... numbers){ // elipsis (...)
            if (numbers.length == 0){
                System.out.println("No argument passed");
                return;
            }

            double result = numbers[0];

            for (int i = 0; i < numbers.length; i++)
                if(numbers[i] > result)
                    result = numbers[i];

            System.out.println("The max value is " + result);
        }

        ----****Overloading a method ****----

        public static void printMax(int... numbers){
            if (numbers.length == 0){
                System.out.println("No argument passed");
                return;
            }

            double result = numbers[0];

            for (int i = 0; i < numbers.length; i++)
                if(numbers[i] > result)
                    result = numbers[i];

            System.out.println("The max value is " + result);

        }

        */

        //Ejercicio 7.11.1 ----**** Sorting acendent ****----
        /*

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

         */

        //Ejercicio 7.11.2 ----**** Sorting decendent ****----
        /*
        public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
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

    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length -1; i++ ){
            //Find the max in the list[i...list.length-1]
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i+1; j < list.length; j++){
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
         */

        //Ejercicio 7.12.1 ----**** Sorting by java.util.Arrays.sort ****----
        {
            char[] listCh = {'Q', 'W', 'r', 't', 'Y', '2', '3', '4', '1'};

            System.out.println("Before sort");
            for (int i = 0; i < listCh.length; i++) {
                System.out.print(listCh[i] + " ");
            }
            System.out.println(" ");

            java.util.Arrays.sort(listCh, 2, 7);
            System.out.println("After sort from index 2 to 7");
            for (int i = 0; i < listCh.length; i++) {
                System.out.print(listCh[i] + " ");
            }
            System.out.println(" ");

            java.util.Arrays.sort(listCh);
            System.out.println("After sort whole");
            for (int i = 0; i < listCh.length; i++) {
                System.out.print(listCh[i] + " ");
            }
            System.out.println(" ");
            System.out.println(" ");
        }

        //Ejercicio 7.12.2 ----**** BinarySearch by java.util.Arrays.binarySearch ****----
        {
            System.out.println("List not sorted");
            int[] list = {2, 6, 9, 3, 4};
            System.out.println(java.util.Arrays.binarySearch(list, 3)); //The answer is wrong

            System.out.println("List sorted in decreasing order");
            int[] list2 = {9, 8, 7, 6, 5};
            System.out.println(java.util.Arrays.binarySearch(list2, 8)); //The answer is wrong

            System.out.println("List sorted in increasing order");
            int[] list3 = {1, 2, 3, 4, 5, 6};
            System.out.println(java.util.Arrays.binarySearch(list3, 5)); //The values must be in increasing order
        }

        //Ejercicio 7.12.3
        {
            int[] list1 = {2, 4, 7, 10};
            java.util.Arrays.fill(list1, 7);
            System.out.println(java.util.Arrays.toString(list1));

            System.out.println(" ");

            int[] list2 = {2, 4, 7, 10};
            System.out.println(java.util.Arrays.toString(list2));
            System.out.println(java.util.Arrays.equals(list1, list2));

            System.out.println(" ");
        }

        // ----**** java.util.Arrays ****----
        {

        int[] list = {9, 7, 3, 1, 4, 6, 2, 5, 8};

        System.out.println("Before sort");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");

        java.util.Arrays.sort(list, 3, 7);
        System.out.println("After sort from index 3 to 7");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");

        java.util.Arrays.sort(list);
        System.out.println("After sort whole");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println(" ");

        char[] listCh = {'Q', 'W', 'r', 't', 'Y', '2', '3', '4', '1'};

        System.out.println("Before sort");
        for (int i = 0; i < listCh.length; i++) {
            System.out.print(listCh[i] + " ");
        }
        System.out.println(" ");

        java.util.Arrays.sort(listCh, 2, 7);
        System.out.println("After sort from index 2 to 7");
        for (int i = 0; i < listCh.length; i++) {
            System.out.print(listCh[i] + " ");
        }
        System.out.println(" ");

        java.util.Arrays.sort(listCh);
        System.out.println("After sort whole");
        for (int i = 0; i < listCh.length; i++) {
            System.out.print(listCh[i] + " ");
        }

        System.out.println(" ");

        System.out.println("Binary search");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Index is of 5 is: " + java.util.Arrays.binarySearch(list, 5));
        System.out.println("Index is of 10 is: " + java.util.Arrays.binarySearch(list, 10));

        System.out.println(" ");

        System.out.println("Equals");
        int[] listB = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] listC = {0, 2, 3, 4, 5, 6, 7, 8, 8};

        System.out.println("First list");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Second list");
        for (int i = 0; i < listB.length; i++) {
            System.out.print(listB[i] + " ");
        }
        System.out.println(java.util.Arrays.equals(list, listB));

        System.out.println("Third list");
        for (int i = 0; i < listC.length; i++) {
            System.out.print(listC[i] + " ");
        }
        System.out.println(java.util.Arrays.equals(list, listC));

        System.out.println(" ");

        System.out.println("Fill");
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};

        System.out.println("Fill whole with 5");
        java.util.Arrays.fill(list1, 5);
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Fill from index 1 to (5 - 1) with random digit");
        java.util.Arrays.fill(list2, 1, 5, (int) (Math.random() * 10));
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
        System.out.println(" ");

        System.out.println("toString");
        System.out.println(java.util.Arrays.toString(list));
        String st = java.util.Arrays.toString(list1);
        System.out.println(st);

        System.out.println(" ");
    }

        //Ejercicio 7.13.2 ----**** Passing Strings to the main Method ****----
        {
            System.out.println("String 1");
            String[] strings1 = {"java", "Test", "I", "have", "a", "dream"};
            Test_Ejercicio7_13_2.main(strings1);

            System.out.println("String 2");
            String[] strings2 = {"java", "Test", "1 2 3"};
            Test_Ejercicio7_13_2.main(strings2);

            System.out.println("String 3");
            String[] strings3 = {"java", "Test"};
            Test_Ejercicio7_13_2.main(strings3);
        }




























    }
}
