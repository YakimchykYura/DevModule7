package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter HTTP status code");
        int code;
        while (!scanner.hasNextInt() || (code = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.print("Please enter valid number! \n");
        }
        new HttpStatusImageDownloader().downloadStatusImage(code);
    }

}
