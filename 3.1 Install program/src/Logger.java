import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static StringBuilder str = new StringBuilder();
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private static Date date = new Date();

    public void append(String string) {
        String dateString = sdf.format(date);
        str.append(dateString);
        str.append(" ");
        str.append("has been created"+"\n");
    }

    public  void createLog(File file) {

    }
}
