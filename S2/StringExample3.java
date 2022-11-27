import java.util.Scanner;

public class StringExample3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String mensaje; // Declaración

        // Instrucción para el usuario:
        System.out.print("\n\t Escribe un mensaje: ");
        mensaje = entrada.nextLine();

        // Imprimiendo el mensaje:
        System.out.print("\n\t Mensaje registrado: "+mensaje);

        // Imprimiendo la primera letra del mensaje capturado:
        // Podríamos obtener una exception si nos salimos del rango:
        System.out.print("\n\t La primera letra es: "+mensaje.charAt(0)); // Desde 0 a (longitud-1)
        // h o l a
        // 0 1 2 3

        // Concatenando dos cadenas:
        String mensaje_2=" Aquí va algo más...";
        System.out.printf("\n\t Mensaje concatenado: %s",mensaje.concat(mensaje_2));
        System.out.printf("\n\t Otra concatenación: %s %s",mensaje,mensaje_2); // Usando la interpolación

        entrada.close();

    }

}
