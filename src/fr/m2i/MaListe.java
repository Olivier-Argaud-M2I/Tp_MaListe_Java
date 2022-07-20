package fr.m2i;


import java.util.Arrays;

public class MaListe <E>{

//    private MonElement<E> firstElement;
//    private MonElement<E> lastElement;

    private Integer size = 0;

    private MonElement[] data = new MonElement[0];
    private MonElement[] dataTampon= new MonElement[0];;



    public MaListe(){

    }


    public void add(E element){
        dataTampon = data;
        data = Arrays.copyOf(dataTampon,dataTampon.length+1);
        data[data.length-1] = new MonElement(element);

    }

    public E get(Integer index){
        return (E) data[index].getElement();
    }

    public void remove(E element){
        int index = getIndex(element);
        MonElement[] debutTab = Arrays.copyOf(data,index);
        MonElement[] finTab = Arrays.copyOfRange(data,index+1,data.length);
        data = new MonElement[data.length-1];
        for( int i=0;i< debutTab.length+finTab.length;i++){
            data[i] = i<debutTab.length ? debutTab[i] : finTab[i-debutTab.length];
        }

    }

    public void removeAt(Integer index){
        MonElement[] debutTab = Arrays.copyOf(data,index);
        MonElement[] finTab = Arrays.copyOfRange(data,index+1,data.length);
        data = new MonElement[data.length-1];
        for( int i=0;i< debutTab.length+finTab.length;i++){
            data[i] = i<debutTab.length ? debutTab[i] : finTab[i-debutTab.length];
        }

    }


    public String print(){

        StringBuilder sb = new StringBuilder();
        for (MonElement elem:data) {
            sb.append(elem.getElement().toString()).append(" ");
//            System.out.println(elem.getElement().toString());
        }
        String string = sb.toString();
        return  string;
    }

    public Integer getIndex(E element){
        int index=0;
        for (int i= 0;i< data.length;i++){
            if(data[i].getElement().equals(element)){
                index = i;
                break;
            }
        }
        return index;
    }

}
