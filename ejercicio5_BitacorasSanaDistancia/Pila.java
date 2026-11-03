//Molina Rosas Maria Valeria
//02 de noviembre, 2026
//ejercicio bitacora

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

    // quita y regresa el elemento de arriba
    int pop() {
        int dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}