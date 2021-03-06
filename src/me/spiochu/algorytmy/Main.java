package me.spiochu.algorytmy;

import me.spiochu.algorytmy.Lista.Lista;
import me.spiochu.algorytmy.ONP.ONP;
import me.spiochu.algorytmy.Stos.StosTab;
import me.spiochu.algorytmy.Kolejka.KolejkaList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 100;
        int[] tab = new int[100];
        for (int j = 0; j < i; j++) {
            tab[j] = i;
        }

    }

    public static  void  wywolajLista(){
        Lista lista = new Lista();
        lista.addFirst(3);
        lista.addFirst(2);
        lista.addFirst(1);
        lista.show();
        lista.showReverse();
        lista.addLast(4);
        lista.addLast(5);
        lista.show();
        lista.showReverse();
        System.out.println(lista.peekFirst());
        System.out.println(lista.peekLast());
        lista.pollFirst();
        lista.pollLast();
        lista.show();

        System.out.println("Czy na liscie znajduje sie wartosc 5 : " + lista.search(5));
        System.out.println("Czy na liscie znajduje sie wartosc 3 : " + lista.search(3));
        lista.delete(3);
        lista.show();
    }
    public static void wywolajONP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraażenie w ONP");
        String wejscie = scanner.nextLine();
        String[] dane = wejscie.split(" ");
        if (dane.length <3){
            System.out.println("podano zbyt mało elemenów");
        }else {
            new ONP().run(dane);
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
