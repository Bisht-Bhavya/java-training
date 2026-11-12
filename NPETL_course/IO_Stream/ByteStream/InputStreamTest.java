package ByteStream;

import java.io.*;
public class InputStreamTest {
    public static void main(String[]args) throws IOException {
        int size;
        //to open a file input stream
        FileInputStream fin;
        fin = new FileInputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test.txt");
        size = fin.available();

        //returns the number of bytes available
        System.out.println("Total bytes::" + size);
        System.out.println(" first 4 is displayed : Using read() ");

        for(int i = 0; i < size / 4; i++){
            System.out.print((char) fin.read() );
        }
        System.out.println("Remaining bytes: "+ fin.available());
        System.out.println("Next 4 is Displayed: Using read( b [ ] ");
        byte b[] = new byte[size / 4];
        if( fin.read(b) != b.length )
            System.out.println("File reading error: ");
        else{
            String temp = new String(b,0,0,b.length);
            //Convert the bytes into string
            System.out.println(temp);
            //Display text String
            System.out.println("Still available: "+ fin.available());
            System.out.println("Skipping 4: Using skip() ");
            fin.skip(size/4);
            System.out.println("File remaining for read :: "+ fin.available() );
        }
        fin.close();
}
}
