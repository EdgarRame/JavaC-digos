package ejercicios_01;

public class ejercicio_05 {
    static void main() {
        //Variables(colores)
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String blanco = "\033[36m";
        //Parte principal del código
        System.out.println(azul + "             \t\t\t\t\t\t\t\t\t***\tHorario\t***");
        //Días
        System.out.println(rojo + "Materia       \t\t\tLunes\t\t\t\tMartes\t\t\t Miercoles\t\t\t Jueves\t\t\t Viernes");
        System.out.println(blanco + "Sistemas Programables\t 09:00-10:00\t\t09:00-10:00\t\t09:00-10:00\t\t09:00-10:00\t\t09:00-10:00\t\t09:00-10:00");
        System.out.println(naranja + "BD NoSQL\t\t\t     15:00-16:00\t\t15:00-16:00\t\t15:00-16:00\t\t15:00-16:00\t\t15:00-16:00");
        System.out.println(verde + "Int. Artificial\t\t     10:00-11:00\t\t10:00-11:00\t\t10:00-11:00\t\t10:00-11:00");
    }
}
