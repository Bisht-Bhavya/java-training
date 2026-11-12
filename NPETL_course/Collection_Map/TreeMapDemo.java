import java.util.*;
public class TreeMapDemo {
    public static void main(String[]args){
        TreeMap<String,Double> Lm= new TreeMap<String,Double>();
        Lm.put("John Doe", new Double(3434.34));
        Lm.put("Jane Doe", new Double(4545.45));
        Lm.put("Jack White", new Double(5656.56));
        Lm.put("Ki,ble Tartat", new Double(6767.67));
        Lm.put("Tod Hall", new Double(4354.34));

        //Get a set of entries
        Set<Map.Entry<String,Double>> set = Lm.entrySet();

        //Display the Elements
        for(Map.Entry<String,Double> me: set){
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
         //Same functions as hashmap
    }
}
