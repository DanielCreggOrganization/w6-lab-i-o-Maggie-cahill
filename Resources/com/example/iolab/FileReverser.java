
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.Collections;



public class FileReverser {
    public static void main(String[] args) {
        // FileReader reader = null;

        // try{
        //     reader = new FileReader("Resources/com/example/iolab/input.txt");
        //     int character;
        //     while ((character = reader.read()) != -1) {
        //         System.out.print((char)character);
        //     }
        // } catch (IOException e) {
        //     System.out.println("Error reading file: " + e.getMessage());
        // } finally {
        //     try {
        //         if (reader != null) {
        //             reader.close();
        //         }
        //     } catch (IOException e) {
        //         System.out.println("Error closing reader: " + e.getMessage());
        //     }
        // }

        // FileReader reader = null;
        // FileWriter writer = null;

        // try {
        //     reader = new FileReader("Resources/com/example/iolab/input.txt");
        //     writer = new FileWriter("Resources/com/example/iolab/output.txt");

        //     int letter;
        //     while((letter = reader.read()) != -1) {
        //         writer.write(Character.toUpperCase(letter));
        //     }
        // } catch (IOException e) {
        //     System.out.println("Error with file operations: " + e.getMessage());
        // } finally {
        //     try {
        //         if (reader != null) reader.close();
        //         if (writer != null) writer.close();
        //     } catch (IOException e) {
        //         System.out.println("Error closing resources " + e.getMessage());
        //     }
        // }

            // NEXT EXERCISE
        // int count = 0;

        // try (FileReader reader = new FileReader("Resources/com/example/iolab/input.txt");
        //      FileWriter writer = new FileWriter("Resources/com/example/iolab/output.txt")) {

        //         int letter;
        //         while((letter = reader.read()) != -1) {
        //             writer.write(letter);
        //             count++;
        //         }
              
        //      } catch (IOException e) {
        //         System.out.println("Error with file operations: " + e.getMessage());
        //      }

        //      try (FileWriter counter = new FileWriter("Resources/com/example/iolab/count.txt")) {
        //         counter.write("Character Count: " + count);
        //      } catch (IOException e) {
        //         System.out.println("Error with file operations: " + e.getMessage());
        //      }

        // try (BufferedReader reader = new BufferedReader(new FileReader("Resources/com/example/iolab/input.txt"));
        //      BufferedWriter writer = new BufferedWriter(new FileWriter("Resources/com/example/iolab/output.txt"))) {
            
        //     String line;
        //     while ((line = reader.readLine()) != null) {
        //         writer.write(line);
        //         writer.newLine();
        //     }
            
        // } catch (IOException e) {
        //     System.out.println("Error with file operations: " + e.getMessage());
        // }

        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Resources/com/example/iolab/input.txt"))) {
            String line;
            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Collections.reverse(lines);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Resources/com/example/iolab/reverse.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }


        
        

    }
}
