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
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(next());
        }

        Pila pila = new Pila();
        StringBuilder sb = new StringBuilder();
        int llamada = 0;   // índice de la siguiente duración
        int libreEn = 1;   // minuto en que la telefonista se desocupa

        for (int i = 1; i <= n; i++) {
            int telefono = Integer.parseInt(next());
            pila.push(telefono);
            if (i >= libreEn) {
                sb.append(pila.pop()).append("\n");
                libreEn = i + d[llamada];
                llamada++;
            }
        }

        while (!pila.estaVacia()) {
            sb.append(pila.pop()).append("\n");
        }
        System.out.print(sb);
    }
}