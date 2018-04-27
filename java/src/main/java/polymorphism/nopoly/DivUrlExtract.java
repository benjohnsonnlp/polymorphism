package polymorphism.nopoly;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ben on 4/27/18.
 */
public class DivUrlExtract {
    String url;

    public DivUrlExtract(String url) {
        this.url = url;
    }

    public ArrayList<String> extract() throws IOException {
        Document doc = Jsoup.connect(this.url).get();
        ArrayList<String> divTexts = new ArrayList<String>();

        for (Element div : doc.select("div")) {
            divTexts.add(div.text());
        }

        return divTexts;
    }
}
