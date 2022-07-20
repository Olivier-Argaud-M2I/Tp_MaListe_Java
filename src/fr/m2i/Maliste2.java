package fr.m2i;

public class Maliste2<E> {

    private MonElement2 firstElement;
    private MonElement2 lastElement;

    public void add(E element){
        if(firstElement==null){
            MonElement2 elem =  new MonElement2(element);
            firstElement = elem;
            lastElement = elem;
        }
        else{
            MonElement2 elem =  new MonElement2(element);
            elem.setPrevious(lastElement);
            lastElement.setNext(elem);
            lastElement = elem;
        }
    }


    public E get(Integer index){
        MonElement2 temp = firstElement;
        Integer i = index;
        while(i>0){
            i--;
            temp = temp.getNext();
        }

        return (E)temp.getElement();
    }


    public void removeAt(Integer index){
        MonElement2 temp = getElement(index);
        if(temp.getPrevious()==null)
        {
            firstElement = temp.getNext();
            temp.getNext().setPrevious(null);
        }
        else{
            temp.getPrevious().setNext(temp.getNext());
            temp.getNext().setPrevious(temp.getPrevious());
        }

    }

    private MonElement2 getElement(Integer index){
        MonElement2 temp = firstElement;
        Integer i = index;
        while(i>0){
            i--;
            temp = temp.getNext();
        }
        return temp;
    }


    public String print(){
        StringBuilder sb = new StringBuilder();
        MonElement2 elem = firstElement;
        while(elem!=null){
            sb.append(elem.getElement().toString()).append(" ");
            elem = elem.getNext();
        }

        return sb.toString();
    }

}
