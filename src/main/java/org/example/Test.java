package org.example;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
//        String checker = new HttpStatusChecker().getStatusImage(200);
//        System.out.println(checker);
        HttpStatusImageDownloader downloader = new HttpStatusImageDownloader();
        downloader.downloadStatusImage(200);
//        HttpImageStatusCli cli = new HttpImageStatusCli();
//        cli.askStatus();
    }
}