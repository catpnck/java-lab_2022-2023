package laba4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.next();

        System.out.print("Введите ключ: ");
        int key = in.nextInt();

        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            encrypted += (char) (text.charAt(i) + key);
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
            decrypted += (char) (encrypted.charAt(i) - key);
        }

        System.out.println("Текст после обратного преобразования: " + decrypted);

        in.close();
    }
}
