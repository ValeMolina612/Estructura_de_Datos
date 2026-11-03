//Maria Valeria Molina Rosas
//02 de noviembre, 2026
//ejercicio EasyStack

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

    // agrega un elemento arriba
    void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.sig = tope;
        tope = nuevo;
    }

    // borra el elemento de arriba
    void pop() {
        if (tope != null) tope = tope.sig;
    }

    // regresa el valor de arriba
    int top() {
        return tope.dato;
    }
}