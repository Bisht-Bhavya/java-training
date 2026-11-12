import java.util.*;

public class HashSetDemo {
    public static void main(String[] args){
        //Create  a hash set
        HashSet<String> hs = new HashSet<String>();

        //Add the elements
        hs.add("India");
        hs.add("Japan");
        hs.add("Australia");
        hs.add("Bangladesh");
        hs.add("Pakistan");
        hs.add("Nepal");
        System.out.println(hs);

        //Create a hash set from a collection
        List<Integer> list = Arrays.asList(3,9,2,4,6,7,5,3,8,9,1,7,8,6);
        System.out.println(list);

        HashSet<Integer> uniqueNumbers = new HashSet<>(list);
        System.out.println(uniqueNumbers);

        Set<Integer> bigset = new HashSet<>(1000);
        for(int i = 0; i < 1000; i++){
            bigset.add((int) Math.random());
        }
        System.out.println("If 555 is in the bigset ?" + bigset.contains(555));

        //Traversing the set

        //Using simple for-each loop
        for(String pl: hs){
            System.out.print(pl +" ");
        }System.out.println();

        //Using iterator
        Iterator<String> iter = hs.iterator();
        while(iter.hasNext()){
            String pl = iter.next();
            System.out.print(pl+" ");
        }System.out.println();

        //Using ForEach and lambda exp
        //hs.forEach(System.out::println);
        hs.forEach(pl -> {
            System.out.print(pl+" ");
        }); System.out.println();

        //Using iterator() and forEachRemaining() method
        iter = hs.iterator();
        iter.forEachRemaining((pl) ->{
            System.out.print(pl+" ");
        }); System.out.println();

        //Basic set theory operation

        //Sub Set Operation
        Set<Integer> s1 = new HashSet<>(Arrays.asList(20,56,89,31,8,5));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(8,89));
        if(s1.contains(s2)){
            System.out.println("s2 is a subset of s1");
        }

        //Union Operation
        Set<Integer> s3 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        Set<Integer> s4 = new HashSet<>(Arrays.asList(2,4,6,8));
        System.out.println("s3 before union: "+s3);
        s3.addAll(s4);
        System.out.println("s3 after union: "+s3);

        //Intersection operation
        Set<Integer> s5 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
        Set<Integer> s6 = new HashSet<>(Arrays.asList(2,4,6,8));
        System.out.println("s5 before intersection: "+ s5);
        s5.retainAll(s6);
        System.out.println("s5 after intersection: "+ s5);

        //Set difference operation
        Set<Integer> s7 = new HashSet<>(Arrays.asList(1,2,3,4,5,7,9));
        Set<Integer> s8 = new HashSet<>(Arrays.asList(2,4,6,0));
        System.out.println("s7 before difference: " + s7);
        s7.removeAll(s8);
        System.out.println("s7 after difference: " + s7);
    }
}
