
//Menú para elegir el programa:
import java.util.*;

public class Excepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EJERCICIOS ---");
            System.out.println("1. División segura");
            System.out.println("2. Convertidor de texto a número");
            System.out.println("3. Acceso a un array");
            System.out.println("4. Adivina el número");
            System.out.println("5. Longitud de un nombre");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    divisionSegura(sc);
                    break;
                case 2:
                    convertidor(sc);
                    break;
                case 3:
                    accesoArray(sc);
                    break;
                case 4:
                    adivinaNumero(sc);
                    break;
                case 5:
                    longitudNombre();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    //Ejercicio 1: División segura
    public static void divisionSegura(Scanner sc) {
        try {
            System.out.print("Introduce el dividendo: ");
            int a = sc.nextInt();
            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Introduce un número válido.");
            sc.nextLine(); // limpiar buffer en caso de fallo
        }
    }

    //Ejercicio 2: Convertidor de texto a número

    public static void convertidor(Scanner sc) {
        System.out.print("Escribe un número (en texto): ");
        String texto = sc.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + (numero * 10));
        } catch (NumberFormatException e) {
            System.out.println("Error: No es un número válido.");
        }
    }

    //Ejercicio 3: Acceso a un array

    public static void accesoArray(Scanner sc) {
        String[] frutas = {"Manzana", "Banana", "Naranja"};
        try {
            System.out.print("Introduce un número entre 0 y 2: ");
            int posicion = sc.nextInt();
            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Introduce un número válido.");
            sc.nextLine(); // limpiar buffer
        }
    }

    //Ejercicio 4: Adivina el número aleatorio

    public static void adivinaNumero(Scanner sc) {
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;
        System.out.print("Adivina el número (1-10): ");
        String intentoTexto = sc.nextLine();

        try {
            int intento = Integer.parseInt(intentoTexto);
            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Introduce un número válido.");
        } finally {
            System.out.println("Juego finalizado.");
        }
    }

    //Ejercicio 5: Longitud de un nombre

    public static void longitudNombre() {
        String nombre = null;
        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error: El nombre es null.");
        }
    }
}



