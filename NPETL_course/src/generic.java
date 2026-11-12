import static java.lang.IO.print;

class specifivarr{
    int[] a;
    specifivarr(int[] a){
        this.a = a;
    }

    void printInt(){
        for(int x: a){
            System.out.print(x);
        }
        System.out.println();
    }
}

class genericlass<T>{
    private T x;
    public genericlass(T x){
        this.x = x;
    }

    public void printdata(){
        System.out.println(x);
    }

}

class GenericArr<P> {
    private P[] a;

    GenericArr(P[] x) {
        a = x;
    }

    P getData(int i) {
        return a[i];
    }

    void printData() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class gen{
    static int x;
    public gen(int x){
        this.x = x;
    }
    public static void print(){
        System.out.println(x);
    }
}
public class generic {
  public static void main(String[]args){
      specifivarr cons = new specifivarr(new int[]{1, 2, 3, 4, 5, 6});
      cons.printInt();

      //Now Generic Classes
      genericlass<String> strarr = new genericlass<String>("Java");
      strarr.printdata();

      Integer[] x = {1, 2, 3, 4, 5};
      GenericArr<Integer> genarr = new GenericArr<>(x);
      genarr.printData();

      GenericArr<Character> chararr = new GenericArr<>(new Character[]{'a', 'v', 'd'});
      chararr.printData();

      //More generic
      gen obj = new gen(123);
      gen.print();
  }
}
