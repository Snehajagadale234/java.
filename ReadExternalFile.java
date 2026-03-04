import java.io.*;

public class ReadExternalFile {
    public static void main(String[] args) {

        try {
            File file = new File("sample.txt");

            // Jar file nasel tar create kara
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("sample.txt file created successfully!\n");

                // Default content lihun deu
                FileWriter fw = new FileWriter(file);
                fw.write("Java is easy.\nSneha is learning Java.");
                fw.close();
            }

            // Ata file read kara
            FileInputStream fis = new FileInputStream(file);
            int i;

            System.out.println("File Content:\n");

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error occurred!");
        }
    }
}