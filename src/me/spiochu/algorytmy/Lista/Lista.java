package me.spiochu.algorytmy.Lista;

public class Lista {
    private ListaElem first;//head
    private ListaElem last;//tail

    public Lista() {
        first = last = null;
    }

    public void addFirst(int value){
        ListaElem newListaElem = new ListaElem(value);
        if (first == null){
            first = last = newListaElem;
        }else {
            first.setPrev(newListaElem);
            newListaElem.setNext(first);
            first = newListaElem;
        }
    }


    public void addLast(int value){
        ListaElem newListaElem = new ListaElem(value);

        if (first == null){
            first = last = newListaElem;
        }else {
            last.setNext(newListaElem);;
            newListaElem.setPrev(last);
            last = newListaElem;
        }
    }

    public int peekFirst(){
        return first.getValue();
    }

    public  int peekLast(){
        return last.getValue();
    }

    public int pollFirst(){
        if (first == null){
            //exception
            System.out.println("List is empty");
        }
        if (first.getNext() == null){
            last = null;
        }
        int value = first.getValue();
        first = first.getNext();
        if (first != null){
            first.setPrev(null);
        }
        return value;
    }

    public int pollLast(){
        if (last == null){
            //exception
            System.out.println("List is empty");
        }
        if (last.getPrev() == null){
            first = null;
        }
        int value = last.getValue();
        last = last.getPrev();
        if (last != null){
            last.setNext(null);
        }
        return value;
    }

    public void show(){
        ListaElem listaElemTemp = first;
        while (listaElemTemp != null){
            System.out.print(listaElemTemp.getValue()+" ");
            listaElemTemp = listaElemTemp.getNext();
        }
        System.out.println();
    }
    public void showReverse(){
        ListaElem listaElemTemp = last;
        while (listaElemTemp != null){
            System.out.print(listaElemTemp.getValue()+ " ");
            listaElemTemp = listaElemTemp.getPrev();
        }
        System.out.println();
    }

    public boolean search(int value){
        ListaElem listaElemTemp = first;
        while (listaElemTemp != null){
            if(listaElemTemp.getValue() == value){
                return true;
            }
            listaElemTemp = listaElemTemp.getNext();
        }
        return false;
    }

    public ListaElem searchElem(int value){
        ListaElem listaElemTemp = first;
        while (listaElemTemp != null){
            if(listaElemTemp.getValue() == value){
                return listaElemTemp;
            }
            listaElemTemp = listaElemTemp.getNext();
        }
        return null;
    }

    public boolean delete(int value){
        ListaElem listaElemTemp = searchElem(value);
        if (listaElemTemp == null) return false;
        if (listaElemTemp == first){
            pollFirst();
        }else if (listaElemTemp == last){
            pollLast();
        }else {
            listaElemTemp.getNext().setPrev(listaElemTemp.getPrev());
            listaElemTemp.getPrev().setNext(listaElemTemp.getNext());
        }
        return true;
    }
}
