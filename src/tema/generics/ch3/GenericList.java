package tema.generics.ch3;

class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> head;
    private IGenericNode<T> tail;
    public GenericList(T rootValue) {
        head = new GenericNode<T>();
        head.setValue(rootValue);
        tail = head;
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> newNode = new GenericNode<T>();
        newNode.setValue(element);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }


    @Override
    public void println() {
        IGenericNode<T> current = head;
        while(current!=null){
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }

    public IGenericNode<T> getHead() {
        return head;
    }
}
