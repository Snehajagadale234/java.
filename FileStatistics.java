import java.io.*;

public class FileStatistics {
    public static void main(String[] args) {

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try {
            File file = new File("sample.txt");

            // Jar file nasel tar create kara
            if (!file.exists()) {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                fw.write("Java is easy.\nSneha is learning Java.");
                fw.close();
                System.out.println("sample.txt file created successfully!\n");
            }

            // File read kara
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {

                // Word count
                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                    wordCount += words.length;

                // Character check
                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        vowelCount++;

                    if (ch == 'a')
                        aCount++;
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowelCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Number of 'a' characters: " + aCount);

        } catch (IOException e) {
            System.out.println("Error occurred!");
        }
    }
}