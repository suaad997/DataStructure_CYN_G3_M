package Arrays;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lab_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Arrayss arr=new Arrayss();
        int []numbers= new int[4];
        arr.input(numbers);
        arr.traversal(numbers);
        arr.revers_traversal(numbers);





        // numbers[3]=1;
       // System.out.println(Arrays.toString(numbers));
       // int []numbers={1,5,3,6,8};
//        for(int i=0; i<numbers.length;i++)
//            System.out.println(numbers[i]);



    }
}