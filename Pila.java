//Maria Valeria Molina Rosas
//01 de noviembre, 2026
//ejercicios pilas

class Pila {
    // Apuntador que siempre guarda la referencia al elemento que está mero arriba de la pila
    private Nodo tope;

    /**
     * Constructor de la Pila: Inicializa la pila cuando se crea por primera vez.
     * Como al principio no tiene elementos, asigna null a tope para indicar que está vacía.
     */
    Pila() {
        tope = null;
    }

    /**
     * Método para verificar si está vacía: Revisa si la pila tiene elementos o no.
     * Devuelve true si tope es null (no hay nada) o false si ya contiene datos.
     */
    boolean estaVacia() {
        return tope == null;
    }

    /**
     * Metodo push (Insertar): Agrega un nuevo elemento en la parte superior de la pila.
     * 1. Crea un nuevo Nodo con el texto recibido.
     * 2. Conecta el nodo nuevo haciendo que su enlace 'sig' apunte al antiguo tope.
     * 3. Convierte al nuevo nodo en el nuevo tope de la pila.
     */
    void push(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.sig = tope;
        tope = nuevo;
    }

    /**
     * Método pop (Sacar): Extrae y elimina el elemento que está mero arriba de la pila.
     * 1. Verifica si la pila está vacía; si es así, regresa null para evitar errores.
     * 2. Guarda temporalmente el valor del tope actual.
     * 3. Mueve el tope hacia el nodo de abajo (tope.sig).
     * 4. Regresa el valor del elemento que acabamos de sacar.
     */
    String pop() {
        if (tope == null) return null;
        String dato = tope.dato;
        tope = tope.sig;
        return dato;
    }
}