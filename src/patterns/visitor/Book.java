package patterns.visitor;

public class Book implements Element{
    private int nrOfPages;
    private int nrOfCopies;


    public Book(int nrOfPages, int nrOfCopies) {
        this.nrOfPages = nrOfPages;
        this.nrOfCopies = nrOfCopies;
    }
public int getNrOfPages(){
        return nrOfPages;
}
    public int getNrOfCopies(){
        return nrOfCopies;
    }


    public void accept(Visitor v){
        v.visit(this);
    }
}
