package chat;

import java.io.*;
import java.util.List;

public class Chat {
    private final ConsoleInput consoleInput;
    private final Log log;

    public Chat(ConsoleInput consoleInput, Log log) {
        this.consoleInput = consoleInput;
        this.log = log;
    }

    public String getRandomPhrase() throws IOException {
        int randomNumber = 0;
        List<String> linesForRandom = consoleInput.handleAnswerToUser();
        randomNumber = (int) (Math.random() * linesForRandom.size());
        return linesForRandom.get(randomNumber);
    }

    private boolean checkAnswer(String userAnswer, boolean isAnswer) {

        if (userAnswer.equals(ChatCommands.STOP_COMMAND)) {
            isAnswer = false;
        } else if (!isAnswer && ChatCommands.CONTINUE_COMMAND.equals(userAnswer)) {
            isAnswer = true;
        }
        return isAnswer;
    }

    public void startProgram() throws IOException {
        String userAnswer = "";
        boolean isAnswer = true;


        while (!userAnswer.equals(ChatCommands.FINISH_COMMAND)) {
            userAnswer = consoleInput.getUserPhrase();
            log.addStringInfo(userAnswer + System.lineSeparator());
            if (userAnswer.equals(ChatCommands.FINISH_COMMAND)) {
                break;
            }

            isAnswer = checkAnswer(userAnswer, isAnswer);
            if (isAnswer) {
                String randomPhrase = getRandomPhrase();
                System.out.println(randomPhrase);
                log.addStringInfo(randomPhrase + System.lineSeparator());
            }
        }
        log.writeListToFile();
    }
}
