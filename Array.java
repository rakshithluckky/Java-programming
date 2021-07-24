package array;

import java.util.*;
public class Array {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter the array");
        for(int i=0;i<5;i++)
            a[i]=s.nextInt();
        System.out.println("Output");
        for(int x:a){
            System.out.println(x);
        }
    }
    
}
