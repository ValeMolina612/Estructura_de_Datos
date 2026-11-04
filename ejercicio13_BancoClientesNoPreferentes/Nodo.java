// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Banco y Clientes

class Nodo {
    
    // guarda un numero entero
    int dato;
    
    // apunta al siguiente nodo
    Nodo sig;

    // el constructor guarda el dato
    Nodo(int dato) {
        this.dato = dato;
        
        // el enlace comienza vacio
        this.sig = null;
    }
}