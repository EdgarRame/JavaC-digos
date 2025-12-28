package ejercicios_02;

public class ejercicio_6 {
    static void main() {
        //Zona de variables
        int manzana = 5;
        int platano = 10;
        int papel = 50;
        double total = manzana+platano+papel;
        double iva = total*0.16;
        double total_iva = total+10.4;
        //Zona codigo
        System.out.println("El total sin iva es = " + total);
        System.out.println("El iva es = " + iva);
        System.out.println("El total con iva es = " + total_iva);
    }
}
