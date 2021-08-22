package collectionarraylist;
import java.util.ArrayList;

public class CollectionArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Jaguar");
        cars.add("Benz");
        cars.add("Audi");
        System.out.println("Size of the list is: "+cars.size());
        System.out.println("Cars list: "+cars);
        cars.remove(1);
        System.out.println("Size of the new list is: "+cars.size());
        System.out.println("Cars new list: "+cars);
    }
    
}
