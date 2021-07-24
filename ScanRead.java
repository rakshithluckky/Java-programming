package scanread;

import java.util.*;

public class ScanRead {

    public static void main(String[] args) {
    //for integers
        Scanner s=new Scanner (System.in);
        
        int a=s.nextInt();
        
        if(a%2==0)
            System.out.println("Even");
        else if(a%2==1)
            System.out.println("Odd");  
        
    //for strings
        //String clg=new String();//blank string of needed to assign later
        String name="Rakshith";//default value
        Scanner b=new Scanner(System.in);
        System.out.println("Enter clg name");  
        String clg=b.nextLine();
        System.out.println("Name:"+name+"College:"+clg);  
    }
    
}
