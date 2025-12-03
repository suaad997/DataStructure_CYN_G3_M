package SinglyLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size=0;

 public int size(){
     return size;
 }

 public boolean IsEmpty()
 {
     return size()==0;

 }
 public void  addFirst(E data){
     Node<E> newNode = new Node(data,head);
     head=newNode;
     if (size==0)
         tail=head;


     size++;

 }





}

 class Node<E>{
  private E data;
  Node<E> next;


  public Node( E data,Node<E> next){
      this.data=data;
      this.next=next;

  }
     public E getData() {
         return data;
     }

     public Node<E> getNext() {
         return next;
     }

     public void setData(E data) {
         this.data = data;
     }

     public void setNext(Node<E> next) {
         this.next = next;
     }
 }

