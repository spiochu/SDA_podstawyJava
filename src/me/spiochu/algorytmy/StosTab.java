package me.spiochu.algorytmy;

public class StosTab {
    private int tab[];
    private int top;

    public StosTab(int rozmiar) {
        tab = new int[rozmiar] ;
        top = -1;
    }

    public void puch(int wartosc){
        tab[++top] = wartosc;
    }

    public int pop(){
        return tab[top--];
    }
}
