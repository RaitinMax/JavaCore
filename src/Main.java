import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        GameProgress gp1 = new GameProgress(95, 3, 12, 5.00);
        GameProgress gp2 = new GameProgress(85, 4, 23, 6.00);
        GameProgress gp3 = new GameProgress(75, 5, 34, 7.00);
        File newFile1 = new File("C:\\Program Files\\Games\\savegames\\aveData1.dat");
        File newFile2 = new File("C:\\Program Files\\Games\\savegames\\saveData2.dat");
        File newFile3 = new File("C:\\Program Files\\Games\\savegames\\saveData3.dat");
        File newZip = new File("C:\\Program Files\\Games\\savegames\\saveZip.zip");
        saveData(gp1, newFile1);
        saveData(gp2, newFile2);
        saveData(gp3, newFile3);
        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(newZip))) {
            zipFiles(zout, newFile1);
            zipFiles(zout, newFile2);
            zipFiles(zout, newFile3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        newFile1.delete();
        newFile2.delete();
        newFile3.delete();
    }

    private static void saveData(GameProgress gp, File file) {
        try (FileOutputStream saveData = new FileOutputStream(file)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(saveData);
            objectOutputStream.writeObject(gp);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void zipFiles(ZipOutputStream zip, File file)  {

        try (FileInputStream fis = new FileInputStream(file)) {
            ZipEntry entry = new ZipEntry(String.valueOf(file));
            zip.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            zip.write(buffer);
            zip.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
