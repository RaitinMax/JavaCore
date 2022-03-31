import java.io.File;
import java.io.IOException;

public class Files {
    Logger log = new Logger();

    public File createNewFile(File file, String childPath) {
        File fullDir = new File(file,childPath);
        try {
            if (fullDir.createNewFile()) {
                log.append(childPath + " has been created in " + fullDir.getAbsolutePath());
                System.out.println("File has been created");
            }
        } catch (IOException e) {
            log.append(childPath+ "has NOT been created in " + fullDir.getAbsolutePath());
        }
        return fullDir;
    }

    public File makeDir(String parentPath, String childPath) {
        File fullDir = new File(parentPath,childPath);
        if (fullDir.mkdir()) {
            log.append("Directory has been created: " + fullDir.getAbsolutePath());
            System.out.println("Directory has been created 1");
        } else {
            log.append("Directory failed to create: " + fullDir.getAbsolutePath());
            System.out.println("Directory has NOT been created 1");
        }
        return fullDir;
    }

    public File makeDir(File file, String childPath) {
        File fullDir = new File(file,childPath);
        if (fullDir.mkdir()) {
            log.append("Directory has been created: " + fullDir.getAbsolutePath());
            System.out.println("Directory has been created 2");
        } else {
            log.append("Directory failed to create: " + fullDir.getAbsolutePath());
            System.out.println("Directory has NOT been created 2");
        }
        return fullDir;
    }
    public void makeLogFile(File file){
        log.createLog(file);
    }
}
