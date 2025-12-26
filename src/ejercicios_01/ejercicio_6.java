package ejercicios_01;

public class ejercicio_6 {
    static void main() {
        //Piramides de asteriscos
        //Variables
        int numeroLimite = 5;

        for (int altura = 1; altura < 6; altura++) {
            //Espacios en blanco
            for (int blanco = 1; blanco < numeroLimite - altura; blanco++) {
                System.out.print(" ");
            }
            //Impresión de asteriscos
            for (int asteriscos = 1; asteriscos <=(altura*2)-1 ; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
