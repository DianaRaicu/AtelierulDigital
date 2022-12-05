package patterns.visitor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Visitor durationVisitor = new DurationVisitor();
        Element elements[] = new Element[]{
                new Book(200, 3000),
                new Film(4000,100),
                new Album(5000,12)
        };
        for(Element currentElement: elements){
            currentElement.accept(durationVisitor);
        }

        System.out.println(durationVisitor);

        Visitor copiesVisitor = new CopiesVisitor();
        for(Element currentElement: elements){
            currentElement.accept(copiesVisitor);
        }

        System.out.println(copiesVisitor);
    }
}
