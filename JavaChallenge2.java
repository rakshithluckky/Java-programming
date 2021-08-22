package javachallenge2;
import java.util.Scanner;

public class JavaChallenge2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the starting two numbers:");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter the range number:");
        int r=s.nextInt();
        System.out.println("Fibonacci Series with this two numbers as starting is:");
        System.out.print(a+" "+b);
        for(int i=0;i<r;i++){
            c=a+b;
             System.out.print(" "+c);
             a=b;
             b=c;
        }
    }
    
}
