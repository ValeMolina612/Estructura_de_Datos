public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.agrega(3);
        pila.agrega(6);
        pila.agrega(9);
        System.out.println(pila.saca()); // 9
        System.out.println(pila.saca()); // 6
        System.out.println(pila.saca()); // 3
        System.out.println(pila.saca()); // -1
    }
}