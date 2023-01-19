package tema.generics.ch3;

public class GenericNode<T> implements IGenericNode<T>{
    private T value;
    private IGenericNode<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public IGenericNode<T> getNext() {
        return next;
    }

    public void setNext(IGenericNode<T> next) {
        this.next=next;
}

}
