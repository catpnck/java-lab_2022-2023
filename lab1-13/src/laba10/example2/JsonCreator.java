package laba10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreator {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        var library = new JSONObject();
        var books = new JSONArray();

        var book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        var book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (var fileWriter = new FileWriter("src/laba10/example2/example.json")) {
            fileWriter.write(library.toJSONString());
            System.out.println("JSON файл успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
