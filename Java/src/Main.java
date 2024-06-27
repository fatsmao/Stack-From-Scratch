//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(15);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}