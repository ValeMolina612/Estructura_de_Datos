// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Paréntesis Balanceados

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

    static boolean coincide(char abre, char cierra) {
        return (abre == '(' && cierra == ')')
            || (abre == '[' && cierra == ']')
            || (abre == '{' && cierra == '}');
    }

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(next());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String cadena = next();
            Pila pila = new Pila();
            boolean balanceada = true;

            for (int j = 0; j < cadena.length() && balanceada; j++) {
                char c = cadena.charAt(j);
                if (c == '(' || c == '[' || c == '{') {
                    pila.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    if (pila.estaVacia() || !coincide(pila.pop(), c)) {
                        balanceada = false;
                    }
                }
            }
            if (!pila.estaVacia()) balanceada = false;

            sb.append(balanceada ? "SI" : "NO").append("\n");
        }
        System.out.print(sb);
    }
}