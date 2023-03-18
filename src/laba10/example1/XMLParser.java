package laba10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XMLParser {
    public static void main(String[] args)
	    throws ParserConfigurationException, IOException, SAXException, TransformerException {
	var inputFile = new File("src/laba10/example1/example.xml");
	var dbFactory = DocumentBuilderFactory.newInstance();
	var dBuilder = dbFactory.newDocumentBuilder();
	var doc = dBuilder.parse(inputFile);
	doc.normalizeDocument();
	try (var scanner = new Scanner(System.in)) {
	    while (true) {
		System.out.println();
		System.out.println("Меню:");
		System.out.println("1. Вывести все книги");
		System.out.println("2. Добавить новую книгу");
		System.out.println("3. Поиск книги по автору");
		System.out.println("4. Поиск книги по году издания");
		System.out.println("5. Удаление книги");
		System.out.println("6. Выход");
		var select = scanner.nextLine();
		switch (select) {
		case "1" -> printAllBooks(doc);
		case "2" -> addNewBook(scanner, inputFile, doc);
		case "3" -> searchBookByAuthor(scanner, doc);
		case "4" -> searchBookByYear(scanner, doc);
		case "5" -> removeBook(scanner, doc, inputFile);
		case "6" -> {
		    return;
		}
		default -> System.out.println("Неверная команда");
		}
	    }
	}
    }

    private static void printAllBooks(Document doc) {
	try {
	    doc.getDocumentElement().normalize();
	    System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
	    var nodes = doc.getElementsByTagName("book");
	    var elementList = new ArrayList<Element>();
	    for (var i = 0; i < nodes.getLength(); i++) {
		if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
		    elementList.add((Element) nodes.item(i));
		}
	    }
	    printElements(elementList);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private static void printElements(List<Element> elements) {
	for (var element : elements) {
	    System.out.println("\nТекущий элемент: " + element.getNodeName());
	    System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
	    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
	    System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
	}
    }

    private static void addNewBook(Scanner scanner, File file, Document doc) throws TransformerException {
	System.out.print("Введите название книги: ");
	var title = scanner.nextLine();
	System.out.print("Введите автора: ");
	var author = scanner.nextLine();
	System.out.print("Введите год:");
	var year = scanner.nextLine();

	var root = doc.getDocumentElement();
	var bookNode = doc.createElement("book");
	root.appendChild(bookNode);

	var titleNode = doc.createElement("title");
	titleNode.appendChild(doc.createTextNode(title));
	bookNode.appendChild(titleNode);

	var authorNode = doc.createElement("author");
	authorNode.appendChild(doc.createTextNode(author));
	bookNode.appendChild(authorNode);

	var yearNode = doc.createElement("year");
	yearNode.appendChild(doc.createTextNode(year));
	bookNode.appendChild(yearNode);

	doc.setXmlStandalone(true);
	doc.normalizeDocument();

	var transformer = TransformerFactory.newInstance().newTransformer();
	transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
	transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	var source = new DOMSource(doc);
	var result = new StreamResult(file);
	transformer.transform(source, result);
    }

    private static void searchBookByAuthor(Scanner scanner, Document doc) {
	System.out.println("Введите имя автора:");
	var query = scanner.nextLine().toLowerCase();
	var nodes = doc.getElementsByTagName("book");
	var nodeList = new ArrayList<Node>();
	for (var i = 0; i < nodes.getLength(); i++) {
	    nodeList.add(nodes.item(i));
	}
	var filtered = nodeList.stream().filter(n -> n.getNodeType() == Node.ELEMENT_NODE).map(n -> (Element) n)
		.filter(e -> e.getElementsByTagName("author").item(0).getTextContent().toLowerCase().contains(query))
		.toList();
	printElements(filtered);
    }

    private static void searchBookByYear(Scanner scanner, Document doc) {
	System.out.println("Введите год издания:");
	var query = scanner.nextLine().toLowerCase();
	var nodes = doc.getElementsByTagName("book");
	var nodeList = new ArrayList<Node>();
	for (var i = 0; i < nodes.getLength(); i++) {
	    nodeList.add(nodes.item(i));
	}
	var filtered = nodeList.stream().filter(n -> n.getNodeType() == Node.ELEMENT_NODE).map(n -> (Element) n)
		.filter(e -> e.getElementsByTagName("year").item(0).getTextContent().equals(query)).toList();
	printElements(filtered);
    }

    private static void removeBook(Scanner scanner, Document doc, File file) throws TransformerException {
	System.out.println("Введите название книги, которую нужно удалить: ");
	var title = scanner.nextLine();
	var nodes = doc.getElementsByTagName("book");
	for (var i = 0; i < nodes.getLength(); i++) {
	    if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE && ((Element) nodes.item(i)).getElementsByTagName(
		    "title").item(0).getTextContent().equals(title)) {
		var parentNode = nodes.item(i).getParentNode();
		parentNode.removeChild(nodes.item(i));
	    }
	}

	doc.normalizeDocument();

	var transformer = TransformerFactory.newInstance().newTransformer();
	transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
	transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	var source = new DOMSource(doc);
	var result = new StreamResult(file);
	transformer.transform(source, result);
    }
}
