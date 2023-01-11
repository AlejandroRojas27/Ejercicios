package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_11_19_BinPackingUsingFirstFit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of objects: ");
        int num = input.nextInt();

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < num; i++) {

        }



        ArrayList<Integer> weight = new ArrayList<>();

        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < num; i++) {
            weight.add(input.nextInt());
        }

        ArrayList<Container> containers = new ArrayList<>();

        for (int i = 0; i < weight.size(); i++) {


            for (int j = i; j < weight.size(); j++) {

                if (weight.get(i) + weight.get(j) == 10 && i != j) {

                    Container x = new Container();
                    x.setWeight(weight.get(i));
                    x.setWeight(weight.get(j));

                    containers.add(x);

                    weight.remove(i);
                    weight.add(i, 0);
                    weight.remove(j);
                    weight.add(j, 0);

                    break;
                }

            }


        }

        weight.removeAll(Collections.singleton(0));

        while (!weight.isEmpty()) {

            Container x = new Container();

            int a = 0;
            while (x.getWeight() + a < 10) {
                a = weight.get(0);
                x.setWeight(a);
                weight.remove(0);
            }
            containers.add(x);
        }


        //Print

        for (int i = 1; i <= containers.size(); i++) {
            System.out.println("Container " + i + " contains objects with weight " + containers.get(i - 1));
        }


    }

}

class Container {
    private int weight;

    private ArrayList<Integer> contains = new ArrayList<>();

    public Container() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        contains.add(weight);
        this.weight += weight;
    }

    public boolean isFull() {
        return weight == 10;
    }

    public void setFull() {
        this.weight = 10;
    }

    @Override
    public String toString() {
        return contains.toString();
    }
}
