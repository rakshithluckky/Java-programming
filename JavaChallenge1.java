package javachallenge1;
import java.util.Scanner;

public class JavaChallenge1 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is a Prime Number");
        }
        else
            System.out.println(n+" is not a Prime Number");
    }
    
}
