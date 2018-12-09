package me.spiochu.algorytmy;

public class StosTab {
    private int tab[];
    private int top;

    public StosTab(int rozmiar) {
        tab = new int[rozmiar] ;
        top = -1;
    }

    public void push(int wartosc) throws ArrayIndexOutOfBoundsException {
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException();
        }
        tab[++top] = wartosc;
    }

    public int pop() throws ArrayIndexOutOfBoundsException {
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return tab[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == tab.length-1;
    }

    public int peek(){
        return tab[top];
    }
    public void show(){
        for (int i = 0; i <= top; i++) {
            System.out.print(tab[i]+ " ");
        }
        System.out.println();
    }
}

