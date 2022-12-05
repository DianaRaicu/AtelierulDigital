package patterns.visitor;

public class Album implements Element{
    private int numberOfCopies;
    private int numberOfSongs;

    public Album(int numberOfCopies, int numberOfSongs) {
        this.numberOfCopies = numberOfCopies;
        this.numberOfSongs = numberOfSongs;
    }

    public int  getNumberOfCopies(){
        return numberOfCopies;
    }


    public int getNumberOfSongs(){
        return numberOfSongs;
    }


    public void accept(Visitor v){
        v.visit(this);
    }

}
