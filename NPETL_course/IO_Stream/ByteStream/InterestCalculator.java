package ByteStream;

import java.io.*;
public class InterestCalculator {
    public static void main(String[]args) throws IOException{
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;

        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.println("Enter Principal Amount: ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.println("Enter rate of Interset: ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.print("Enter Number of Years: ");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);

        //Input is over : calculate the interest
        float interestTotal = principalAmount * rateOfInterest * numberOfYears;
        System.out.println("Total Interest: "+ interestTotal);
        in.close();
    }
}
