package input;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

import static java.nio.file.FileVisitResult.CONTINUE;

public class Search implements FileVisitor<Path> {
    private String pre;
    private HashSet<String> fileListWithoutDublicate = new HashSet<>();
    public Search(String myPre) {
        this.pre = myPre;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        String fileName = path.getFileName().toString();
        boolean result = fileName.startsWith(pre);
        if (result) {
            fileListWithoutDublicate.add(fileName.toString());
        }
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path path, IOException e) throws IOException {
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path path, IOException e) throws IOException {
        return CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Search findFilesStartMy = new Search(args[0]);
        Path start = Paths.get(args[1]);

        /*Search findFilesStartMy = new Search("my");
        Path start = Paths.get("E:\\test")*/;
        Files.walkFileTree(start, findFilesStartMy);
        findFilesStartMy.getFileListWithoutDublicate().forEach(System.out::println);
    }

    public HashSet<String> getFileListWithoutDublicate() {
        return fileListWithoutDublicate;
    }
}
