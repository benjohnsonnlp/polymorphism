package polymorphism.poly;

import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

import polymorphism.poly.documents.DocumentSource;

/**
 * Created by Ben on 4/26/18.
 */
public class HtmlAccessor {
    DocumentSource source;

    public HtmlAccessor(DocumentSource source) {
        this.source = source;
    }

    public ArrayList<String> divs() throws Exception {
        ArrayList<String> divTexts = new ArrayList<String>();

        for (Element div : source.getDocument().select("div")) {
            divTexts.add(div.text());
        }

        return divTexts;
    }
}
