package LearningPackage.ThinkJava;
//import java.io.File;
//import java.io.IOException;
//import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;


public class FileOperations {

    private static final String filePath="C:\\temp\\julia's_file.txt";

    public static void main(String[] args) {

        createFile(filePath);
        writeToFile(filePath);
        readFromFile(filePath);
    }

    private static void writeToFile(String fp) {
        try {
            FileWriter myWriter = new FileWriter(fp);
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void readFromFile(String fp) {
        try {
            File myObj = new File(fp);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void createFile(String fp) {
        try {
            File myObj = new File(fp);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
