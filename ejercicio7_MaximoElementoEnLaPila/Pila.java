// Molina Rosas Maria Valeria
//02 de noviembre, 2026
// Maximo elemento


class Pila {
    // el elemento que esta arriba
    private Nodo tope;

    // constructor inicializa la pila vacia
    Pila() {
        tope = null;
    }

    // revisa si la pila esta vacia
    boolean estaVacia() {
        return tope == null;
    }

    // agrega un elemento y actualiza el maximo
    void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (tope != null && tope.maximo > dato) {
            nuevo.maximo = tope.maximo;
        }
        nuevo.sig = tope;
        tope = nuevo;
    }

    // borra el elemento de arriba
    void pop() {
        if (tope != null) tope = tope.sig;
    }

    // regresa el valor maximo actual de la pila
    int maximo() {
        return tope.maximo;
    }
}