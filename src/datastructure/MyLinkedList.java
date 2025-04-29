package datastructure;


public class MyLinkedList {


    protected Node start;
    protected Node end;
    public int size;

    public MyLinkedList() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    public void insertAtEnd(int val) {

        Node nptr = new Node(val, null);
        size++;

        if (start == null) {
            start = nptr;
            end = nptr;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
    }


    public void insertAtStart(int val) {
        Node nptr = new Node(val, null);
        size++;
        if (start == null) {
            start = nptr;
            end = nptr;
        } else {
            nptr.setLink(start);
            start = nptr;
        }
    }


    public void insertAtPos(int val, int pos) {
        Node nptr = new Node(val, null);
        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public void display() {
        System.out.println("Singly Linked List");
        if (size == 0) {
            System.out.print("empty\n");
            return;
        }
        Node ptr = start;

        while (ptr != null) {
            System.out.println(ptr.getData());
            ptr = ptr.getLink();
        }
    }

    public void search(int i) {

        Node ptr = start;
        while (ptr != null) {
            if (ptr.getData() == i) {
                System.out.println(i);
                break;
            }
            ptr = ptr.getLink();
        }
    }

    public void delete(int i) {

        if (size == 0) {
            System.out.println("List is empty");
        }


        Node ptr = start;

        if (start.getData() == i) {
            start = start.getLink();
            size--;
            return;
        }


        while (ptr.getData() != i) {

        }

    }
}
