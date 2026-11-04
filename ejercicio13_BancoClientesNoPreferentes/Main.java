// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Banco y Clientes


import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String linea = br.readLine();
            if (linea == null) return null;
            st = new StringTokenizer(linea);
        }
        return st.nextToken();
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(next());
        Cola fila1 = new Cola();
        Pila fila2 = new Pila();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String evento = next();
            int fila = Integer.parseInt(next());
            if (evento.equals("E")) {
                String nombre = next();
                if (fila == 1) fila1.encolar(nombre);
                else fila2.push(nombre);
            } else {
                if (fila == 1) sb.append(fila1.desencolar()).append("\n");
                else sb.append(fila2.pop()).append("\n");
            }
        }
        System.out.print(sb);
    }
}