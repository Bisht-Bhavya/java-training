import java.util.Calendar;

public class Calender5 {
    public static  void main(String [] args){
        //Creating calendar object
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, - 15);
        System.out.println("15 Days Ago: "+ calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 Months Later: "+ calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 Years Later  "+ calendar.getTime());
    }
}
