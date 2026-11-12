package CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChars {
    public static void main(String[]args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try{
            inputStream = new FileReader("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test.txt");
            outputStream = new FileWriter("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test2.txt");
            int c;
            while((c= inputStream.read()) != -1){
                outputStream.write(c);
            }
        } finally{
            if(inputStream != null){
                inputStream.close();
            }
            if(outputStream != null){
                outputStream.close();
            }
        }
    }
}
