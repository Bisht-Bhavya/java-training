package FileIO;

import java.io.*;
import java.awt.*;

public class StudentFile extends Frame {
    // Defining window components
    TextField number, name, marks;
    Button enter, done;
    Label numLabel, nameLabel, markLabel;
    DataOutputStream dos;

    // Initialise the Frame
    public StudentFile() {
        super("Create Student File");
    }

    // Setup the window
    public void setup() {
        setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        // Create the Components of the Frame
        number = new TextField(25);
        numLabel = new Label("Roll Number");
        name = new TextField(25);
        nameLabel = new Label("Student Name");
        marks = new TextField(25);
        markLabel = new Label("Marks");
        enter = new Button("Enter");
        done = new Button("Done"); // Matches event check below

        // Add the components to the Frame
        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(markLabel);
        add(marks);
        add(enter);
        add(done);

        // Show the Frame
        setVisible(true);

        // Open the File (Ensure the directory exists)
        try {
            dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Bhavya Bisht\\Desktop\\JAVA FINAL RUSH\\NPETL_course\\IO_Stream\\FileIO\\test.txt"));
        } catch (IOException e) {
            System.err.println("Could not open file.");
            System.exit(1);
        }
    }

    // Write to File
    public void addRecord() {
        try {
            int num = Integer.parseInt(number.getText());
            dos.writeInt(num);
            dos.writeUTF(name.getText());
            double d = Double.parseDouble(marks.getText());
            dos.writeDouble(d);

            // Clear fields after entering
            number.setText("");
            name.setText("");
            marks.setText("");
        } catch (NumberFormatException e) {
            System.err.println("Please enter valid numbers for Roll Number and Marks.");
        } catch (IOException e) {
            System.err.println("Error writing to file.");
        }
    }

    // Cleanup resources
    public void cleanup() {
        try {
            if (dos != null) {
                dos.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file.");
        }
    }

    // Processing the event
    public boolean action(Event event, Object o) {
        if (event.target instanceof Button) {
            if (event.arg.equals("Enter")) {
                addRecord();
                return true;
            }
        }
        return super.action(event, o);
    }

    public boolean handleEvent(Event event) {
        if (event.target instanceof Button) {
            if (event.arg.equals("Done")) { // Fixed case sensitivity
                cleanup();
                System.exit(0); // 0 indicates normal termination
                return true;
            }
        }
        return super.handleEvent(event);
    }

    // Execute the program
    public static void main(String[] args) {
        StudentFile student = new StudentFile();
        student.setup();
    }
}