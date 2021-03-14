package input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Analizy {

    public static void unavailable(String source, String target) {
        List<String> errorServer = new ArrayList<String>();
        try (BufferedReader in = new BufferedReader(new FileReader(source));
             BufferedWriter out = new BufferedWriter(new FileWriter(target))) {
            List<String> dataServer = new ArrayList<String>();
            List<String> lines = in.lines().collect(Collectors.toList());
            for (String line : lines) {
                dataServer.add(line);
            }
            //in.lines().forEach(dataServer::add);

            String startErrorTime = null;
            for (String line : dataServer) {
                String[] splitLine = line.split(" ");
                String codeError = splitLine[0];
                if (codeError.equals("400") || codeError.equals("500")) {
                    if (startErrorTime == null) {
                        startErrorTime = splitLine[1];
                    }
                } else {
                    if (startErrorTime != null) {
                        out.write(startErrorTime + " " + splitLine[1]);
                        out.write(System.lineSeparator());
                        startErrorTime = null;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        unavailable("E:\\unavailable.txt", "E:\\errorResult.txt");
    }
}
