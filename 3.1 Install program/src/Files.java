import java.io.File;
import java.io.IOException;

public class Files {
    Logger log = new Logger();

    public void createMkdir(File file) {
        if (file.mkdirs()) {
            log.append(file.getName() + "has been created in " + file.getAbsolutePath());
        } else log.append(file.getName() + "has NOT been created in " + file.getAbsolutePath());
    }

    public void createNewFile(File file) {
        try {
            if (file.createNewFile()) {
                log.append(file.getName() + "has been created in " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            log.append(file.getName() + "has NOT been created in " + file.getAbsolutePath());
        }
    }
}
