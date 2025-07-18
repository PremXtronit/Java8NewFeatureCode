package collection.createcollection;

public class MyStackMain {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack:");
        stack.printStack(); // Output: 30 20 10

        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top: " + stack.peek());   // 20
        System.out.println("Size: " + stack.size());  // 2

        stack.printStack(); // Output: 20 10
    }

}

class MyStack<T> {

    private Object[] stackArray;
    private int capacity;
    private int top;

    // Constructor
    public MyStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new Object[capacity];
        this.top = -1;
    }

    // Push element to top of stack
    public void push(T data) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        stackArray[++top] = data;
    }

    // Pop element from top of stack
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return (T) stackArray[top--];
    }

    // Peek at the top element
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (T) stackArray[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Get size of the stack
    public int size() {
        return top + 1;
    }

    // Print stack contents from top to bottom
    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }


}