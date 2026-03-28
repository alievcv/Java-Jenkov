package classes.abstraction;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLProcessor extends URLProcessorBase {


    @Override
    protected void processURLData(InputStream input) throws IOException {

    }

    public static void main(String[] args) throws IOException {

        URLProcessor urlProcessor = new URLProcessor();
        URL url = new URL("https://api.finko.uz/api/v1/offer/public/individual?page=0&size=9&sortFields=created_at&sortDir=desc&currency=UZS&institutionType=BANK&reviewPeriod=-1");
        urlProcessor.process(url);
    }
}
