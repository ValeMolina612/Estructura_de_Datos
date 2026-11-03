// Molina Rosas Maria Valeria
//02 de noviembre, 2026
// Maximo elemento

import java.io.*;
import java.util.*;

public class Main {
    // lector optimizado para procesar entradas grandes rapidamente
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
        // lee el numero total de operaciones o consultas
        int n = Integer.parseInt(next());
        Pila pila = new Pila();
        StringBuilder sb = new StringBuilder();

        // ciclo para procesar cada operacion
        for (int i = 0; i < n; i++) {
            int tipo = Integer.parseInt(next());
            
            // si el tipo es 1, agrega un elemento a la pila
            if (tipo == 1) {
                pila.push(Integer.parseInt(next()));
            } 
            // si el tipo es 2, borra el elemento de arriba
            else if (tipo == 2) {
                pila.pop();
            } 
            // si el tipo es 3, consulta y guarda el valor maximo actual
            else if (tipo == 3) {
                sb.append(pila.maximo()).append("\n");
            }
        }
        // imprime todo el resultado acumulado
        System.out.print(sb);
    }
}