// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Paréntesis Balanceados

class Pila {
    
    // referencia al elemento superior
    private Nodo tope;

    // constructor inicia la pila vacia
    Pila() {
        tope = null;
    }

    // revisa si la pila no tiene elementos
    boolean estaVacia() {
        return tope == null;
    }

    // agrega un elemento arriba de la pila
    void push(char dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.sig = tope;
        tope = nuevo;
    }

    // saca y regresa el elemento superior
    char pop() {
        char dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}
