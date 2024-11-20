package org.lessons.java.shop;


public class Prodotto {
    // ! variabili di istanza
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    float iva;

    // ? metodi

    public void generaCodice(){ // # torna un int codice random
        return ;
    }

    public float prezzoBase(){
        return prezzo;
    }

    public float prezzoIvato(){
        return prezzo + prezzo * iva;
    }
    
    public String nomeCompleto(){
        return codice + "-" + nome;
    }


}
