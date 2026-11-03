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
        int t = Integer.parseInt(next());
        Pila pila = new Pila();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int p = Integer.parseInt(next());
            if (p == 1) {
                pila.push(Integer.parseInt(next()));
            } else if (p == 2) {
                pila.pop();
            } else if (p == 3) {
                if (pila.estaVacia()) sb.append("Empty!\n");
                else sb.append(pila.top()).append("\n");
            }
        }
        System.out.print(sb);
    }
}