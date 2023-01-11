package ProgrammingExercisesCAP7;

public class Ejercicio_7_36_GameEightQueens {
    public static void main(String[] args) {

        //Crate and initialize row

        int length = 8;
        char[] row = new char[length];
        for (int i = 0; i < length; i++){
            row[i] = ' ';
        }

        //Places
        int[] places = new int[length];
        int sum = 0;
        int repeat = 0;

        int queenOne = 0;
        int queenTwo = 0;
        int queenTree = 0;
        int queenFour = 0;
        int queenFive = 0;
        int queenSix = 0;
        int queenSeven = 0;
        int queenEight = 0;


        int count = 0;


        for (count = 0;count < 1;){

            if(count == 0){
                //valores en 0
                queenOne = 0;
                queenTwo = 0;
                queenTree = 0;
                queenFour = 0;
                queenFive = 0;
                queenSix = 0;
                queenSeven = 0;
                queenEight = 0;

                for (int i = 0; i < length; i++) {
                    places[i] = 0;
                }



                sum = 0;
                repeat = 0;


            }

                //Queen One
                queenOne = (int) (Math.random() * length);
                places[0] = queenOne;

                //Queen Two
                queenTwo = 0;
                for (int i = 0; i < 1; ) {
                    queenTwo = (int) (Math.random() * length);
                    if (queenOne != queenTwo && queenTwo != (queenOne + 1) && queenTwo != (queenOne - 1)) {
                        i++;
                    }

                }

                places[1] = queenTwo;

                //Queen Tree
                queenTree = 0;

                for (int i = 0; i < 1; ) {
                    queenTree = (int) (Math.random() * length);
                    if (queenOne != queenTree && queenTwo != queenTree && queenTree != (queenOne + 2) &&
                            queenTree != (queenOne - 2) && queenTree != (queenTwo + 1) &&
                            queenTree != (queenTwo - 1)) {
                        i++;
                    }

                }

                places[2] = queenTree;

                //Queen Four
                queenFour = 0;

                for (int i = 0; i < 1; ) {
                    queenFour = (int) (Math.random() * length);
                    if (queenOne != queenFour && queenTwo != queenFour && queenTree != queenFour
                            && queenFour != (queenOne + 3) && queenFour != (queenOne - 3)
                            && queenFour != (queenTwo + 2) && queenFour != (queenTwo - 2)
                            && queenFour != (queenTree + 1) && queenFour != (queenTree - 1)) {
                        i++;
                    }

                }

                places[3] = queenFour;

                //Queen Five
                queenFive = 0;

                for (int i = 0; i < 1; ) {
                    queenFive = (int) (Math.random() * length);

                    if (queenFive != queenOne && queenFive != queenTwo && queenFive != queenTree && queenFive != queenFour) {
                        if (queenFive != (queenOne + 4) && queenFive != (queenOne - 4)
                                && queenFive != (queenTwo + 3) && queenFive != (queenTwo - 3)
                                && queenFive != (queenTree + 2) && queenFive != (queenTree - 2)
                                && queenFive != (queenFour + 1) && queenFive != (queenFour - 1)) {
                            i++;
                        }
                    }
                    else {
                        queenFive = 404;
                        break;
                    }

                }

                places[4] = queenFive;

                //Queen Six
                queenSix = 0;

                for (int i = 0; i < 1; ) {
                    queenSix = (int) (Math.random() * length);

                    if (queenSix != queenOne && queenSix != queenTwo && queenSix != queenTree
                            && queenSix != queenFour && queenSix != queenFive) {
                        if (queenSix != (queenOne + 5) && queenSix != (queenOne - 5)
                                && queenSix != (queenTwo + 4) && queenSix != (queenTwo - 4)
                                && queenSix != (queenTree + 3) && queenSix != (queenTree - 3)
                                && queenSix != (queenFour + 2) && queenSix != (queenFour - 2)
                                && queenSix != (queenFive + 1) && queenSix != (queenFive - 1)) {
                            i++;
                        }
                    }
                    else {
                        queenSix = 404;
                        break;
                    }


                }

                places[5] = queenSix;

                //Queen Seven
                queenSeven = 0;

                for (int i = 0; i < 1; ) {
                    queenSeven = (int) (Math.random() * length);

                    if (queenOne != queenSeven && queenTwo != queenSeven && queenTree != queenSeven
                            && queenFour != queenSeven && queenFive != queenSeven
                            && queenSix != queenSeven) {
                        if (queenSeven != (queenOne + 6) && queenSeven != (queenOne - 6)
                                && queenSeven != (queenTwo + 5) && queenSeven != (queenTwo - 5)
                                && queenSeven != (queenTree + 4) && queenSeven != (queenTree - 4)
                                && queenSeven != (queenFour + 3) && queenSeven != (queenFour - 3)
                                && queenSeven != (queenFive + 2) && queenSeven != (queenFive - 2)
                                && queenSeven != (queenSix + 1) && queenSeven != (queenSix - 1)) {
                            i++;
                        }
                    }
                    else {
                        queenSeven = 404;
                        break;
                    }


                }

                places[6] = queenSeven;

                //Queen Eight
                queenEight = 0;

                for (int i = 0; i < 1;){
                    queenEight = (int) (Math.random() * length);
                    if(queenOne != queenEight && queenTwo != queenEight && queenTree != queenEight
                            && queenFour != queenEight && queenFive != queenEight
                            && queenSix != queenEight && queenSeven != queenEight){
                        if(queenEight != (queenOne + 7) && queenEight != (queenOne - 7)
                                && queenEight != (queenTwo + 6) && queenEight != (queenTwo - 6)
                                && queenEight != (queenTree + 5) && queenEight != (queenTree - 5)
                                && queenEight != (queenFour + 4) && queenEight != (queenFour - 4)
                                && queenEight != (queenFive + 3) && queenEight != (queenFive - 3)
                                && queenEight != (queenSix + 2) && queenEight != (queenSix - 2)
                                && queenEight != (queenSeven + 1) && queenEight != (queenSeven - 1)){
                            i++;
                        }

                    }
                    else {
                        queenEight = 404;
                        break;
                    }

                }

                places[7] = queenEight;


            for (int i = 0; i < length;i++){
                sum+=places[i];
            }

            for (int i = 0; i < length-1;i++){
                for (int j = length-1; j > i;j--){

                    if (places[i] == places[j]){
                        repeat++;
                    }
                }

            }

            if(sum == 28 && repeat == 0){
                count++;
            }

        }

        for (int i = 0; i < length; i++){
            row[places[i]] = 'Q';

            for (int j = 0; j < length; j++){
                if(j < length-1) {
                    System.out.print("| " + row[j] + " ");
                }
                else if(j == length-1){
                    System.out.print("| " + row[j] + " |");
                }
            }
            System.out.println(" ");

            for (int j = 0; j < length; j++){
                row[j] = ' ';
            }


        }


    }
}
