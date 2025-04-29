package datastructure;


public class SinglyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.insertAtEnd(10);
        myLinkedList.insertAtEnd(20);
        myLinkedList.insertAtEnd(30);
        myLinkedList.insertAtPos(40, 2);
        myLinkedList.display();



        myLinkedList.search(30);
        myLinkedList.display();


    }

}
