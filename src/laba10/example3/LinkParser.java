package laba10.example3;

import org.jsoup.Jsoup;

public class LinkParser {
    public static void main(String[] args) {
	var url = "https://itlearn.ru/first-steps";
	try {
	    var doc = Jsoup.connect(url).get();
	    var links = doc.select("a[href]");
	    for (var link : links) {
		System.out.println(link.attr("abs:href"));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
