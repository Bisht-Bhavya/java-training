package RAF;
import java.io.File;
import java.io.*;

public class WriteObjectDemo {
    private static final String filepath = "obj";
    public static void main(String[]args){
        WriteObjectDemo objectIO = new WriteObjectDemo();
        int[] m = {50,47,89,65,70};
        Student student = new Student("John", "Frost", 22, m);
        objectIO.writeObjectToFile(student);
    }
    public void writeObjectToFile(Object serObj){
        try{
            FileOutputStream fileout = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The object is successful written to a file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
