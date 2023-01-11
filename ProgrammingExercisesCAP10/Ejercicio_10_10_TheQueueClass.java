package ProgrammingExercisesCAP10;

import java.util.Arrays;

public class Ejercicio_10_10_TheQueueClass {
    public static void main(String[] args) {

        Queue queue = new Queue();

        for (int i = 1; i < 21; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }

    }
}

class Queue {

    /**
     * An int[] data field named elements that stores the int values in the queue.
     */
    private int[] elements;

    /**
     * A data field named size that stores the number of elements in the queue.
     */
    private int size;

    /**
     * A constructor that creates a Queue object with default capacity 8.
     */

    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    /**
     * The method enqueue(int v) that adds v into the queue.
     */
    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = v;
    }

    /**
     * The method dequeue() that removes and returns the element from the queue.
     */
    public int dequeue() {
        int ret = elements[size - 1];

        int[] temp = new int[--size];
        System.arraycopy(elements, 0, temp, 0, temp.length);
        elements = temp;

        return ret;
    }

    /**
     * The method empty() that returns true if the queue is empty.
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * The method getSize() that returns the size of the queue.
     */
    public int getSize() {
        return size;
    }


}
