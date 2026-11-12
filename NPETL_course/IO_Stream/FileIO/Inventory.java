package FileIO;

import java.io.*;
import java.util.*;

public class Inventory {
    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;

    public static void main(String args[]) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\FileIO\\test2.txt"));

        // Reading from console
        System.out.println("Enter code number:");
        st = new StringTokenizer(din.readLine());
        int code = Integer.parseInt(st.nextToken());

        System.out.println("Enter number of items:");
        st = new StringTokenizer(din.readLine());
        int items = Integer.parseInt(st.nextToken());

        System.out.println("Enter cost:");
        st = new StringTokenizer(din.readLine());
        double cost = Double.parseDouble(st.nextToken());

        // Writing to the file "test2.txt"
        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(cost);
        dos.close();

        // Processing data from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\FileIO\\test2.txt"));

        int codeNumber = dis.readInt();
        int totalItems = dis.readInt();
        double itemCost = dis.readDouble();
        double totalCost = totalItems * itemCost;
        dis.close();

        // Writing to Console
        System.out.println();
        System.out.println("Code Number: " + codeNumber);
        System.out.println("Item Cost: " + itemCost);
        System.out.println("Total Items: " + totalItems);
        System.out.println("Total Cost: " + totalCost);
    }
}
