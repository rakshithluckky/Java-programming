package runtimepolymorphism;

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Parent a= new Child();
        a.print();
    }
    
}
class Parent{
    void print(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void print(){
        System.out.println("Child");
    }
}