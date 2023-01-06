package laba8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        char[] consonants = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ь'};
        try (BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream("Task3.txt")));
             BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Task3Result.txt")))) {
            String line;
            for (int i = 0; (line = fr.readLine()) != null; i++) {
                String[] words = line.split(" ");
                List<String> resultWords = new ArrayList<>();
                for (String word : words) {
                    for (char consonant : consonants) {
                        if (word.toLowerCase().charAt(0) == consonant) {
                            resultWords.add(word);
                            break;
                        }
                    }
                }
                wr.write((i + 1) + " (" + resultWords.size() + "): " + String.join(" ", resultWords));
                wr.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}
