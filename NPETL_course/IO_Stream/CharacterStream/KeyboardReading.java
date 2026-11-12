package CharacterStream;
import java.io.*;
public class KeyboardReading {
    public static void main(String[]args) throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String str1 = b.readLine();
        System.out.println("Entered String value is: "+ str1);

        System.out.println("Enter a Whole Number: ");
        String str2 = b.readLine();
        int x = Integer.parseInt(str2);

        System.out.println("Enter a Double Number: ");
        String str3 = b.readLine();
        double y = Double.parseDouble(str3);

        if(x > y){
            System.out.println("First Number: "+ x + " is greater than second number " + y);
        }else{
            System.out.println("First Number: "+ x + " is less than second number " + y);
        }
        b.close();
    }
}
