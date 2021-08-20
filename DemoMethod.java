package demomethod;

public class DemoMethod {

    public static void main(String[] args) {
        int a=9;
        System.out.println("Square of the number "+a+" is: "+Math.sqrt(a)+" and the value is found using Standard Library Method");
        myMethod();//User Defined Method is called
    }
    public static void myMethod(){
        System.out.println("User Defined Method is called");
    }
}
