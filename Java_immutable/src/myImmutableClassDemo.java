import java.util.*;

final class MyImmutableClass {

    private final String name;
    private final List<Object> petnameList;

    MyImmutableClass(String name, List<Object> petnameList) {
        this.name = name;
        this.petnameList = new ArrayList<>(petnameList);
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetnameList() {

        // return copy to preserve immutability
        return new ArrayList<>(petnameList);
    }
}

public class myImmutableClassDemo {

    public static void main(String args[]) {

        List<Object> petnames = new ArrayList<>();

        petnames.add("chicken");
        petnames.add("fuddi");

        MyImmutableClass obj = new MyImmutableClass("Bhavya", petnames);

        System.out.println("NAME: " + obj.getName() + "\nPET NAMES: " + obj.getPetnameList());
    }
}