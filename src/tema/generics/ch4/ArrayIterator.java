package tema.generics.ch4;

import java.util.NoSuchElementException;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int index;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return array[index++];
}

}
