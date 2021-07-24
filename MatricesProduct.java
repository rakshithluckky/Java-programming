package matricesproduct;

import java.util.Scanner;

public class MatricesProduct {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Dimension of the matrix:");
        int x=s.nextInt();
        int y=s.nextInt();
        int[][] m1=new int[x][y];
        int[][] m2=new int[x][y];
        int[][] m3=new int[x][y];
        
        if(x==y){
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
            System.out.println("Product of the matrices:");
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    m3[i][j]=0;
                    for(int k=0;k<x;k++)
                        m3[i][j]+=m1[i][k]*m2[k][j];
                }
            }
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++)
                    System.out.print(m3[i][j]+" ");
                System.out.println("");
            }
        }
        else{
            System.out.println("Enter equal Dimensions");
        }
    }
    
}
