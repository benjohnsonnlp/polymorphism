package polymorphism.poly;

import java.util.Arrays;
import java.util.List;

import polymorphism.poly.documents.DocumentSource;
import polymorphism.poly.documents.FileSource;
import polymorphism.poly.documents.UrlSource;

/**
 * Created by Ben on 4/27/18.
 */
public class Driver {
    public static void main(String[] args) throws Exception {
        List<DocumentSource> sources = Arrays.asList(
                new FileSource("java/sample.html"),
                new UrlSource("https://www.csee.umbc.edu/"
                ));

        for (DocumentSource source : sources) {
            HtmlAccessor e = new HtmlAccessor(source);
            for (String divText : e.divs()) {
                System.out.println(divText);
                System.out.println("--------------------");
            }
        }
    }
}
