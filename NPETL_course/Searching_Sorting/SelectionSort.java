public class SelectionSort<T extends Comparable<T>> {
    public  SelectionSort(T[] arr, int len){
        for(int i = 0; i < (len - 1); i++){
            int minInx = i;
            for(int j = i+1; j < len; j++){
                if(arr[minInx].compareTo(arr[j]) > 0){
                    minInx = j;
                }
            }
            T temp = arr[minInx];
            arr[minInx] = arr[i];
            arr[i] = temp;
        }
    }

    public static<T> void printArray(T[] arr, int len){
        for(int i = 0; i < len; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[]args){
        Integer[] arr = {89,45,95,63,23,41,13,78};
        int n = arr.length;
        System.out.println("Given Array:");
        printArray(arr , n);

        new SelectionSort(arr,n);
        System.out.println("\nAfter Sorting: ");
        printArray(arr,n);
    }
}
