package exceptionhandling1;
//In-Built Exeptions Handling.
import java.io.*;

class Sample{
    void Sopln(Object o){
        System.out.println(o);
    }
}
public class ExceptionHandling1 {
    static Sample s = new Sample();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        try{
            s.Sopln("Enter the two numbers");
            a= Integer.parseInt(br.readLine());
            b= Integer.parseInt(br.readLine());
            int c = a/b;//throws exception when divided by 0
            s.Sopln(c+" is the result");
            s.Sopln("Array output");
            int[] arr= new int[4];
            s.Sopln(arr[3]);//throws exception
            s.Sopln("Enter the String");
            String str= br.readLine();
            for(int i=0;i<=str.length();i++){//with exception
                char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    s.Sopln("Vowel Found");
                }
            }
            
        }
        catch(ArithmeticException | NumberFormatException e){//multicatch
            s.Sopln(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            s.Sopln(e.getMessage());
        }
        catch(Exception e){//used when exception type is unknown and only used at last
            s.Sopln(e.getClass()+" "+e.getMessage());
        }
        finally{//always use after all catches and also runs if there is any exception
            s.Sopln("Program Executed Successfully");
        }
    }
    
}
