package me.spiochu.algorytmy.kolejka;

public class KolejkaList {
    private KolejkaElem first;
    private KolejkaElem last;

    public KolejkaList() {
        first = last = null;
    }

    public void add(int value){
        KolejkaElem temp = new KolejkaElem(value, null);
        if (first == null){
            first = last = temp;
        }else{
            last.setNext(temp);
            last = temp;
        }
    }

    public int poll() throws NullPointerException {
        if (this.first == null){
            System.out.println("Kolejka jest pusta");
            return 0;
            //TODO exeption
        }

        if (first.getNext() == null){
            last = null;
        }

        int value = this.first.getValue();
        this.first = this.first.getNext();
        return value;
    }

    public int peek() {
        return this.first.getValue();
    }

    public void show(){
        KolejkaElem temp = first;
        while (temp != null){
            System.out.print(temp.getValue() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
