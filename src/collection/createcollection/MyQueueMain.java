package collection.createcollection;

public class MyQueueMain {

    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue(); // Output: Queue: 10 20 30

        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Peek: " + queue.peek());        // 20
        System.out.println("Size: " + queue.size());        // 2

        queue.printQueue(); // Output: Queue: 20 30
    }
}


class MyQueue<T> {
    private Object[] queueArray;
    private int front;      // points to the front element
    private int rear;       // points to the next insertion index
    private int size;
    private int capacity;

    // Constructor
    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    // Enqueue: Add element to the rear
    public void enqueue(T data) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        queueArray[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }

    // Dequeue: Remove and return front element
    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T removedData = (T) queueArray[front];
        queueArray[front] = null; // optional: clear reference
        front = (front + 1) % capacity;
        size--;
        return removedData;
    }

    // Peek: View front element without removing
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return (T) queueArray[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get current size of queue
    public int size() {
        return size;
    }

    // Print all elements from front to rear
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }


}