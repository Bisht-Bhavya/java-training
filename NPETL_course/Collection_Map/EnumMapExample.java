import java.util.EnumMap;
public class EnumMapExample {
    public enum SIZE{S,M,L,X};
    public static void main(String[]args){
        //Creating EnumMap in java with key as enum type STATE
        EnumMap<SIZE, String>enuMap = new EnumMap<SIZE, String>(SIZE.class);
        //Putting the values inside the EnumMap
        //inserting enum keys different from their natural order
        enuMap.put(SIZE.S, "Children");
        enuMap.put(SIZE.M,"young");
        enuMap.put(SIZE.L,"Aged");
        enuMap.put(SIZE.X,"Old");

        //Printing size of EnumMap in java
        System.out.println("Size of EnumMap:"+enuMap.size());
        //Printing java EnumMap
        System.out.println("EnumMap:"+enuMap);
        //Retrieving value from EnumMap in java
        System.out.println("Key: "+SIZE.S+" Value: "+enuMap.get(SIZE.S));
    }
}
