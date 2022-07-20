package fr.m2i;

public class MonElement2<T> {

    private MonElement2<T> previous;
    private MonElement2<T> next;

    private T element;

    public MonElement2(T element) {
        this.element = element;
    }

    public MonElement2<T> getPrevious() {
        return previous;
    }

    public void setPrevious(MonElement2<T> previous) {
        this.previous = previous;
    }

    public MonElement2<T> getNext() {
        return next;
    }

    public void setNext(MonElement2<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
