//Maria Valeria Molina Rosas
//02 de noviembre, 2026
//ejercicio EasyStack


// lee la entrada rapido con buffer
import java.io.*;
import java.util.*;

public class Main {
    // lector optimizado para datos grandes
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // funcion para leer la siguiente palabra o numero
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String linea = br.readLine();
            if (linea == null) return null;
            st = new StringTokenizer(linea);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        // lee cuantas operaciones se van a hacer
        int t = Integer.parseInt(next());
        Pila pila = new Pila();
        StringBuilder sb = new StringBuilder();

        // ciclo para procesar cada operacion
        for (int i = 0; i < t; i++) {
            int p = Integer.parseInt(next());
            
            // si es 1, agrega un elemento a la pila
            if (p == 1) {
                pila.push(Integer.parseInt(next()));
            } 
            // si es 2, borra el elemento de arriba
            else if (p == 2) {
                pila.pop();
            } 
            // si es 3, revisa el elemento de arriba o si esta vacia
            else if (p == 3) {
                if (pila.estaVacia()) sb.append("Empty!\n");
                else sb.append(pila.top()).append("\n");
            }
        }
        // imprime todo el resultado acumulado
        System.out.print(sb);
    }
}