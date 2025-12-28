package CircualyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> clist=new CircularLinkedList<>();
        clist.addFirst("Khalid");
        clist.addFirst("Hashem");
        clist.addFirst("Odi");
        clist.addLast("Mohammed");
        clist.addLast("Mohammed2");
        clist.removeFirst();
        clist.removeLast();
        clist.display();
    }
}
