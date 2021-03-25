package chat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConsoleInput {

    private final String fileName;

    public ConsoleInput(String fileName) {
        this.fileName = fileName;
    }

    public String getUserPhrase() throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String phrase = bufferedReader.readLine();
        return phrase;
    }

    public List<String>  handleAnswerToUser() throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            List<String> lines = new ArrayList<String>();
            in.lines().forEach(lines::add);
            return lines;
        }
    }
}
