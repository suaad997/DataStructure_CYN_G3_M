package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bTREE= new BinaryTree(10);
        bTREE.inserNode(5);
        bTREE.inserNode(2);
        bTREE.inserNode(7);
        bTREE.inserNode(12);
        bTREE.inserNode(11);
        bTREE.inserNode(15);
        System.out.println("searching 7: "+ bTREE.searchNode(7));
        System.out.println("Preorder Traversal:");
        bTREE.preOrder();
        System.out.println("Inorder Traversal:");
        bTREE.inOrder();
        System.out.println("Postorder Traversal:");
        bTREE.postOrder();






    }


}
