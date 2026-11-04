// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Maximo elemento

class Nodo {
    
    // guarda una letra
    char dato;
    
    // apunta al siguiente nodo
    Nodo sig;

    // el constructor guarda el dato
    Nodo(char dato) {
        this.dato = dato;
        
        // el enlace comienza vacio
        this.sig = null;
    }
}