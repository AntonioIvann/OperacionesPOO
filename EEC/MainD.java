
import java.util.Scanner;//Importamos la libreria scanner

public class MainD {// Nombre de la clase

    public static void main(String[] args) {// Metodo main
        Scanner op = new Scanner(System.in);//Metodo scanner
        int pc;// Variable que almacena la opcion del usuario

        do {// Bucle do-while es para que el menu se repita hasta que el usuario decida salir
            // Mostramos el menu
            System.out.println("\n--- Menú ---");
            System.out.println("1. Realizar una division");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            pc = op.nextInt();// Leemos la eleccion al usuario

            switch (pc) {// Usamos un switch para las opciones
                case 1:
                    // Creamos un objeto de la clase Division
                    Division s1 = new Division();
                    System.out.print("Ingrese el primer número: ");// Le pedimos el primer dato o numero al usuario
                    s1.setNum1(op.nextInt());// Almacenamos su respuesta en la variable num1
                    System.out.print("Ingrese el segundo número: "); // Le pedimos un segundo dato o numero al usuario
                    s1.setNum2(op.nextInt());// Almacenamos su respuesta en la variable num2
                    System.out.println("El resultado de la division es: " + (s1.getNum1() / s1.getNum2()));// Imprime el resultado de la division
                    
                    break;// Termina el primer case
                case 2:
                    System.out.println("Saliendo del programa...");// Se imprime un mensje que esta saliendo de la division
                    break;// Termina el segundo case
                default:// El default es por si el usuario ingresa una opcion no valida y manda un mensaje de error
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (pc != 2);// Se repite el bucle hasta que el usuario decida salir

        op.close();// Se cierra el scanner para ahorrar mas recursos
    }
}
