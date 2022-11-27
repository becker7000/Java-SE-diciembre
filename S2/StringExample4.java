import java.util.Scanner;

public class StringExample4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final String pass = "pass1234"; // Declarando un String constante
        String pass_entrada;

        System.out.print("\n\t Escribe la constraseña: ");
        pass_entrada = entrada.nextLine();

        // Imprimiendo un valor booleano (TRUE o FALSE)
        // %b minusculas, %B mayusculas
        System.out.printf("\n\t La constraseña fué correcta: %B",pass_entrada.equals(pass));

        // Revisando si una cadena es vacía:
        System.out.printf("\n\t El campo de la constraseña está vacío: %B",pass_entrada.isEmpty());

        // Impriendo cuantas letras tienen la cadena de entrada:
        // System.out.print("\n\t La constraseña ingresada tiene "+pass_entrada.length()+" letras");
        System.out.printf("\n\t La constraseña igresada tiene %d letras",pass_entrada.length());

        entrada.close();

    }

}
