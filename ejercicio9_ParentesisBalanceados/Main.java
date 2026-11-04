// Molina Rosas Maria Valeria
//03 de noviembre, 2026
// Paréntesis Balanceados

import java.io.*;
import java.util.*;

public class Main {
    
    // lee datos rapido de la entrada
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // lee la siguiente palabra o numero
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            String linea = br.readLine();
            if (linea == null) return null;
            st = new StringTokenizer(linea);
        }
        return st.nextToken();
    }

    // revisa si el simbolo que abre coincide con el que cierra
    static boolean coincide(char abre, char cierra) {
        return (abre == '(' && cierra == ')')
            || (abre == '[' && cierra == ']')
            || (abre == '{' && cierra == '}');
    }

    public static void main(String[] args) throws IOException {
        
        // lee cuantos casos de prueba hay
        int t = Integer.parseInt(next());
        StringBuilder sb = new StringBuilder();

        // repite para cada caso de prueba
        for (int i = 0; i < t; i++) {
            String cadena = next();
            Pila pila = new Pila();
            boolean balanceada = true;

            // recorre cada caracter de la cadena
            for (int j = 0; j < cadena.length() && balanceada; j++) {
                char c = cadena.charAt(j);
                
                // si es apertura lo guarda en la pila
                if (c == '(' || c == '[' || c == '{') {
                    pila.push(c);
                } else if (c == ')' || c == ']' || c == '}') {
                    
                    // si cierra revisa si coincide con el ultimo de la pila
                    if (pila.estaVacia() || !coincide(pila.pop(), c)) {
                        balanceada = false;
                    }
                }
            }
            
            // si la pila no esta vacia la cadena queda incompleta
            if (!pila.estaVacia()) balanceada = false;

            // guarda la respuesta para imprimir despues
            sb.append(balanceada ? "SI" : "NO").append("\n");
        }
        
        // imprime todas las respuestas juntas
        System.out.print(sb);
    }
}