import java.util.EnumSet;
import java.util.Iterator;

enum Color{RED,BLUE,GREEN, BLACK, WHITE, VIOLET, ORANGE, INDIGO}
public class EnumSetDemo {
        public static void main(String[]args){
            //Creating a Set
            EnumSet<Color> set1, set2,set3,set4,set5,set6;

            //Adding Elements
            set1 = EnumSet.of(Color.RED,Color.BLUE,Color.GREEN);
            set2 = EnumSet.complementOf(set1);
            set3 = EnumSet.allOf(Color.class);
            set4 = EnumSet.range(Color.BLACK, Color.VIOLET);
            set5 = EnumSet.copyOf(set2);
            set6 = EnumSet.noneOf(Color.class);

            System.out.println("Set 1: "+set1);
            System.out.println("Set 2: "+set2);
            System.out.println("Set 3: "+set3);
            System.out.println("Set 4: "+set4);
            System.out.println("Set4 contains RED? : "+set4.contains(Color.RED));

            //Traversing elements
            set5.forEach(System.out::println);
            //System.out.println("Set 5: "+set5);

            Iterator<Color> itor = set6.iterator();
            while(itor.hasNext())
                System.out.println(itor.next());
        }
}


