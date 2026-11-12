import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Bird{
    void canfly();
}
//Implementation of functional interface
class Eagle implements Bird{
    @Override
    public void canfly(){
        System.out.println("Eagle can fly");
    }
}
public class Functional_interfaces {
 public static void main(String[]args){
     Eagle obj = new Eagle();
     obj.canfly();

     //Implementation of "Anonymous Class"
     Bird eagleobj = new Bird(){
         @Override
         public void canfly(){
             System.out.println("Anonymous eagle can fly");
         }
     };
     eagleobj.canfly();

     //Implementation of "Lambda Expression"
     Bird pigeonobj = ()->{
         System.out.println("Pigeon can fly");
     };
     pigeonobj.canfly();

     //Type of functional interfaces

     Consumer<Integer> consume = (Integer val)->{
         if(val < 11){
             System.out.println("Logged in");
         }
     };
     consume.accept(10);

     Supplier<String> supply = ()->"Please accept my request";
     System.out.println(supply.get());
/*  Equivalent to
Supplier<String> supply = ()->{
return "Please accept my request"
};
     System.out.println(supply.get());
 */

     Function<Integer,Integer> square = (Integer x) -> {
         int r = x*x;
         return r;
     };
     System.out.println("Square of "+4+" is "+square.apply(4));

     Predicate<Integer> age = (Integer x)->{
       if(x > 18){
           return true;
       }else {
           return false;
       }
     };
     System.out.println("The age of consent is 18 "+ age.test(19));
 }
}
