import java.util.ArrayList;


public class Listing11_10_MyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(11);
        myStack.push(27);
        myStack.push(12);
        myStack.push(96);
        System.out.println(myStack.toString());

        myStack.pop();
        System.out.println(myStack.toString());
    }
}

class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object ans = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return ans;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
