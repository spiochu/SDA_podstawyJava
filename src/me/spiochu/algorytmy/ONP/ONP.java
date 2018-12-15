package me.spiochu.algorytmy.ONP;

import me.spiochu.algorytmy.Stos.StosTab;

public class ONP {
    public void run(String tab[]){
        StosTab stosTab = new StosTab(tab.length);
        for (int i = 0; i < tab.length; i++) {
            try{
                int wartosc = Integer.parseInt(tab[i]);
                stosTab.push(wartosc);
            }catch (NumberFormatException e){
                int w1 = stosTab.pop();
                int w2 = stosTab.pop();
                String operacja = tab[i];
                int wynik = 0;
                if (operacja.equals("+")){
                    wynik = w2 + w1;
                }else if (operacja.equals("-")){
                    wynik = w2 - w1;
                }else if (operacja.equals("*")){
                    wynik = w2 * w1;
                }else if (operacja.equals("/")){
                    wynik = w2 / w1;
                }else{
                    return;
                }
            stosTab.push(wynik);
            }
        }
        System.out.println(stosTab.pop());
    }
}
