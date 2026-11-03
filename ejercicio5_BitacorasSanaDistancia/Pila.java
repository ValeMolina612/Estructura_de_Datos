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
        nuevo.sig = tope;
        tope = nuevo;
    }

    int pop() {
        int dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}