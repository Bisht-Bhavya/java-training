public class TestRadixSort {
    public static void main(String[]args){
        Integer[] i= {59,44, 79, 74, 88};
        GenericArraySorting<Integer> arrayint = new GenericArraySorting<Integer>(i);
        System.out.print("Array before Sorting: ");
        arrayint.printData();
        arrayint.radixsort();
        System.out.print("Sorted Array is: ");
        arrayint.printData();
        System.out.println();
    }
}
