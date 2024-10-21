import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java I/O");

        // Get the project's root directory
        Path projectRoot = Paths.get(System.getProperty("user.dir"));

        // Construct the path to input.txt
        Path inputFilePath = projectRoot.resolve("resources").resolve("input.txt");

        // Check if the file exists
        try {
            Files.exists(inputFilePath);
            System.out.println("input.txt found at: " + inputFilePath.toAbsolutePath());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        // NEXT EXERCISE

        // String filePath = "Resources/com/example/iolab/input.txt";
        // FileInputStream fis = null;

        // try {
        //     fis = new FileInputStream(filePath);
        //     int data;
        //     int count = 0;
        //     while ((data = fis.read())  != -1) {
        //         System.out.print((char) data);
        //         count++;
        //     }
        //     System.out.println("\nCharacter Count: " + count);
            
        // } catch (FileNotFoundException e) {
        //     System.out.println(e.getMessage());   
        // } catch (IOException e) {
        //     System.err.println("Error reading file: " + e.getMessage());
        // } finally {
        //     try {
        //         if(fis != null) {
        //             fis.close();
        //         }
        //     } catch (IOException e) {
        //         System.err.println("Error closing file: " + e.getMessage());
        //     }
        // } 
       

        // NEXT EXCERCISE 3
        String inputPath = "Resources/com/example/iolab/input.txt";
        String outputPath = "Resources/com/example/iolab/output.txt";

        try (FileInputStream fis = new FileInputStream(inputPath); 
             FileOutputStream fos = new FileOutputStream(outputPath)) {

                int data;
                while((data = fis.read()) != -1) {
                    fos.write(data);
                }

                System.out.println("File Copied Successfully");
             } catch (IOException e) {
                System.err.println("Error copying file: " + e.getMessage());
             } 

    } 
}
