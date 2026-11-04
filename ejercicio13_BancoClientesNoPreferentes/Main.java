// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Banco y Clientes


import java.io.*;
import java.util.*;

public class Main {
    
    // lee datos rapido de la entrada
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // lee la siguiente palabra o texto
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String linea = br.readLine();
            if (linea == null) return null;
            st = new StringTokenizer(linea);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        
        // lee cuantos eventos habra
        int n = Integer.parseInt(next());
        
        // crea una cola para la fila 1
        Cola fila1 = new Cola();
        
        // crea una pila para la fila 2
        Pila fila2 = new Pila();
        
        StringBuilder sb = new StringBuilder();

        // repite para cada evento
        for (int i = 0; i < n; i++) {
            String evento = next();
            int fila = Integer.parseInt(next());
            
            // si el evento es entrar
            if (evento.equals("E")) {
                String nombre = next();
                
                // si es la fila 1 entra a la cola
                if (fila == 1) fila1.encolar(nombre);
                
                // si es la fila 2 entra a la pila
                else fila2.push(nombre);
                
            } else {
                
                // si es la fila 1 sale de la cola
                if (fila == 1) sb.append(fila1.desencolar()).append("\n");
                
                // si es la fila 2 sale de la pila
                else sb.append(fila2.pop()).append("\n");
            }
        }
        
        // imprime todos los resultados juntos
        System.out.print(sb);
    }
}