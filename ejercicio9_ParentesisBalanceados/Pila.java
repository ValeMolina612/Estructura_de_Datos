// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Paréntesis Balanceados

class Pila {
    private Nodo tope;

    Pila() {
        tope = null;
    }

    boolean estaVacia() {
        return tope == null;
    }

    void push(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.sig = tope;
        tope = nuevo;
    }

    char pop() {
        char dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}

