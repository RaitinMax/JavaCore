import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static StringBuilder str = new StringBuilder();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private static Date date = new Date();

    public void append(String string) {
        String dateString = sdf.format(date);
        str.append(string);
        str.append("in"+dateString);
        str.append(" ");
        str.append("\n");
    }

    public void createLog(File file) {
        String string = str.toString();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(string);
            writer.flush();
        } catch (IOException e) {
            append(string);
        }
    }

    public String getLog() {
        return str.toString();
    }
}
