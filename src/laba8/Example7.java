package laba8;

import java.io.*;

public class Example7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter wr = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\vecht\\IdeaProjects\\java-lab_2022-2023\\Hello.txt"), 1024);
            wr = new BufferedWriter(new FileWriter("C:\\Users\\vecht\\IdeaProjects\\java-lab_2022-2023\\Hello3.txt"));

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                wr.write(s);
                wr.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка!");
        } finally {
            br.close();
            wr.flush();
            wr.close();
        }
    }
}
