package abstraction;

public class Abstraction {

    public static void main(String[] args) {
        Shape s = new Circle(2.5);
        System.out.println(s.toString());
    }
    
}

abstract class Shape{
    abstract double area();
    public abstract String toString();
}
class Circle extends Shape{
   double r;
   Circle(double r){
       this.r=r;
   }
   double area(){
       return Math.PI*Math.pow(r, 2);
   }
   public String toString(){
       return "Area of the circle: "+area();
   }
}