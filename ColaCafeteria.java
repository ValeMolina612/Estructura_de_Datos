/**
 *Maria Valeria Molina Rosas
 *Clase ColaCafeteria basada en nodos para gestionar las listas de espera
 */
public class ColaCafeteria {
    private Nodo frente;
    private Nodo fin;

    public ColaCafeteria() {
        this.frente = null;
        this.fin = null;
    }

    // Verifica si la fila está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Agregar una persona al final de la fila
    public void encolar(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }