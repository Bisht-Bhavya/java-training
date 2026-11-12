import java.util.*;
public class SynchronizedMap {
public static void main(String[]args){
    //Create two map Object containers
    Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());
    //Create the Map
    map.put(400,"Bad Request");
    map.put(304,"Not Modified");
    map.put(200,"OK");
    map.put(301,"Moved Permanently");
    map.put(500,"internal Server Error");

    Set<Integer> keyset = map.keySet();
    synchronized (map){
        Iterator<Integer> iterator = keyset.iterator();
        while(iterator.hasNext()){
            Integer key = iterator.next();
            String value = map.get(key);
        }
    }
    System.out.println(map);
}
}
