public class MyStack {
    // implement stack using an array
    private int capacity;
    private int[] array;
    private int top;

    MyStack(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    void push(int element){
        //point to the top element
       if (!this.isFull()){
           System.out.println("Inserting element: " + element + " into the stack");
           this.top = this.top + 1;
           this.array[this.top] = element;
           //this.top++;
       } else {
           System.out.println("Stack is full");
       }
    }

    int pop(  ){
        //removes the top element and returns it
        System.out.println("Removing / popping element: " + " from the stack");
        int el = this.array[this.top];
        this.array[this.top] = 0; //reset element to 0
        this.top = this.top - 1;
        return el;
    }

    int peek(){
        //returns the last element in the array without removing it.
        int el = this.array[this.top];
        System.out.println("Peek of the stack is : " + el);
        return el;
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return this.top == 14;
        //return this.top == this.capacity -1;
        //When capacity is 2
        //But why is it -1 instead of 1?
    }
}
