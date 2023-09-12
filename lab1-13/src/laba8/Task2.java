package laba8;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("Task2.txt")));
             BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Task2Result.txt")))) {
            for (int i = 0; i < 7; i++) {
                if (i == 0) {
                    fr.readLine();
                } else if (i == 1) {
                    wr.write(fr.readLine());
                    wr.newLine();
                } else {
                    double num = Double.parseDouble(fr.readLine());
                    if (num >= 0) {
                        wr.write(Double.toString(num));
                        wr.newLine();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
