package mintoyears;

import java.util.Scanner;
public class MintoYears {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter time in Minutes");
        int min= s.nextInt();
        float hours=min/60;
        float days= hours/24;
        float years= days/365;
        int intyears= (int)years;
        int remdays= (int)((years-intyears)*365);
        System.out.println("Minutes is converted to "+intyears+" Years and "+remdays+" Days");
    }
    
}
