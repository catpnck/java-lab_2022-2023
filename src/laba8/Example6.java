package laba8;

import java.io.*;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\Users\\vecht\\IdeaProjects\\java-lab_2022-2023\\Hello.txt");
            out = new FileWriter("C:\\Users\\vecht\\IdeaProjects\\java-lab_2022-2023\\Hello2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                out.write((char) oneByte);
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}
