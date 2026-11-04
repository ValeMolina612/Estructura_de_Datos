// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Banco y Clientes

class Pila {
    
    // referencia al elemento superior
    private Nodo tope;

    // constructor inicia la pila vacia
    Pila() {
        tope = null;
    }

    // agrega un texto arriba de la pila
    void push(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.sig = tope;
        tope = nuevo;
    }

    // saca y regresa el elemento superior
    String pop() {
        String dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}