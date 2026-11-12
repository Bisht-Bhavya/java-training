import java.util.Calendar;

public class CalenderDemo {
    public static void main(String [] args){
    //Create a calendar initialized with the current date and time in the default
        Calendar calender = Calendar .getInstance();
        //Display current time and date information
        System.out.print("Date: ");
        System.out.println(calender);
        System.out.print("Time: ");
        System.out.print(calender.get(Calendar.HOUR)+":");
        System.out.print(calender.get(Calendar.MINUTE)+":");
        System.out.println(calender.get(Calendar.SECOND));
        //Set the time and date information and display it.
        calender.set(Calendar.HOUR, 10);
        calender.set(Calendar.MINUTE, 29);
        calender.set(Calendar.SECOND, 22);
        System.out.print("Updated Time: ");
        System.out.print(calender.get(Calendar.HOUR)+":");
        System.out.print(calender.get(Calendar.MINUTE)+":");
        System.out.print(calender.get(Calendar.SECOND));
    }
}
