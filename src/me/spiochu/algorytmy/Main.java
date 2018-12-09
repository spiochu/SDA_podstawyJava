package me.spiochu.algorytmy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        wywolajStosTab();


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
