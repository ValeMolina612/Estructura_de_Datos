// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// pila interactivo 


class Pila {
    
    // referencia al elemento superior
    private Nodo tope;

    // constructor inicia la pila vacia
    Pila() {
        tope = null;
    }

    // agrega un numero entero arriba de la pila
    void agrega(int n) {
        Nodo nuevo = new Nodo(n);
        nuevo.sig = tope;
        tope = nuevo;
    }

    // saca y regresa el elemento superior o -1 si esta vacia
    int saca() {
        if (tope == null) return -1;
        int dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}