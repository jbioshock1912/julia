package input;

import java.io.FileOutputStream;

public class ResultFile {
    public static void main(String[] args) {
        ResultFile result = new ResultFile();
        result.multiplicationTable();
    }

    public void multiplicationTable() {
        int result;
        try (FileOutputStream out = new FileOutputStream("E:\\result.txt")) {
            for (int i = 1; i < 10; i++) {
                for (int j = 2; j < 10; j++) {
                    result = i * j;
                    System.out.print(result + " ");
                    out.write((String.valueOf(result + " ").getBytes()));
                }
                out.write(("\r\n").getBytes());
                System.out.println("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}