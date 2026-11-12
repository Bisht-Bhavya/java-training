package RAF;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;

public class Student implements Serializable {
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private int age;
    private int[] marks = new int[5];

    public Student(String firstName, String lastName, int age, int[] marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    @Override
    public String toString(){
    return "\nFirst Name: " + this.firstName +
            "\nLast Name: " + this.lastName +
            "\nAge: " + this.age +
            "\nMarks: " +
            Collections.singletonList(this.marks);
    }

}
