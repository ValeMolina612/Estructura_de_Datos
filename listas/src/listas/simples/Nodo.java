package listas.simple;

/**
*elemento nodo de una lista
*@author Valeria Molina
*@date 15/octubre/2026
**/

public class Nodo {
    private int valor;
    private Nodo sig;

    public Nodo() {
        this.valor = 0;
        this.sig = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}