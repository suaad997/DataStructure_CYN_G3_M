package BinaryTree;

public class BinaryTree {
 private Node root;

 public BinaryTree(int rootValue) {
        root=new Node(rootValue,null,null);

    }

 private void insert(Node newNode, Node rnode){
     if(newNode.getValue()> rnode.getValue()){
         if(rnode.getRight()==null)
             rnode.setRight(newNode);

         else
             insert(newNode,rnode.getRight());
     }
     else if(newNode.getValue() < rnode.getValue()){
         if(rnode.getLeft()==null)
             rnode.setLeft(newNode);

         else
             insert(newNode,rnode.getLeft());
     }

     else System.out.println("can't insert duplicated values");

 }
 public void inserNode(int value){
     Node newNode =new Node(value,null,null);
     insert(newNode,root);

 }



 private boolean search(int svalue, Node rnode){
     if(rnode==null) return false;
     if(svalue> rnode.getValue())
         return search(svalue,rnode.getRight());

     else if(svalue <rnode.getValue())
         return search(svalue,rnode.getLeft());
     else return true;

 }
 public boolean searchNode(int svalue){
     return search(svalue,root);
 }


private void preOrderT(Node rnode){
     if(rnode==null)return;
    System.out.print(rnode.getValue()+" ");
    preOrderT(rnode.getLeft());
    preOrderT(rnode.getRight());

}
public void preOrder(){
preOrderT(root);
    System.out.println();
    }
/// ///////////////
private void inOrderT(Node rnode){
        if(rnode==null)return;
        inOrderT(rnode.getLeft());
    System.out.print(rnode.getValue()+" ");
    inOrderT(rnode.getRight());

    }
public void inOrder(){
        inOrderT(root);
        System.out.println();
    }

 ///////////////

private void postOrderT(Node rnode){
        if(rnode==null)return;
        postOrderT(rnode.getLeft());
        postOrderT(rnode.getRight());
    System.out.print(rnode.getValue()+" ");


}
public void postOrder(){
        postOrderT(root);
        System.out.println();
    }




    class Node{
    private int value;
    private Node left;
    private Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}


}
