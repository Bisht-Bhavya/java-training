package ByteStream;

import java.io.*;
public class ReadBytesDemo {
    public static void main(String[]args){
        try{
        FileInputStream infile = new FileInputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test.txt");
        //Create an input file stream
        int b;
            //Connect infile stream to the required file
            while( (b = infile.read() ) != - 1){
                System.out.println((char) b);
            }
            infile.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
