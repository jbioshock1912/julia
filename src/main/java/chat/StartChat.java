package chat;

import java.io.IOException;

public class StartChat {

    public static void main(String[] args) throws IOException {

        ConsoleInput consoleInput = new ConsoleInput("E:\\answers.txt");
        Log log = new Log("E:\\logfile.txt");
        Chat chat = new Chat(consoleInput, log);
        chat.startProgram();
    }
}
