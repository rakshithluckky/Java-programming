package variable;

public class Variable {
    int b = 33; //Instance Variable
    static int c = 432; //Static Variable
    
    public static void main(String[] args) {
        int a = 4; //Local Variable
        Variable obj = new Variable();
        System.out.println("Local Variable : "+a);
        System.out.println("Instance Variable : "+obj.b);
        System.out.println("Static Variable : "+Variable.c);
        //System.out.println("Static Variable : "+obj.c); <---This can be also used instead.
    }
    
}
