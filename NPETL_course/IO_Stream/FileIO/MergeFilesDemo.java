package FileIO;
import java.io.*;
public class MergeFilesDemo {
    public static void main(String[]args) throws IOException {
        //Declare file Streams
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null;
        //Declare file3 to store combined files
        file1 = new FileInputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\FileIO\\test.txt");
        file2 = new FileInputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\FileIO\\test2.txt");
        file3 = new SequenceInputStream(file1,file2); //Concatenate file1 and file2

        //Create buffered input and output streams
        BufferedInputStream inBuffer = new BufferedInputStream(file3);
        BufferedOutputStream outBufer = new BufferedOutputStream(System.out);

        //Read and write till the end of buffers
        int ch;
        while((ch = inBuffer.read()) != - 1)
            outBufer.write((char) ch);

        inBuffer.close();
        outBufer.close();
        file1.close();
        file2.close();

    }
}
