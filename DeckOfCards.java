public class DeckOfCards {
    public static void main(String[] args) {
        //Mi solucion;
        /*
        System.out.println("Number of cards to print: ");
        int numberOfCard = 4;
        int count = 0;

        int [] deck = new int[51];
        //initialize cards
        for(int i = 0;i < deck.length;i++) {
            deck[i] = i;

        }

        for(int i = 0;i < deck.length;i++, count++){
            // Generate an index j randomly
            int j = (int) (Math.random() * deck.length);

            // Swap myList[i] with myList[j]
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;

            //What card is
            if(count < numberOfCard){

                String number = "X";
                switch (deck[i] % 13){
                    case 0: number = "Ace"; break;
                    case 1: number = "2"; break;
                    case 2: number = "3"; break;
                    case 3: number = "4"; break;
                    case 4: number = "5"; break;
                    case 5: number = "6"; break;
                    case 6: number = "7"; break;
                    case 7: number = "8"; break;
                    case 8: number = "9"; break;
                    case 9: number = "10"; break;
                    case 10: number = "Jack"; break;
                    case 11: number = "Queen"; break;
                    case 12: number = "King";
                }


                String card = "X";
                if (deck[i] / 13 == 0) {
                    card = "Spades";
                }
                else if (deck[i] / 13 == 1) {
                    card = "Hearts";
                }
                else if (deck[i] / 13 == 2) {
                    card = "Diamonds";
                }
                else if (deck[i] / 13 == 3) {
                    card = "Clubs";
                }

                System.out.println(number + "  " + card);

            }


        }

         */

        //Solucion del libro

        int[] deck = new int[51];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        //Inicializar cartas
        for (int i = 0; i < deck.length; i++){
            deck[i]=i;
        }

        //Shuffle the card
        for (int i = 0; i < deck.length; i++){
           //Generate an index ramdomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        }

        //Display the first four cards
        for (int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

    }
}
