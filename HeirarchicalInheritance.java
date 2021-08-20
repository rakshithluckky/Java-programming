package heirarchicalinheritance;

public class HeirarchicalInheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.print("Dog is Barking and ");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.print("Cat is meowing and ");
    }
}