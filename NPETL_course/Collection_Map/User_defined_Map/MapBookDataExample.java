package User_defined_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapBookDataExample {
    public static void main(String[]args){
        //Create map of books
        Map<Integer,Book> map = new LinkedHashMap<Integer, Book>();

        //Create Books
        Book b1 = new Book(101,"Python","Pon Ling","Oxford",8);
        Book b2 = new Book(102,"Java","Spiolborg","McCraw Hill", 4);
        Book b3 = new Book(103,"C++","Galvin","Willey", 6);

        //Adding Books to Map
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        //Traversing the Map
        for(Map.Entry<Integer, Book> entry: map.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
