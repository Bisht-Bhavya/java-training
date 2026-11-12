import java.util.Arrays;

public class GenericArraySorting<T extends Number & Comparable<T>> {
    T[] a;

    GenericArraySorting(T[] x){
        a = x;
    }

    T getData(int i){
        return a[i];
    }

    void printData(){
        for(int i = 0; i < a.length; i++){
            System.out.print(this.getData(i) + " ");
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    T division(T x, int y){
        if( x == null || y == 0) return null;
        if( x instanceof Integer) return (T) Integer.valueOf(((Integer) x).intValue() / y);
        if( x instanceof Short)   return (T) Short.valueOf((short) (((Short) x).shortValue() / y));
        if( x instanceof Byte)    return (T) Byte.valueOf((byte) (((Byte) x).byteValue() / y));
        if( x instanceof Long)    return (T) Long.valueOf(((Long) x).longValue() / y);
        else throw new IllegalArgumentException("Type "+ x.getClass() +" is not supported");
    }

    // Helper method to extract the specific digit for Radix Sort
    private int getDigit(T element, int exp) {
        long value = division(element, exp).longValue();
        return (int) (Math.abs(value) % 10);
    }

    T getMax(){
        T max = a[0];
        for(int i = 1; i < a.length; i++){
            if( a[i].compareTo(max) > 0) max = a[i];
        }
        return max;
    }

    private static <T> T[] copyArray(T[] source){
        return source.clone();
    }

    void countsort(int exp){
        int i, size = a.length, count[] = new int[10];
        T[] output = copyArray(a);

        for( i = 0; i < size; i++) {
            count[getDigit(a[i], exp)]++;
        }
        for(i = 1; i < 10; i++) {
            count[i] += count[i-1];
        }
        for (i = size - 1; i >= 0; i--){
            output[count[getDigit(a[i], exp)] - 1] = a[i];
            count[getDigit(a[i], exp)]--;
        }
        for(i = 0; i < size; i++) {
            a[i] = output[i];
        }
    }

    void radixsort(){
        int exp = 1;
        T max = this.getMax();
        long m = division(max, exp).longValue();
        for(; m > 0; exp = exp * 10){
            this.countsort(exp);
            m = division(max, exp).longValue();
        }
    }
}
