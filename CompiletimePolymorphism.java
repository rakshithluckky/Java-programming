package compiletimepolymorphism;

public class CompiletimePolymorphism {

    public static void main(String[] args) {
        System.out.println(Multiply.mul(5,5));
        System.out.println(Multiply.mul(2.5,3.5));
        System.out.println(Multiply.mul(3.4,4.6,7.8));
        
    }
    
}
class Multiply{
    static int mul(int a, int b){
        return a*b;
    }
    static double mul(double a, double b){
        return a*b;
    }
    static double mul(double a, double b, double c){
        return a*b*c;
    }
}