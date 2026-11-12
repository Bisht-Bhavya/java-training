public class test {
    <dog,cat>  void hello(dog t, cat g){
        System.out.println(t +" "+ g);
    }

    static void tell(){
        System.out.println("This is a static function");
    }

    static <T>void varargs(T[] t, T[]p){
        System.out.println("No fo parameters "+t.length );
        for(T x:t){
            System.out.print(x);
        }
        System.out.println();
        for(T x:p){
            System.out.print(x);
        }
        System.out.println();
    }

    static void ellip(int ...v){
        for(int x:v)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void top(Object ...obj){
        for(Object x:obj)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[]args){
     test obj = new test();
     obj.hello("Hello","By by pussiee");
     tell();
     Integer[] digitarr = {1,2,3,4};
     Character[] chararr = {'l','p'};
     varargs(digitarr,chararr);
     ellip(12,54,76,97);
     top(1,"hello", 'c',35.6345, new int[]{1,2,3,4});
    }
}
