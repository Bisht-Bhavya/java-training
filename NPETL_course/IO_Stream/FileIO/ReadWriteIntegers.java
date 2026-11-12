package FileIO;

import java.io.*;

public class ReadWriteIntegers {
    public static void main(String[]args) throws IOException {
        DataInputStream dis = null;   //Input Stream
        DataOutputStream dos = null;  //Output Stream
        File inFile = new File("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\FileIO\\test.txt");
        //Construct a file
        //Writing integers to test.txt file
        try{  //Create output stream for inFile file
            dos = new DataOutputStream(new FileOutputStream(inFile));
            for(int i =0; i < 20; i++)
                dos.writeInt((int)(Math.random() * 100));
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally {
            dos.close();
        }
        //Reading integers from test.txt file
        try{
            //Create input stream for test.txt file
            dis = new DataInputStream(new FileInputStream(inFile));

            for(int i = 0; i< 20;i++){
                int n = dis.readInt();
                System.out.print(n+" ");
            }
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        } finally {
            {
                dis.close();
            }
        }

    }
}
