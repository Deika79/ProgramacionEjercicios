
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

    public static void longitudNombre() {
        String nombre = null;
        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error: El nombre es null.");
        }
    }
}






//Ejercicio 1: División segura

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
            System.out.println("Error: Debes introducir números enteros.");
        } finally {
            sc.close();
            System.out.println("Fin del programa.");
        }
    }
}

// Ejercicio 2 Convertidor de texto a número
import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número (en texto): ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número x 10: " + (numero * 10));
        } catch (NumberFormatException e) {
            System.out.println("Error: No se puede convertir el texto a número.");
        } finally {
            sc.close();
        }
    }
}

//Ejercicio 3: Acceso a un array

import java.util.Scanner;

public class ArrayAcceso {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Banana", "Naranja"};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entre 0 y 2: ");
            int posicion = sc.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera del rango permitido.");
        } finally {
            sc.close();
        }
    }
}

//Ejercicio 4: Adivina el número aleatorio

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int secreto = random.nextInt(10) + 1;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Adivina el número (1-10): ");
            String intentoTexto = sc.nextLine();

            int intento = Integer.parseInt(intentoTexto);

            if (intento == secreto) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Incorrecto. El número era: " + secreto);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            System.out.println("Juego finalizado.");
            sc.close();
        }
    }
}

//Ejercicio 5: Longitud de un nombre

public class LongitudNombre {
    public static void main(String[] args) {
        String nombre = null;

        try {
            System.out.println("La longitud del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.out.println("Error: El nombre no puede ser null.");
        }
    }
}

