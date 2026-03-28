package classes.abstraction;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public abstract class URLProcessorBase {
    public void process(URL url) throws IOException {

        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();
        byte[] data = input.readAllBytes();

        System.out.println("Headers: " + urlConnection.getHeaderFields());


        // Convert to readable text (VERY important)
        System.out.println(new String(data));

       // Pass to method again
        processURLData(new java.io.ByteArrayInputStream(data));
        try {
            processURLData(input);
        } finally {
            input.close();
        }
    }

    protected abstract void processURLData(InputStream input)
            throws IOException;

}
