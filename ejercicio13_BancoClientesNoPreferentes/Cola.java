// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Banco y Clientes


class Cola {
    private Nodo frente;
    private Nodo fin;

    Cola() {
        frente = null;
        fin = null;
    }

    void encolar(String dato) {
        Nodo nuevo = new Nodo(dato);
        if (fin == null) {
            frente = nuevo;
        } else {
            fin.sig = nuevo;
        }
        fin = nuevo;
    }

    String desencolar() {
        String dato = frente.dato;
        frente = frente.sig;
        if (frente == null) fin = null;
        return dato;
    }
}