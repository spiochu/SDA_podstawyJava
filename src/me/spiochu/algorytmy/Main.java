package me.spiochu.algorytmy;

import me.spiochu.algorytmy.Stos.StosTab;
import me.spiochu.algorytmy.kolejka.KolejkaList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 100;
        int[] tab = new int[100];
        for (int j = 0; j < i; j++) {
            tab[j] = i;
        }

    }


    public static void wywolajKolejkaList(){
        KolejkaList kolejkaList = new KolejkaList();
        kolejkaList.add(1);
        kolejkaList.add(2);
        kolejkaList.add(3);
        System.out.println("peek:" +kolejkaList.peek());

        kolejkaList.poll();
        kolejkaList.poll();

        kolejkaList.add(4);
        kolejkaList.add(5);
        System.out.println("poll" + kolejkaList.poll());
        System.out.println("poll" + kolejkaList.poll());
        System.out.println("poll" + kolejkaList.poll());
        System.out.println("poll" + kolejkaList.poll());
    }


    public static void wywolajStosTab(){
        Scanner scaner = new Scanner(System.in);
        int tab[];
        int rozmiar;
        StosTab stosTab;
        System.out.println("Podaj rozmiar tablicy:");
        rozmiar = scaner.nextInt();
        tab = new int[rozmiar];
        stosTab = new StosTab(rozmiar);
        System.out.println("Podaj elementy tablicy:");
        while (true){
            System.out.println("1- push\n" +
                                "2 - pop\n"+
                                "3 - peek\n"+
                                "4 - show\n"+
                                "0 - wyjscie");
            int operacja = scaner.nextInt();

            switch (operacja){
                case 0:
                    return;
                case 1:
                    System.out.println("Podaj wartosc na stos");
                    int w = scaner.nextInt();
                    try{
                        stosTab.push(w);
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("!!TAblica pełna!!");
                    }

                    break;
                case 2:
                    try {
                        System.out.println("POP: " + stosTab.pop());
                    } catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("!!Pusta tablica!!");
                    }
                    break;
                case 3:
                    System.out.println("Peek: "+ stosTab.peek());
                    break;
                case 4:
                    stosTab.show();
                    break;
            }
        }
//        for (int i = 0; i < rozmiar; i++) {
//            tab[i] = scaner.nextInt();
//        }


    }
}
