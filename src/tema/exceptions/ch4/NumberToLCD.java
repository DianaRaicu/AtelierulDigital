package tema.exceptions.ch4;

import java.io.*;

public class NumberToLCD {
    public static void Stage1(char nr){


    }
    public static void main(String[] args) throws IOException {
        File in = new File("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\tema\\exceptions\\ch4\\in.txt");
        BufferedReader br = new BufferedReader(new FileReader(in));
        PrintWriter out = new PrintWriter("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\tema\\exceptions\\ch4\\out.txt");

        String st;
        int nr;
        LCD lcd = null;

        while ((st = br.readLine()) != null) {
            nr=Integer.parseInt(String.valueOf(st));
            out.println(lcd.ToLCD(nr));
                    }

        out.close();
    }

}
