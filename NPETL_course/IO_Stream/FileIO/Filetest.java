
package FileIO;

import java.io.*;

public class Filetest {

    public static void getPaths(File t) throws IOException {
        System.out.println("Name: " + t.getName());
        System.out.println("Path: " + t.getPath());
        System.out.println("Parent: " + t.getParent());
    }

    public static void getInfo(File f) throws IOException {
        if (f.exists()) {
            System.out.println("File Exists");
            System.out.println(f.canRead() ? "and is readable" : "");
            System.out.println(f.canWrite() ? "and is writable" : "");
            System.out.println("File is Last Modified: " + f.lastModified());
            System.out.println("File is " + f.length() + " bytes");
        } else {
            System.err.println("File Does Not Exists.");
        }
    }

    public static void main(String[] args) throws IOException {

        File fileToCheck = new File(
                "C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\CharacterStream\\test.txt"
        );

        if (fileToCheck.exists()) {
            getPaths(fileToCheck);
            getInfo(fileToCheck);
        } else {
            System.out.println("File does not exist.");
            System.out.println("Path checked: " + fileToCheck.getAbsolutePath());
            System.out.println("Usage: java FileIO.Filetest <filename(s)>");
        }
    }
}
