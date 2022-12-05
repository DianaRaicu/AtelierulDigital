package patterns.visitor;

public class DurationVisitor implements Visitor{
    private int duration;

    @Override
    public void visit(Book book) {
        duration += book.getNrOfPages() * 10;
    }

    @Override
    public void visit(Film film) {
        duration += film.getDuration();
    }

    @Override
    public void visit(Album album) {
        duration += album.getNumberOfSongs() * 4;
    }

    @Override
    public String toString() {
        return "DurationVisitor{" +
                "duration=" + duration +
                '}';
    }
}
