package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HttpStatusImageDownloader {
    public void downloadStatusImage(int code) throws IOException {
        String url = new HttpStatusChecker().getStatusImage(code);
        try(InputStream in = new URL(url).openStream()) {
            String path = "src/main/java/org/example" + code + ".jpg";
            if (!new File(path).exists()) {
                Files.copy(in, Paths.get(path));
            } else {
                System.out.println(String.format("File with code %s already exist!", code));
            }
        } catch(Exception e) {
            throw new FileNotFoundException(String.format("Image with code %s not found.", code));
        }
    }
}
