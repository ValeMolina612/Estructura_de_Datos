// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// pila interactivo 

class Nodo {
    
    // guarda un numero entero[cite: 1]
    int dato;
    
    // apunta al siguiente nodo[cite: 1]
    Nodo sig;

    // el constructor guarda el dato[cite: 1]
    Nodo(int dato) {
        this.dato = dato;
        
        // el enlace comienza vacio[cite: 1]
        this.sig = null;
    }
}