package laba4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String russianLower = "";
        String englishLower = "";
        for (char i = 'а'; i <= 'я'; i++) {
            russianLower += i;
            if (i == 'е') {
                russianLower += 'ё';
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            englishLower += i;
        }
        String russianUpper = russianLower.toUpperCase();
        String englishUpper = englishLower.toUpperCase();
        String[] alphabets = new String[] { russianLower, russianUpper, englishLower, englishUpper };

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);
            for (int j = 0; j < alphabets.length; j++) {
                String alphabet = alphabets[j];
                if (alphabet.indexOf(chr) < 0) {
                    continue;
                }
                int index = (alphabet.indexOf(chr) + key) % alphabet.length();
                encrypted += alphabet.charAt(index);
            }
            if (encrypted.length() == i) {
                encrypted += chr;
            }
        }

        System.out.println("Текст после преобразования: " + encrypted);

        String answer = "";
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            answer = in.next();
            if (!answer.equals("y") && !answer.equals("n")) {
                System.out.println("Введите корректный ответ");
            }
        }

        if (answer.equals("n")) {
            System.out.println("До свидания!");
            return;
        }

        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char chr = encrypted.charAt(i);
            for (int j = 0; j < alphabets.length; j++) {
                String alphabet = alphabets[j];
                if (alphabet.indexOf(chr) < 0) {
                    continue;
                }
                int index = (alphabet.indexOf(chr) - key) % alphabet.length();
                if (index < 0) {
                    index = alphabet.length() + index;
                }
                decrypted += alphabet.charAt(index);
            }
            if (decrypted.length() == i) {
                decrypted += chr;
            }
        }

        System.out.println("Текст после обратного преобразования: " + decrypted);

        in.close();
    }
}
