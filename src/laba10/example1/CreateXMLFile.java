package laba10.example1;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            var docFactory = DocumentBuilderFactory.newInstance();
            var docBuilder = docFactory.newDocumentBuilder();

            var doc = docBuilder.newDocument();
            var rootElement = doc.createElement("library");
            doc.appendChild(rootElement);

            var book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            var title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("Война и мир"));
            book1.appendChild(title1);

            var author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("Лев Толстой"));
            book1.appendChild(author1);

            var year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            var book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            var title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("Мастер и Маргарита"));
            book2.appendChild(title2);

            var author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Михаил Булгаков"));
            book2.appendChild(author2);

            var year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            var tf = TransformerFactory.newInstance();
            var transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            var source = new DOMSource(doc);
            var result = new StreamResult(new File("src/laba10/example1/example.xml"));
            transformer.transform(source, result);

            System.out.println("XML успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
