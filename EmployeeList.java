package employeelist;
import java.util.*;
public class EmployeeList {

    public static void main(String[] args) {
        String e[][]=new String[4][3];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the headings of the 3 employee details");
        for(int i=0;i<3;i++)
            e[0][i]=s.nextLine();
        System.out.println("Enter the 3 employee details in the same order");
        for(int i=1;i<4;i++){
            for(int j=0;j<3;j++)
                e[i][j]=s.nextLine();
        }
        System.out.println("The employee list:");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++)
                System.out.print(e[i][j]+" ");
            System.out.println();
        }
        
        
    }
    
}
