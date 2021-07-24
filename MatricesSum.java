
package matricessum;

import java.util.*;

public class MatricesSum {
    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Dimension of the matrix:");
        int x=s.nextInt();
        int y=s.nextInt();
        int[][] m1=new int[x][y];
        int[][] m2=new int[x][y];
        System.out.println("Enter the input for 1st matrix:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)
                m1[i][j]=s.nextInt();
        }
        System.out.println("Enter the input for 2nd matrix:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)
                m2[i][j]=s.nextInt();
        }
        System.out.println("Sum of the matrices:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++)
                System.out.print(m1[i][j]+m2[i][j]);
            System.out.println("");
        }
    }
    
}
