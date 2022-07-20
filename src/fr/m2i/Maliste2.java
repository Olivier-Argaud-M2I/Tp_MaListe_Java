package fr.m2i;

public class Maliste2<E> {

    private MonElement2<E> firstElement;
    private MonElement2<E> lastElement;

    public void add(E element){
        if(firstElement==null){
            MonElement2<E> elem =  new MonElement2<E>(element);
            firstElement = elem;
            lastElement = elem;
        }
        else{
            MonElement2<E> elem =  new MonElement2<E>(element);
            elem.setPrevious(lastElement);
            lastElement.setNext(elem);
            lastElement = elem;
        }
    }


    public E get(Integer index){
        MonElement2<E> temp = firstElement;
        Integer i = index;
        while(i>0){
            i--;
            temp = temp.getNext();
        }

        return (E)temp.getElement();
    }


    public void removeAt(Integer index){
        MonElement2<E> temp = getElement(index);
        if(temp.getPrevious()==null)
        {
            firstElement = temp.getNext();
            temp.getNext().setPrevious(null);
        }
        else{
            temp.getPrevious().setNext(temp.getNext());
            temp.getNext().setPrevious(temp.getPrevious());
        }
        temp = null;
    }

    private MonElement2<E> getElement(Integer index){
        MonElement2<E> temp = firstElement;
        Integer i = index;
        while(i>0){
            i--;
            temp = temp.getNext();
        }
        return temp;
    }


    public String print(){
        StringBuilder sb = new StringBuilder();
        MonElement2<E> elem = firstElement;
        while(elem!=null){
            sb.append(elem.getElement().toString()).append(" ");
            elem = elem.getNext();
        }

        return sb.toString();
    }

}
