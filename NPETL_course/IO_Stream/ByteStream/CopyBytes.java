package ByteStream;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        FileInputStream infile = null;
        FileOutputStream outfile = null;

        // 1. Must be an int to correctly capture the -1 EOF marker
        int dataRead;

        try {
            infile = new FileInputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test.txt");
            outfile = new FileOutputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test2.txt");

            // 2. Read and check condition BEFORE entering/continuing the loop
            while ((dataRead = infile.read()) != -1) {
                outfile.write(dataRead);
            }

            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } finally {
            // 3. Add null checks to avoid NullPointerException during cleanup
            try {
                if (infile != null) {
                    infile.close();
                }
                if (outfile != null) {
                    outfile.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing streams: " + e.getMessage());
            }
        }
    }
}
