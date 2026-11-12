package CharacterStream;

import java.io.*;
public class InterestCalculator {
    public static void main(String[]args) throws IOException{
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String tempString;
        System.out.print("Enter Principal Amount: ");
        System.out.flush();
        tempString = b.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.print("Enter Rate Of Interest: ");
        System.out.flush();
        tempString = b.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.print("Enter Number Of Years: ");
        System.out.flush();
        tempString = b.readLine();
        numberOfYears = Integer.parseInt(tempString);

        //Input is over : calculate the interest
        float interestTotal = principalAmount * rateOfInterest * numberOfYears;
        System.out.println("Total Interest: "+ interestTotal);
    }
}

