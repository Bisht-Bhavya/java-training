package RAF;
import java.io.*;
public class ReadObjectDemo {
    private static final String filepath = "obj";
    public static void main(String[]args){
        ReadObjectDemo objectIO= new ReadObjectDemo();
        objectIO.readObjectfromFile();
    }
    public void readObjectfromFile(){
        try{
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Student student = (Student) objectIn.readObject();
            System.out.println(student.toString());
            objectIn.close();
            System.out.println("the object was successfully read from file");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
