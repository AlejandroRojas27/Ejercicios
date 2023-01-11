package ProgrammingExercisesCAP7;

public class Ejercicio_7_24_SimulationCouponCollectorsProblem {
    public static void main(String[] args) {
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



        String suit1 = " ";
        String rank1 = " ";
        String suit2 = " ";
        String rank2 = " ";
        String suit3 = " ";
        String rank3 = " ";
        String suit4 = " ";
        String rank4 = " ";




        int countSpades = 0;
        int countHearts = 0;
        int countDiamonds = 0;
        int countClubs = 0;


        for (int i = 0; i < deck.length; i++){

            if(deck[i] / 13 == 0 && countSpades == 0){
                suit1 = suits[deck[i] / 13];
                rank1 = ranks[deck[i] % 13];
                System.out.println(rank1 + " of " + suit1);
                countSpades++;

            }
            else if(deck[i] / 13 == 1 && countHearts ==0){
                suit2 = suits[deck[i] / 13];
                rank2 = ranks[deck[i] % 13];
                System.out.println(rank2 + " of " + suit2);
                countHearts++;

            }
            else if(deck[i] / 13 == 2 && countDiamonds == 0){
                suit3 = suits[deck[i] / 13];
                rank3 = ranks[deck[i] % 13];
                System.out.println(rank3 + " of " + suit3);
                countDiamonds++;

            }
            else if(deck[i] / 13 == 3 && countClubs == 0){
                suit4 = suits[deck[i] / 13];
                rank4 = ranks[deck[i] % 13];
                System.out.println(rank4 + " of " + suit4);
                countClubs++;

            }

            int countSuits = countDiamonds+countClubs+countHearts+countSpades;

            if(countSuits == 4){
                System.out.println("Number of picks: " + (i + 1));
                break;
            }
        }

    }
}
