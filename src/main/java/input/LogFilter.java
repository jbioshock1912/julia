package input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class LogFilter {
    public static List<String> filter(String file) {
        List<String> linesForFile = new ArrayList<String>();
        try (BufferedReader in = new BufferedReader(new FileReader("E:\\log.txt"))) {
            List<String> lines = new ArrayList<String>();
            in.lines().forEach(lines::add);
            for (String line : lines) {
                String[] split = line.split(" ");
                int resultSplit = parseInt(split[split.length - 2]);
                if (resultSplit == 404) {
                    linesForFile.add(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linesForFile;
    }

    public static void save(List<String> log, String file) {
        try (PrintWriter out = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream(file)
                ))) {
            for (String text : log) {
                out.write(text + "\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> log = filter("log.txt");
        System.out.println(log);
        save(log, "E:\\404.txt");
    }
}
