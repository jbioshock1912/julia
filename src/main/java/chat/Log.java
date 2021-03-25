package chat;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Log {
    private List<String> logInfo = new ArrayList<String>();
    private String fileLog;

    public Log(String fileLog) {
        this.fileLog = fileLog;
    }

    public void addStringInfo(String info) {
        logInfo.add(info);
    }

    public void writeListToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(fileLog);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(logInfo);
            oos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
