package me.spiochu.algorytmy.kolejka;

public class KolejkaElem {
    private int value;
    private KolejkaElem next;
    public KolejkaElem()
    {

    }
    public KolejkaElem(int value,KolejkaElem next){
        this.next = next;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public KolejkaElem getNext() {
        return next;
    }

    public void setNext(KolejkaElem next) {
        this.next = next;
    }
}
