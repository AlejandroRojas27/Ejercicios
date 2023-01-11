package ProgrammingExercisesCAP7;

public class Ejercicio_7_29_GamePickFourCards {
    public static void main(String[] args) {
        //Create and initialize the array
        int[] deck = new int[51];
        for (int i = 0; i < deck.length;i++){
            deck[i] = i;
        }

        //Shuffle the deck
        for (int i = 0; i < deck.length;i++){
            int randomIndex = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

        //Picks four cards until sum = 24


        for (int i = 0,x = 0; i < 1; ) {
                int pick = 0;
                int sumOfPick = 0;

                for (int j = 0; j < 4; j++) {
                    pick = (deck[j] % 13) + 1;
                    sumOfPick += pick;

                    if (sumOfPick == 24) {
                        System.out.println("Number of picks that yields the sum of 24: " + (x + 1));
                        i++;
                    }

                }

                //Shuffle the deck again
                for (int a = 0; a < deck.length; a++) {
                    int randomIndex = (int) (Math.random() * deck.length);
                    int temp = deck[a];
                    deck[a] = deck[randomIndex];
                    deck[randomIndex] = temp;
                }

                x++;
            }



    }
}
