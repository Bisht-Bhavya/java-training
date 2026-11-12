import java.util.*;

public class Iteration {
    public static void main(String[]args){
        List<Integer> val = new ArrayList<>();
        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);

        //using iterator java 1.5
        System.out.println("Iterating the list using iterator");
        Iterator <Integer> intitr =val.iterator();
        while(intitr.hasNext()){
            int value = intitr.next();
            System.out.println(value);
            if( value == 3) intitr.remove();
        }

        //Enhanced force loop
        System.out.println("Iterating the list using for each");
        for(int value: val){
            System.out.println(value);
        }

        //using for each java 1.8
         System.out.println("Using the for each method");
        val.forEach((Integer e) -> System.out.println(e));
    }
}
