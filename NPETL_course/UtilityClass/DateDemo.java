import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        //Instantiate a Date Object
        Date date = new Date();
        //Display date and time using toString()
        System.out.println(date);
        //Display number of milliseconds since midnight, january 1, 1970 CMT
        long mscc =date.getTime();
        System.out.println("Milliseconds since  JAN 1, 1970 GMT = " + mscc);
    }
}
