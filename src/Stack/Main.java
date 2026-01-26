package Stack;

public class Main {
    public static void main(String[] args) {
        //SlinkedStack<Integer> aStack=new SlinkedStack<Integer>();
        //DlinkedStack<Integer> aStack=new DlinkedStack<Integer>();
        ArrayStack<Integer> aStack=new ArrayStack<Integer>();


        aStack.push(10);
        aStack.push(20);
        aStack.push(30);
        aStack.push(40);
        aStack.push(50);
        System.out.println("top is :"+aStack.top());

        while (!aStack.isEmpty()){
            System.out.println("element removed :"+aStack.pop());
        }





    }
}
