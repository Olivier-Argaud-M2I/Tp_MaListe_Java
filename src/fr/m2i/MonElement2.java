package fr.m2i;

public class MonElement2<T> {

    private MonElement2 previous;
    private MonElement2 next;

    private T element;

    public MonElement2(T element) {
        this.element = element;
    }

    public MonElement2 getPrevious() {
        return previous;
    }

    public void setPrevious(MonElement2 previous) {
        this.previous = previous;
    }

    public MonElement2 getNext() {
        return next;
    }

    public void setNext(MonElement2 next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
