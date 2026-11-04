//maria valeria molina rosas
//01 de noviembre, 2026
//ejercicios pilas main

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
        // lee cuantos elementos tendra la pila
        int n = Integer.parseInt(next());
        Pila pila = new Pila();
        
        // llena la pila con los datos que recibe
        for (int i = 0; i < n; i++) {
            pila.push(next());
        }
        
        // lee el elemento que se quiere buscar
        String buscada = next();

        int sacados = 0;
        boolean encontrado = false;
        
        // saca elementos uno por uno hasta encontrar el buscado o vaciar la pila
        while (!pila.estaVacia() && !encontrado) {
            String placa = pila.pop();
            sacados++;
            if (placa.equals(buscada)) encontrado = true;
        }

        // imprime cuantos elementos se sacaron o si no existe
        if (encontrado) System.out.println(sacados);
        else System.out.println("no existe el auto");
    }
}