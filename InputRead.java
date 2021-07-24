/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.io.*;
/**
 *
 * @author admin
 */
public class InputRead {



    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
}
   
 
    

