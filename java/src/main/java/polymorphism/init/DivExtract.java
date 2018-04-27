package polymorphism.init;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Ben on 4/26/18.
 */
public class DivExtract {
    String filename;

    public DivExtract(String filename) {
        this.filename = filename;
    }

    public ArrayList<String> extract() throws IOException {
        Document doc = Jsoup.parse(new File(this.filename), "UTF-8");
        ArrayList<String> divTexts = new ArrayList<String>();

        for (Element div : doc.select("div")) {
            divTexts.add(div.text());
        }

        return divTexts;
    }

    public static void main(String[] args) {
        String filename = "java/sample.html";
        DivExtract e = new DivExtract(filename);
        try {
            for (String divText : e.extract()) {
                System.out.println(divText);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
