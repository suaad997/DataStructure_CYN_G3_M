package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Arrayss arr=new Arrayss();
       // int []numbers= new int[4];
        int []numbers={1,4,3,4,5,2};

//        arr.input(numbers);
//        arr.traversal(numbers);
//        arr.revers_traversal(numbers);

       // System.out.println(Arrays.toString(numbers));

//arr.update(numbers,0,4);
        // arr.delete(numbers,3);

        //int result=arr.LinearSearch(numbers,2);
        Arrays.sort(numbers);
        //arr.traversal(numbers);
        int result=arr.BinarySearch(numbers,0,numbers.length-1,2);

        //   arr.traversal(numbers);
        System.out.println(result);


    }
}