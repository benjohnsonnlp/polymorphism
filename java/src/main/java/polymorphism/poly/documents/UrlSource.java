package polymorphism.poly.documents;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Ben on 4/27/18.
 */
public class UrlSource implements DocumentSource {
    String url;

    public UrlSource(String url) {
        this.url = url;
    }

    public Document getDocument() throws IOException {
        return Jsoup.connect(this.url).get();
    }
}
