import java.util.*;
public class HashMapDemo  {
    public static void main(String[]args){
        HashMap<String, String> hmap = new HashMap<String, String>();

        //put elements in the container
        hmap.put("1", "OK" );
        hmap.put("2", "See Other" );
        hmap.put("3", "Not Found" );
        hmap.put("4", "Internal Server Error" );
        //System.out.println(hmap);
        Set<String> setCode = hmap.keySet();
        Iterator<String> iterator = hmap.keySet().iterator();
        while (iterator.hasNext()){
            String code = iterator.next();
            String country = hmap.get(code);
            System.out.println(code+"->"+country);
        }

        //Collection view using values
        Collection<String> countries = hmap.values();
        for (String country: countries){
            System.out.println(country);
        }

        //Collection view using entry set
        Set<Map.Entry<String,String>> entries = hmap.entrySet();
        for(Map.Entry<String,String>entry : entries ){
            String code = entry.getKey();
            String country = entry.getValue();
            System.out.println(code+"->"+country);
        }

        //Collection using Lambda expression
        hmap.forEach((code,country) ->
                System.out.println(code +"->"+ country)
                );
    }
}
