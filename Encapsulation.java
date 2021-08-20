package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        DemoName d = new DemoName();
        d.setName("C.RAKSHITH");
        System.out.println("My name is "+d.getName());
    }
    
}
class DemoName{
    private String name;
   
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        this.name=newName;
    }
}