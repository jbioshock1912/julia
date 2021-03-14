package input;

import java.io.FileInputStream;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class EvenNumberFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("E:\\even.txt")) {
            StringBuilder text = new StringBuilder();
            int read;
            while ((read = in.read()) != -1) {
                text.append((char) read);
            }
            System.out.println(text);
            String[] lines = text.toString().split(System.lineSeparator());
            ArrayList<Boolean> isEven = new ArrayList<Boolean>();
            for (String line : lines) {
                int result = parseInt(line);
                Boolean resultEven = result % 2 == 0;
                isEven.add(resultEven);
                System.out.println(resultEven);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}