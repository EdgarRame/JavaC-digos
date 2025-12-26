package texto_a_color;

public class textocoloreado {
    static void main() {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[36m";

        System.out.println(naranja + "mandarina" + verde + " arbol");
        System.out.println(naranja + "saltamonetes" + rojo + " tomate");
        System.out.println(blanco + "sábanas" + azul + " cielo");
        System.out.println(morado + "nazareno" + azul + " mar");
    }
}
