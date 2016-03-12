import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        String fileContent = readFile("C:/Users/Administrator/Desktop/testfile2.xml");
        System.out.println(fileContent);
    }

    public static String readFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready())
                data.append(reader.readLine()).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }
}