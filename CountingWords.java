import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingWords {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/IO/file.txt"))) {
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                count += line.split(" ").length;
            }

            System.out.println("Number of words in the File is: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
