package fr.m2i;

import java.util.ArrayList;

public class MainTp5 {

    public static void main(String[] args){


        MaListe<String> liste = new MaListe<>();

        liste.add("toto");
        liste.add("titi");
        liste.add("tutu");

        System.out.println(liste.print());
        System.out.println(liste.getIndex("titi"));

        liste.remove("titi");
        System.out.println(liste.print());


        Maliste2<String> liste2 = new Maliste2<>();

        liste2.add("lolo");
        liste2.add("lili");
        liste2.add("lulu");

        System.out.println(liste2.get(1));
        System.out.println(liste2.print());

        liste2.removeAt(1);
        System.out.println(liste2.print());

//
//        System.out.println(liste.get(1));
//
//        MaListe<Integer> listeInt = new MaListe<>();
//
//        listeInt.add(5);
//
//        System.out.println(listeInt.get(0)+1);
//
//
//        ArrayList<Integer> listeInt2 = new ArrayList<>();
//
//        listeInt2.add(6);
//
//        System.out.println(listeInt2.get(0)+1);

    }

}
