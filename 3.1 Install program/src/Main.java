import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Files files = new Files();
        String path = "C:" + File.separator + "Program Files" + File.separator + "Games";
        File src = files.makeDir(path, "src");
        File save = files.makeDir(path, "savegames");
        File res = files.makeDir(path, "res");
        File temp = files.makeDir(path, "temp");

        File srcMain = files.makeDir(src, "main");
        File srcTest = files.makeDir(src, "test");
        File resDraw = files.makeDir(res, "drawable");
        File resVec = files.makeDir(res, "vectors");
        File resIcon = files.makeDir(res, "icons");
        File newFileTempTxt = files.createNewFile(temp, "temp.txt");
        File newFileUtilsJava = files.createNewFile(srcMain, "Utils.java");
        File newFileMainJava = files.createNewFile(srcMain, "Main.java");

        try {

            files.makeLogFile(newFileTempTxt);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
