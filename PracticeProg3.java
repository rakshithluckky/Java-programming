package practiceprog3;

public class PracticeProg3 {

    public static void main(String[] args) {
        Addition add=new Addition();//Creating instance of addition
        int s= add.addTwoInt(1,2);//Calling addTwoInt method to add two integers using instance created
        System.out.println("Sum of two integers is:"+s);
    }
    
}

class Addition{
    int sum=0;
    public int addTwoInt(int a, int b){
        sum=a+b;
        return sum;
        
    }
}