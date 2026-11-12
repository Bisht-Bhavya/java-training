package RAF;
import java.io.*;
public class RandomAccess {
    public static void main(String[]args){
        RandomAccessFile rFile;
        try{
            rFile = new RandomAccessFile("city.txt", "rw");
            rFile.seek(rFile.length());  // Go to the end
            rFile.writeBytes("Joy With Java\n");
            rFile.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
