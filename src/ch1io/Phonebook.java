package ch1io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = null;
        Contact c = new Contact();
        String a;

        try {
            scan = new Scanner(new BufferedReader(new FileReader("book.txt")));
            scan.useLocale(Locale.US);
            while (scan.hasNext()) {
                if (scan.next()!=null) {



                } else {
                    scan.next();
                }
            }
        } catch(FileNotFoundException e){
            System.out.println("Eroare");

        }        finally {
            if (scan != null) scan.close();
        }
    }
}
