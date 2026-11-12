public class InterpolationSearchDemo {
    public static void main(String[]args){
        //Searching with integer data
        Integer[] i = {10,20,30,40,50};
        //Store the data into generic array
        InterpolationSearching<Integer> arrayint = new InterpolationSearching<Integer>(i);
        //Printing the data
        arrayint.printData();
        int searchint = 60;
        int pos = arrayint.interpolationSearch(searchint);
        if(pos == -1)
            System.out.println(searchint + " not found in the array");
        else
            System.out.println(searchint+" found at position "+pos);
        System.out.println();
    }
}
