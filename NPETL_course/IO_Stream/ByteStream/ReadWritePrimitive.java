package ByteStream;

import java.io.*;
public class ReadWritePrimitive {
    public static void main(String[]args) throws IOException{
        File Primitive = new File("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\test.txt");
        FileOutputStream fos = new FileOutputStream(Primitive);
        DataOutputStream dos = new DataOutputStream(fos);

        //Write primitive data to the "test.txt" file
        dos.writeInt(1999);
        dos.writeDouble(375.85);
        dos.writeBoolean(false);
        dos.writeChar('X');
        dos.close();
        fos.close();

        //Read data from test.txt file
        FileInputStream fis = new FileInputStream(Primitive);
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());

        dis.close();
        fis.close();
    }
}
