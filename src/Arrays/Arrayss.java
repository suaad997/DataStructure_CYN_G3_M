package Arrays;

import java.util.Scanner;

public class Arrayss {
Scanner scanner=new Scanner(System.in);
    public void traversal(int []numbers){
        System.out.println("These are the elements:");
        for(int num:numbers)
            System.out.println(num);
    }
    public void traversal2(int []numbers){

        for(int i=0; i<numbers.length;i++)
         System.out.println("index["+i+"] =  ,element="+numbers[i]);
    }
    public void revers_traversal(int []numbers){
        System.out.println("the reverse: ");

        for(int i=numbers.length-1; i>=0;i--)
            System.out.println("index["+i+"] =  ,element="+numbers[i]);
    }

    public void input(int []numbers){
        System.out.println("Please enter "+numbers.length+" numbers:");
        for(int i=0 ;i<numbers.length;i++)
            numbers[i]=scanner.nextInt();

    }
    public void update(int []a,int index,int value){
        if(index<0 || index>a.length)
            System.out.println("Index "+index+ " not found");
        else {
            a[index]=value;
        }
    }

    public void delete(int []a,int index){
        if(index<0 || index>a.length-1)
            System.out.println("Index "+index+ " not found");
        else
            a[index]=0;
    }

    public void ShiftLeft_delete(int []a,int index){
        if(index<0 || index>a.length-1)
            System.out.println("Index "+index+ " not found");
        else
            for(int i=index;i<a.length-1;i++)
                a[i]=a[i+1];

              a[a.length-1]=Integer.MIN_VALUE;




    }



    public int LinearSearch(int []a, int value){
        for(int i=0; i<a.length;i++){
            if(value==a[i])
                return i;

        }
        return -1;

    }

    public int BinarySearch(int []a,int findex,int lindex,int value){
        while (findex<=lindex){
            int mid=(findex+lindex)/2;
            if (value==a[mid])
                return mid;
            if (value>a[mid])
                findex=mid+1;
            if(value<a[mid])
                lindex=mid-1;


        }
        return -1;


    }


}
