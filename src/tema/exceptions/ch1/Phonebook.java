package tema.exceptions.ch1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\tema\\exceptions\\ch1\\phonebook.txt");


    BufferedReader br = new BufferedReader(new FileReader(file));

    String st;
    StringTokenizer t;
    String word="";

    while((st = br.readLine())!=null){
        t=new StringTokenizer(st);
        word=t.nextToken();
        if(word.equals("Abbey") || word.equals("Abdul")){
            word=t.nextToken();
            System.out.println(word);
        }else{
            word=t.nextToken();
        }
    }

}
}
