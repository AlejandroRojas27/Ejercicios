package ProgrammingExercisesCAP11;

import java.util.ArrayList;

public class Ejercicio_11_7_ShuffleArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(4);
        list.add(7);
        System.out.println(list);


        shuffle(list);

    }

    public static void shuffle(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int j = (int)(Math.random() * list.size());
            list.add(i,list.remove(j));
        }

        System.out.println(list);
    }
}
