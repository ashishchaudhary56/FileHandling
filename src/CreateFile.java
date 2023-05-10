import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
public class CreateFile {
    public static void main(String[] args) {


        try {
            File myObj = new File("myFile");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//        import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.StandardOpenOption;
//import java.util.List;


                String filePath = "myFile";

                // Write to file
                writeToFile(filePath, "Hello, Ashish\n");

                // Read from file
                List<String> lines = readFromFile(filePath);
                System.out.println("File content:");
                for (String line : lines) {
                    System.out.println(line);
                }

                // Append to file
                appendToFile(filePath, "How are you.");

                // Read from file after appending
                lines = readFromFile(filePath);
                System.out.println("Updated file content:");
                for (String line : lines) {
                    System.out.println(line);
                }
        System.out.println(readFromFile("C:\\Users\\Manish Kumar\\IdeaProjects\\PracticeProject\\myFile.txt"));
            }

            public static void writeToFile(String filePath, String content) {
                try {
                    Files.writeString(Path.of(filePath), content, StandardCharsets.UTF_8);
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.err.println("An error occurred while writing to the file: " + e.getMessage());
                }
            }

            public static List<String> readFromFile(String filePath) {
                try {
                    System.out.println("file has been read successfully");
                    return Files.readAllLines(Path.of(filePath), StandardCharsets.UTF_8);


                } catch (IOException e) {
                    System.err.println("An error occurred while reading the file: " + e.getMessage());
                }
                 return null;


            }

            public static void appendToFile(String filePath, String content) {
                try {
                    Files.writeString(Path.of(filePath), content, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
                    System.out.println("Successfully appended to the file.");
                } catch (IOException e) {
                    System.err.println("An error occurred while appending to the file: " + e.getMessage());
                }
            }
        }



