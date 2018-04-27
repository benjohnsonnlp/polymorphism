package polymorphism.nopoly;

import java.io.IOException;

/**
 * Created by Ben on 4/27/18.
 */
public class Driver {
    public static void main(String[] args) {
        String filename = "java/sample.html";
        DivFileExtract e = new DivFileExtract(filename);
        try {
            for (String divText : e.extract()) {
                System.out.println(divText);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        System.out.println("----------------------");
        String url = "https://www.csee.umbc.edu/";
        DivUrlExtract ue = new DivUrlExtract(url);
        try {
            for (String divText : ue.extract()) {
                System.out.println(divText);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
