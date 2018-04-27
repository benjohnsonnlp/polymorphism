package polymorphism.poly.documents;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;

/**
 * Created by Ben on 4/27/18.
 */
public class FileSource implements DocumentSource {
    String filename;

    public FileSource(String filename) {
        this.filename = filename;
    }

    public Document getDocument() throws Exception {
        return Jsoup.parse(new File(this.filename), "UTF-8");
    }
}
