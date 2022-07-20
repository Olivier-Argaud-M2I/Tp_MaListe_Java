package fr.m2i;

public class MonElement<T> {


    private T element;


    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public MonElement() {
    }

    public MonElement(T element) {
        this.element = element;
    }

}
