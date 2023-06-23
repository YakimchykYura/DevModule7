package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    public String getStatusImage(int code) throws IOException {
        String stringUrl = "https://http.cat/" + code + ".jpg";
        HttpURLConnection connection = (HttpURLConnection) new URL(stringUrl).openConnection();
        int response = connection.getResponseCode();
        if (response == 404) {
            throw new FileNotFoundException(String.format("Image with code %s not found.", code));
        } else {
            return stringUrl;
        }
    }
}
