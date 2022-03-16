import java.io.*;

public class Main {
    public static StringBuilder str = new StringBuilder();

    public static void main(String[] args) throws IOException {

        File dir1 = new File("C:\\Program Files\\Games\\src");
        File dir2 = new File("C:\\Program Files\\Games\\savegames");
        File dir3 = new File("C:\\Program Files\\Games\\res");
        File dir4 = new File("C:\\Program Files\\Games\\temp");
        File dir5 = new File("C:\\Program Files\\Games\\src\\main");
        File dir6 = new File("C:\\Program Files\\Games\\src\\test");
        File dir7 = new File("C:\\Program Files\\Games\\res\\drawables");
        File dir8 = new File("C:\\Program Files\\Games\\res\\vectors");
        File dir9 = new File("C:\\Program Files\\Games\\res\\icons");

        File newFile1 = new File("C:\\Program Files\\Games\\temp\\temp.txt");
        File newFile2 = new File("C:\\Program Files\\Games\\src\\main\\Utils.java");
        File newFile3 = new File("C:\\Program Files\\Games\\src\\main\\Main.java");

        mkdir(dir1);
        mkdir(dir2);
        mkdir(dir3);
        mkdir(dir4);
        mkdir(dir5);
        mkdir(dir6);
        mkdir(dir7);
        mkdir(dir8);
        mkdir(dir9);

        createNewFile(newFile1);
        createNewFile(newFile2);
        createNewFile(newFile3);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile1))) {
            writer.write(str.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mkdir(File dir) {
        if(dir.mkdirs()){
            str.append(dir.getPath() + " has been created\n");
        }
    }

    public static void createNewFile(File newFile)  {
        try {
            if (newFile.createNewFile()) {
                str.append(newFile.getName() + " has been created\n");
            }
        } catch (IOException e) {
            str.append(newFile.getName() +" has been tried create. Something go wrong");
        }
    }
}
