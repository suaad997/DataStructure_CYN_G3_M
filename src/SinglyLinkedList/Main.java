package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeLast();
        list.display();

    }
}
