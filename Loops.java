
package loops;
//Program to find number of small letters, capital letters and spaces in a given string
import java.util.*;
public class Loops {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str= sc.nextLine();
        System.out.println("The length of the string you have entered:"+ str.length());
       int s=0,c=0,spc=0;
       char ch;
       //For Loop:
       for(int i=0;i<str.length();i++){
           ch=str.charAt(i);
           if(ch>='a'&&ch<='z'){
               s++;
           }
       }
       System.out.println("The no.of small letters in the given string:"+s);
       
       //While Loop:
       int i=0;
       while(i<str.length()){
           ch=str.charAt(i);
           if(ch>='A'&&ch<='Z'){
               c++;
            }
           i++;
        }
        System.out.println("The no.of CAPITAL letters in the given string:"+c);
    
        //Do While Loop:
        int j=0;
        do{ 
            ch=str.charAt(j);
            if(ch==' '){
                spc++;
            }
            j++;
        }while(j<str.length());
        System.out.println("The no.of blank spaces in the given string:"+spc);
    }    
}