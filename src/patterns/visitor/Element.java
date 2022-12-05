package patterns.visitor;

public interface Element {
    void accept(Visitor v);
}
