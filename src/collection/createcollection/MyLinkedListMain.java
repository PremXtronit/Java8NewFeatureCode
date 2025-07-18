package collection.createcollection;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList<T> {
    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
        }
        size++;
    }

    public void add(int index, T data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> ptr = head;
            for (int i = 0; i < index - 1; i++) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
        size++;
    }


    // Remove first occurrence of element
    public boolean remove(T data) {
        if (head == null) return false;

        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> ptr = head;
        while (ptr.next != null && !ptr.next.data.equals(data)) {
            ptr = ptr.next;
        }

        if (ptr.next == null) return false;

        ptr.next = ptr.next.next;
        size--;
        return true;
    }

    // Check if list contains an element
    public boolean contains(T data) {
        Node<T> ptr = head;
        while (ptr != null) {
            if (ptr.data.equals(data)) {
                return true;
            } else {
                //move
                ptr = ptr.next;
            }
        }
        return false;
    }

    // Get element at index
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node<T> ptr = head;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return ptr.data;
    }

    // Return ptr size
    public int size() {
        return size;
    }

    // Print list elements
    public void printList() {
        Node<T> ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}


public class MyLinkedListMain {

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.printList(); // 10 -> 20 -> 30 -> null

        list.remove(20);
        list.printList(); // 10 -> 30 -> null

        System.out.println("Contains 30? " + list.contains(30)); // true
        System.out.println("Element at index 1: " + list.get(1)); // 30
        System.out.println("Size: " + list.size()); // 2
    }
}

//Let me know if you want a doubly linked list, or support for reverse traversal, iterator, or ds.sorting too!