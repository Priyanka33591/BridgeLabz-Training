public class StackImplementationUsingArray {

    static class Stack{
    static final int MAX = 1000;
    int top;
    int[] stack = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack is full");
            return false;
        } else {
            top++;
            stack[top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int x = stack[top];
            top--;
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else { 
            int x = stack[top];
            return x;
        }
    }
}
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.push(10)); //10
        System.out.println(stack.push(20)); //20, 10
        System.out.println(stack.push(30)); //30, 20, 10
        System.out.println(stack.push(40)); //40, 30, 20, 10
        System.out.println(stack.pop() + " Popped from stack"); //40
        System.out.println(stack.peek() + " is the peek element of stack"); //30
        System.out.println(stack.push(50)); //50, 30, 20, 10
        System.out.println(stack.peek() +  " is the peek element of stack"); //50

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
