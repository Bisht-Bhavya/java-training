package RAF;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAcessFileWriteExample {
    static final String FilePath = "NPTEL.txt";
    public static void main(String[]args){
        try{
            writeToFile(FilePath, "Data Structure and Algorithms Using Java", 41);
        }catch(IOException e){
            e.printStackTrace();
        }
        // Print the exact folder where Java is looking/creating relative files
        System.out.println("File created at: " + new File("NPETL.txt").getAbsolutePath());

    }
    private static void writeToFile(String filePath, String data, int position)throws IOException{
        RandomAccessFile file = new RandomAccessFile(filePath,"rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}
