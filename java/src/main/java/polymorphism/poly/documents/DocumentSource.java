package polymorphism.poly.documents;

import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Ben on 4/27/18.
 */
public interface DocumentSource {
    public Document getDocument() throws Exception;
}
