import java.util.Scanner;

public class StringExample2 {

    public static void main(String[] args) {

        // Entradas:
        Scanner entrada = new Scanner(System.in);
        String nombre; // Declaración

        //Instrucciones para el usuario:
        System.out.print("\n\t Escribe tu nombre: ");
        nombre = entrada.nextLine();  // Intelli sense

        // Salida:
        System.out.print("\n\t Nombre registrado: "+nombre);
        entrada.close();

    }

}
