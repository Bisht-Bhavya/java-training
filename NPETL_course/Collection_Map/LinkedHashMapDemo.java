import java.util.*;
public class LinkedHashMapDemo {
    private static final int Max = 6;
    public static void main(String[]args){
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>(){
          protected boolean removeEldestEntry(Map.Entry<Integer,String> oldest){
              return size() > Max;
          }
        };

        //Adding elements using put
        lhm.put(0,"Welcome");
        lhm.put(1,"To");
        lhm.put(2,"The");
        lhm.put(3,"World");
        lhm.put(4,"Of");
        lhm.put(5,"Java");

        System.out.println();

        //Adding more elements;
        lhm.put(6,"Joy with Java");

        //Display the map after adding one more element
        System.out.println("" + lhm);

        //Adding more Element
        lhm.put(7,"Hello");

        //Displaying the map alter after adding one more element
        System.out.println("" + lhm);
    }
}
