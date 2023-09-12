package laba10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class JsonParser {
    public static void main(String[] args) throws IOException, ParseException {
        var path = "src/laba10/example2/example.json";
        try (var scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println();
                System.out.println("Меню:");
                System.out.println("1. Вывести все книги");
                System.out.println("2. Добавить новую книгу");
                System.out.println("3. Поиск книги по автору");
                System.out.println("4. Удаление книги");
                System.out.println("5. Выход");
                var select = scanner.nextLine();
                switch (select) {
                    case "1" -> printAllBooks(path);
                    case "2" -> addNewBook(scanner, path);
                    case "3" -> searchBookByAuthor(scanner, path);
                    case "4" -> removeBook(scanner, path);
                    case "5" -> {
                        return;
                    }
                    default -> System.out.println("Неверная команда");
                }
            }
        }
    }

    private static void removeBook(Scanner scanner, String path) throws IOException, ParseException {
        System.out.println("Введите название книги, которую нужно удалить: ");
        var title = scanner.nextLine();

        var jsonObject = getAllBooks(path);
        var jsonArray = (JSONArray) jsonObject.get("books");
        var iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            var book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }
        }

        try (var fileWriter = new FileWriter(path)) {
            fileWriter.write(jsonObject.toJSONString());
        }
    }

    private static void searchBookByAuthor(Scanner scanner, String path) throws IOException, ParseException {
        System.out.println("Введите имя автора:");
        var query = scanner.nextLine().toLowerCase();

        var jsonObject = getAllBooks(path);
        var jsonArray = (JSONArray) jsonObject.get("books");
        System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());

        for (var o : jsonArray) {
            var book = (JSONObject) o;
            if (!book.get("author").toString().toLowerCase().contains(query)) {
                continue;
            }
            System.out.println("\nТекущий элемент: book");
            System.out.println("Название книги: " + book.get("title"));
            System.out.println("Автор: " + book.get("author"));
            System.out.println("Год издания: " + book.get("year"));
        }
    }

    private static void addNewBook(Scanner scanner, String path) throws IOException, ParseException {
        System.out.print("Введите название книги: ");
        var title = scanner.nextLine();
        System.out.print("Введите автора: ");
        var author = scanner.nextLine();
        System.out.print("Введите год:");
        var year = scanner.nextLine();

        var jsonObject = getAllBooks(path);
        var jsonArray = (JSONArray) jsonObject.get("books");

        var newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", Integer.parseInt(year));

        jsonArray.add(newBook);

        try (var fileWriter = new FileWriter(path)) {
            fileWriter.write(jsonObject.toJSONString());
        }
    }

    private static JSONObject getAllBooks(String path) throws IOException, ParseException {
        var parser = new JSONParser();
        var obj = parser.parse(new FileReader(path));
        return (JSONObject) obj;
    }

    private static void printAllBooks(String path) {
        try {
            var jsonObject = getAllBooks(path);
            var jsonArray = (JSONArray) jsonObject.get("books");
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());

            for (var o : jsonArray) {
                var book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
