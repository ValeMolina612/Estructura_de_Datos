// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Banco y Clientes


class Cola {
    
    // apunta al inicio de la cola
    private Nodo frente;
    
    // apunta al final de la cola
    private Nodo fin;

    // constructor inicia la cola vacia
    Cola() {
        frente = null;
        fin = null;
    }

    // agrega un elemento al final de la cola
    void encolar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = nuevo;
        } else {
            fin.sig = nuevo;
        }
        fin = nuevo;
    }

    // saca y regresa el elemento del frente de la cola
    String desencolar() {
        String dato = frente.dato;
        frente = frente.sig;
        if (frente == null) fin = null;
        return dato;
    }
}