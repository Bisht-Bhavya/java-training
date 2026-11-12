package RAF;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileExample {
    static final String FilePath = "NPTEL.txt";
    public static void main(String[]args){
        try{
            System.out.println(new String(readFromFile(FilePath, 0 , 10)));
        }catch(IOException e){
            e.printStackTrace();
        }
        // Print the exact folder where Java is looking/creating relative files
        System.out.println("File created at: " + new File("NPETL.txt").getAbsolutePath());

    }
    private static byte[] readFromFile(String filePath, int position, int size)throws IOException{
        RandomAccessFile file = new RandomAccessFile(filePath,"r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }
}
