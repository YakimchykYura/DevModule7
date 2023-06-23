package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HttpImageStatusCli {
    public void askStatus() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter HTTP status code");

        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Please enter valid number! \n");
        }

        int code = scanner.nextInt();
        new HttpStatusImageDownloader().downloadStatusImage(code);
    }

}
