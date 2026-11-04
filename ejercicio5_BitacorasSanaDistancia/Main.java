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
        // lee el numero total de elementos
        int n = Integer.parseInt(next());
        int[] d = new int[n];
        // guarda los valores en un arreglo
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(next());
        }

        Pila pila = new Pila();
        StringBuilder sb = new StringBuilder();
        int llamada = 0;   // indice para recorrer el arreglo
        int libreEn = 1;   // control de tiempo o posicion

        // ciclo para leer los telefonos y agregarlos a la pila
        for (int i = 1; i <= n; i++) {
            int telefono = Integer.parseInt(next());
            pila.push(telefono);
            // verifica si cumple la condicion para sacar de la pila
            if (i >= libreEn) {
                sb.append(pila.pop()).append("\n");
                libreEn = i + d[llamada];
                llamada++;
            }
        }

        // vacia los elementos restantes de la pila
        while (!pila.estaVacia()) {
            sb.append(pila.pop()).append("\n");
        }
        // imprime todo el resultado acumulado
        System.out.print(sb);
    }
}