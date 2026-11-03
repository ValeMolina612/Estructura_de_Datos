class Pila {
    private Nodo tope;

    Pila() {
        tope = null;
    }

    boolean estaVacia() {
        return tope == null;
    }

    void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (tope != null && tope.maximo > dato) {
            nuevo.maximo = tope.maximo;
        }
        nuevo.sig = tope;
        tope = nuevo;
    }

    void pop() {
        if (tope != null) tope = tope.sig;
    }

    int maximo() {
        return tope.maximo;
    }
}