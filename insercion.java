//Molina Rosas Maria Valeria, Cisthoper Grardo Villanueva Ramirez
// 09-Noviembre-2026
//codigo de insercion implementado en java


import java.util.Random;

public class Insercion {
    public static void main(String[] args) {
        int i, j, k, aux;
        int[] tarjetas = new int[5];
        Random rand = new Random();

        // Llenar el arreglo con números aleatorios del 1 al 100
        for (k = 0; k < tarjetas.length; k++) {
            tarjetas[k] = rand.nextInt(100) + 1;
        }

        // Ordenamiento por inserción
        for (i = 1; i < tarjetas.length; i++) {
            j = i;
            while (j > 0) {
                if (tarjetas[j - 1] > tarjetas[j]) {
                    aux = tarjetas[j];
                    tarjetas[j] = tarjetas[j - 1];
                    tarjetas[j - 1] = aux;
                    j = j - 1;
                } else {
                    j = 0;
                }
            }
        }

        // Mostrar el arreglo ordenado
        for (k = 0; k < tarjetas.length; k++) {
            System.out.println(tarjetas[k]);
        }
    }
}