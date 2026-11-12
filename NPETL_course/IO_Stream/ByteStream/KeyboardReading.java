package ByteStream;

import java.io.*;
public class KeyboardReading {
    public static void main(String[]args) throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter a String: ");
        String str1 = dis.readLine();
        System.out.println("Entered String value is: "+ str1);
        System.out.println("Enter a Whole Number: ");
        String str2 = dis.readLine();
        int x = Integer.parseInt(str2);
        System.out.println("Enter a Double value: ");
        String str3 = dis.readLine();
        double y  = Double.parseDouble(str3);
        if(x > y){
            System.out.println("First number "+ x + " is greater than second number "+ y);
        }else{
            System.out.println("First number "+ x + " is less than second number "+ y);
        }
        dis.close();
    }
}
