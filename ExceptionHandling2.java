package exceptionhandling2;
//User-Defined Exception
//Using Chinese Remainder Theorem
import java.io.*;

class Sample{
    void Sopln(Object o){
        System.out.println(o);
    }
}

class MyExc extends Exception{
    public String toString(){
        return "Number should be positive";
    }
}

public class ExceptionHandling2 {
    static Sample s = new Sample();
    
    public static int calc(int[] arr, int[] rem)throws MyExc{
        for(int i=0;i<3;i++){
            if(arr[i]<0||rem[i]<0)
                throw new MyExc();
        }
        int x=1;
        while(true){
            int i;
            for(i=0;i<3;i++){
                if(x%arr[i]!=rem[i])
                    break;
            }
            if(i==3)
                return x;
            x++;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int i;
            int[] arr= new int[3];
            int[] rem= new int[3];
            s.Sopln("Enter the numbers");
            for(i=0;i<3;i++){
                arr[i]=Integer.parseInt(br.readLine());
            }
            s.Sopln("Enter the remainders");
            for(i=0;i<3;i++){
                rem[i]=Integer.parseInt(br.readLine());
            }
            s.Sopln(calc(arr,rem));
        }
        catch(Exception e){
            s.Sopln(e.getClass()+"___"+e.toString());
        }
    }
    
}
