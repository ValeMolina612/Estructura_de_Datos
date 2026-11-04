class Pila {
    private Nodo tope;

    Pila() {
        tope = null;
    }

    void agrega(int n) {
        Nodo nuevo = new Nodo(n);
        nuevo.sig = tope;
        tope = nuevo;
    }

    int saca() {
        if (tope == null) return -1;
        int dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}