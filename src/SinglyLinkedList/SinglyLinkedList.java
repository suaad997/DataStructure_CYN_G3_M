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
 public E getFirst(){
     if(IsEmpty())return null;
     return head.getData();
 }

 public E removeFirst(){
     if(IsEmpty()) return null;
     E delete= head.getData();
     head=head.getNext();
     size--;
     if (IsEmpty())
     {
         tail=head;
     }
     return delete;
 }

 public void addLast(E data){
     Node<E> newNode= new Node(data,null);
     if(IsEmpty())
         head=newNode;
     else
         tail.setNext(newNode);
     tail=newNode;
     size++;
 }

 public E getLast(){
     if(IsEmpty())return null;
     return tail.getData();
 }
 public E removeLast(){
     E delete = tail.getData();
     if(head ==tail){
         head=null;
         tail=null;
     }
     else {
         Node<E> temp=head;
         while (temp.getNext()!=tail){
             temp=temp.getNext();}

         temp.setNext(null);
         tail=temp;
     }
     size--;
     return delete;
 }
 public void display(){
        Node<E> temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+"----->");
            temp=temp.getNext();
        }
     System.out.println("null \n");

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

