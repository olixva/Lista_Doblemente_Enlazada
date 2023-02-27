package com.example;

public class Main {
    
    public static void main(String[] args) {
        
        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();

          l.add("uno");
        l.add("dos");
        l.add("tres");

        l.remove("tres");
        l.remove("dos");
        l.remove("uno");
    }
}
