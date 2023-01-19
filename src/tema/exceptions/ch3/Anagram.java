package tema.exceptions.ch3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Anagram {

    static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) throws IOException {
        String w = "listen";
        File in = new File("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\tema\\exceptions\\ch3\\smallList");
        BufferedReader br = new BufferedReader(new FileReader(in));
        PrintWriter out = new PrintWriter("C:\\Users\\RAICU\\IdeaProjects\\AtelierulDigitalGoogle\\src\\tema\\exceptions\\ch3\\out.txt");

        String st;
        StringTokenizer t;
        String word = "";

        while ((st = br.readLine()) != null) {
            t = new StringTokenizer(st);
            while (t.hasMoreTokens()) {
                word = t.nextToken();
                if (isAnagram(w, word)) {
                    out.println(word);
                }

            }
        }

        out.close();
    }

}
