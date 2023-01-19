package tema.exceptions.ch2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Secretmesssage {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\tema\\exceptions\\ch2\\message.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        String regEx="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index;

        while((st = br.readLine())!=null){
            for(int i=0; i<st.length();i++) {
                index = regEx.indexOf(st.charAt(i));
                if (index >= 0 ) {
                    if (st.charAt(i) != 'X') {
                        System.out.print(st.charAt(i));
                    } else {
                        if (st.charAt(i) == 'X') {
                            System.out.print(" ");
                        }
                    }
                }
            }

        }
    }
}
