package laba8;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Example2 {
    public static void readAllByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("C:\\Users\\vecht\\IdeaProjects\\java-lab_2022-2023\\Hello.txt");
            readAllByte(inFile);
            System.out.println("\n\n\n");
            inFile.close();

            InputStream inUrl = new URL("https://google.com").openStream();
            readAllByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{7, 9, 3, 7, 4});
            readAllByte(inArray);
            System.out.println("\n\n\n");
            inUrl.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
