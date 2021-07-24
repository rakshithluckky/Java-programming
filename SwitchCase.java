
package switchcase;
import java.util.*;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b= a%2;
        switch(b){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            
        }
    }
    
}
