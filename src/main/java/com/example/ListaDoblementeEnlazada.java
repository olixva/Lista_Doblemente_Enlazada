package com.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListaDoblementeEnlazada implements List<Object> {

    public static int prueba = 0;
    private int tamayo;
    private Nodo inicio;
    private Nodo fin;

    public ListaDoblementeEnlazada() {
        tamayo = 0;
    }

    class Nodo {
        Object elemento;
        Nodo siguiente;
        Nodo anterior;
    }

    @Override
    public boolean add(Object arg0) {
        Nodo nodo = new Nodo();
        nodo.elemento = arg0;

        if (inicio != null) {
            nodo.siguiente = this.inicio;
            this.inicio.anterior = nodo;
        } else
            this.fin = nodo;
        this.inicio = nodo;
        tamayo++;

        return false;
    }

    @Override
    public void add(int index, Object arg1) {

        if (index >= tamayo || index < 0 ) throw new IndexOutOfBoundsException();

        if (tamayo == 0) {
        add(arg1);  
        }else if (index == tamayo) {
            Nodo nuevo = new Nodo();
            nuevo.elemento = arg1;
            
            nuevo.anterior = fin;
            fin.siguiente = nuevo;
            fin = nuevo;


        }else{
            
            Nodo nodoAux = inicio;
            Nodo nuevo = new Nodo();
            nuevo.elemento = arg1;
            
            for (int i = 0; i < index && nodoAux != null; i++) {
              nodoAux = nodoAux.siguiente;
            }

            nuevo.siguiente = nodoAux;
            nodoAux.anterior.siguiente = nuevo;
            nuevo.anterior = nodoAux.anterior;
            nodoAux.anterior = nuevo;
        }
    }

    @Override
    public boolean addAll(Collection<? extends Object> arg0) {
        
        for (Object o: arg0){

            if (!add(o)) return false;
        }
        
        return true;
    }

    @Override
    public boolean addAll(int arg0, Collection<? extends Object> arg1) {

       int i = arg0;
       for (Object object : arg1) {
            add(i, object);
            i++;
       }
        return true;
    }

    @Override
    public void clear() {

        Nodo n = inicio;
        while (n != null) {
            if (n.anterior != null) {
                n.anterior.siguiente = null;
                n.anterior = null;
            }
            n = n.siguiente;
        }
        this.inicio = null;
        this.fin = null;
        this.tamayo = 0;
    }

    @Override
    public boolean contains(Object o) {

        Nodo aux = inicio;
        while (aux != null) {
            if (aux.elemento.equals(o))
                return true;
            aux = aux.siguiente;
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> arg0) {

        for (Object o: arg0){
            if (!contains(o)) return false;
        }
        return true;
    }

    @Override
    public Object get(int index) {

        if ((index<0) || index >= tamayo) {

            throw new IndexOutOfBoundsException("Esta fuera del rango");
        }
            
        Nodo aux;
        if (index> (tamayo/2)) { 
            aux= fin;
            for (int i = 0; i < (tamayo - index); i++) {
                aux = aux.anterior;
            }
        }else {
            aux= inicio;
            for (int i = 0; i < (index); i++) {
                aux = aux.siguiente;
            }      
        }
        
        return aux.elemento;
    }

    @Override
    public int indexOf(Object arg0) {
        Nodo aux = inicio;
        int index;
        for (index = 0; aux != null && !aux.elemento.equals(arg0); index++, aux = aux.siguiente) ;
            
        if (aux == null) return -1;
       
       
        return index;
    }

    @Override
    public boolean isEmpty() {

        return tamayo == 0;
    }

    @Override
    public Iterator<Object> iterator() {

        return null;
    }

    @Override
    public int lastIndexOf(Object arg0) {

        return 0;
    }

    @Override
    public ListIterator<Object> listIterator() {

        return null;
    }

    @Override
    public ListIterator<Object> listIterator(int arg0) {

        return null;
    }

    @Override
    public boolean remove(Object arg0) {

        Nodo nodo = this.inicio;
        nodo.elemento = arg0;

        while (nodo.elemento != arg0 && nodo != null) {
            nodo = nodo.siguiente;
        }

        if (nodo.elemento.equals(arg0)) { // Elemento encontrado

            if (nodo.anterior == null) { // Comprobamos si es el primer elemento
                this.inicio = nodo.siguiente;
                nodo.siguiente.anterior = null;
            } else if (nodo.siguiente == null) { // Comprobamos si es el ultimo
                this.fin = nodo.anterior;
                nodo.anterior.siguiente = null;
            } else {
                nodo.anterior.siguiente = nodo.siguiente;
                nodo.siguiente.anterior = nodo.anterior;
            }
            tamayo--;

            return true;

        } else
            return false; // No existe el elemento
    }

    @Override
    public Object remove(int index) {
        
        if ((index<0) || index >= tamayo) {

            throw new IndexOutOfBoundsException("Esta fuera del rango");
        }

        Object o = get(index);
        remove(o);

        return o;
    }

    @Override
    public boolean removeAll(Collection<?> arg0) {

       for (Object object : arg0) {
        remove(object);
       }
       return true;
    }

    @Override
    public boolean retainAll(Collection<?> arg0) {
        boolean result = false;
        Nodo nodo = this.inicio;

        while (nodo != fin) {
            for (Object object : arg0) {
                if(!contains(object)){
                    remove(nodo.elemento);
                    result = true;
                }
            } 
        }

        return result;
    }

    @Override
    public Object set(int index, Object arg1) {

        if ((index<0) || index >= tamayo) {

            throw new IndexOutOfBoundsException("Esta fuera del rango");
        }
            
        Nodo aux;
        if (index> (tamayo/2)) { 
            aux = fin;
            for (int i = 0; i < (tamayo - index); i++) {
                aux = aux.anterior;
            }
        }else {
            aux = inicio;
            for (int i = 0; i < (index); i++) {
                aux = aux.siguiente;
            }      
        }
        
        Object o = aux.elemento;
        aux.elemento = arg1;
        
        return o;
    }

    @Override
    public int size() {

        return tamayo;
    }

    @Override
    public List<Object> subList(int arg0, int arg1) {

        return null;
    }

    @Override
    public Object[] toArray() {

        return null;
    }

    @Override
    public <T> T[] toArray(T[] arg0) {

        return null;
    }
}
