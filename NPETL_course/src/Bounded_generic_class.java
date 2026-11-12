class genericbound<T extends Number>{
    T[] array;
    genericbound(T[] t){
        array = t;
    }
    double average(){
        double sum =  0.0;
        for(int  i =0 ;i < array.length;i++){
            sum += array[i].doubleValue();
        }
        return sum / array.length;
    }
}
public class Bounded_generic_class {

    public static void main(String []args){
        genericbound<Integer> obj1 = new genericbound<>(new Integer[] {1,2,3,4,5,6});
        System.out.println(obj1.average());
    }

}
