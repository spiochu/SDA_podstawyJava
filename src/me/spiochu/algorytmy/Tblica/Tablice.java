package me.spiochu.algorytmy.Tblica;

public class Tablice {
    public void elementyNaParzystychIndeksach(int[] tab){
        for (int i = 99; i > 0; i--) {
            if (i%2 == 0){
                System.out.println(tab[i]);
            }
        }
    }

    public void sumaElementowPodzielnychPrzez3(int[] tab)
    {
        int suma = 0;
        for (int i = 99; i > 2; i--) {
            if (i%3 == 0){
                suma += tab[i];
            }
        }
        System.out.println(suma);
    }

    public void suma5Elementow(int[] tab){

        int suma=0;
        for (int i = 0; i < 5; i++) {
            if (i%2 == 0){
                suma += tab[i];
            }
        }
        if (tab.length >= 6){
            suma -= tab[tab.length-1];
        }
        System.out.println("wynik sumy poczatkowych 5 liczb odejmujac ostatni element jeżeli tablica ma wiecejnniż 5 elementów:"+suma);

    }

}
