public class MyStack {
    // implement stack using an array
    private int capacity;
    private int[] array;
    private int currentTopIndex;

    MyStack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.currentTopIndex = -1;
    }

    void push(int element) {
        //point to the top element
        if (!this.isFull()) {
            System.out.println("Inserting element: " + element + " into the stack");
            this.currentTopIndex = this.currentTopIndex + 1;
            this.array[this.currentTopIndex] = element;
            //this.top++;
        } else {
            expandArray();
            push(element);
            System.out.println("The stack is full, increasing stack size and pushing.");
        }
    }

    int pop() {
        //removes the top element and returns it
        if (!this.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("Removing / popping element: " + " from the stack");
            int el = this.array[this.currentTopIndex];
            this.array[this.currentTopIndex] = 0; //reset element to 0
            this.currentTopIndex = this.currentTopIndex - 1;
            return el;
        }
    }

    int peek(){
        //returns the last element in the array without removing it.
        int el = this.array[this.currentTopIndex];
        System.out.println("Peek of the stack is : " + el);
        return el;
    }

    boolean isEmpty(){
        return currentTopIndex == -1;
        //starting point is index 0, so -1 indicates stack is empty
    }

    boolean isFull(){
        return this.currentTopIndex == 14;
        //When capacity is 2
        //But why is it -1 instead of 1?
    }

    void expandArray(){
        capacity *= 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < array.length; i++)
            newArray[i] = array[i];
        array = newArray;
    }
}
