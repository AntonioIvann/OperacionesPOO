import java.util.Scanner; // Importamos la librería Scanner para leer datos del usuario

public class MainS { // Clase principal para ejecutar la suma
    public static void main(String[] args) { // Método principal
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner para leer entrada
        int op; // Variable para almacenar la opción del usuario
        
        do {
            System.out.println("\nMenu Suma");
            System.out.println("1. Realizar suma");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt(); // Leer la opción del usuario
            
            if (op == 1) {
                Suma s = new Suma(); // Crear objeto de la clase Suma
                System.out.print("Ingresa el primer número: ");
                s.setNum1(sc.nextInt()); // Leer y asignar el primer número
                System.out.print("Ingresa el segundo número: ");
                s.setNum2(sc.nextInt()); // Leer y asignar el segundo número
                System.out.println("Resultado: " + s.sumar()); // Mostrar resultado
            }
        } while (op != 2); // Repetir hasta que el usuario elija salir
        
        sc.close(); // Cerrar Scanner
        System.out.println("Programa finalizado.");
    }
}
