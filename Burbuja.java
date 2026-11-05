//Molina Rosas Maria Valeria
//11 de noviembre, 2026
// Ejercicio de ordenamiento 

// clase principal llamada burbuja
public class Burbuja {

    // metodo principal donde se ejecuta el programa
    public static void main(String[] args) {
        // se crea un arreglo de numeros enteros desordenados
        int[] arreglo = {6, 7, 3, 10, 17};
        // se guarda la cantidad total de elementos que tiene el arreglo
        int n = arreglo.length;

        // ciclo externo que controla el numero de pasadas para ordenar el arreglo
        for (int i = 0; i < n - 1; i++) {
            // ciclo interno que compara los numeros vecinos de dos en dos
            for (int j = 0; j < n - 1 - i; j++) {
                // si el numero actual es mayor que el que esta a su derecha
                if (arreglo[j] > arreglo[j + 1]) {
                    // se intercambian de lugar usando una variable auxiliar
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }

            // muestra en pantalla el numero de pasada actual
            System.out.print("Pasada " + (i + 1) + ": ");
            // recorre todo el arreglo para imprimir como va quedando despues de la pasada
            for (int j = 0; j < n; j++) {
                System.out.print(arreglo[j] + " ");
            }
            // salta a la siguiente linea
            System.out.println();
        }
    }
}