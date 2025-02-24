import java.util.Scanner; // Importamos la librería Scanner para leer datos del usuario
class MainM { // Clase principal para la multiplicación
    public static void main(String[] args) { // Método principal
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner para leer entrada
        int op; // Variable para la opción del usuario
        do {
            System.out.println("Menu Multiplicación\n1. Realizar multiplicación\n2. Salir\nOpción: "); // Mostrar menú
            op = sc.nextInt(); // Leer opción
            switch (op) {
                case 1:
                    Multiplicacion m = new Multiplicacion(); // Crear objeto de la clase Multiplicacion
                    System.out.print("Ingresa el primer número: ");
                    m.setNum1(sc.nextInt()); // Leer y asignar el primer número
                    System.out.print("Ingresa el segundo número: ");
                    m.setNum2(sc.nextInt()); // Leer y asignar el segundo número
                    System.out.println("Resultado: " + m.multiplicar()); // Mostrar resultado
                    break;
                case 2:
                    System.out.println("Adios"); // Mensaje de salida
                    break;
                default:
                    System.out.println("Opción no válida."); // Mensaje de error
            }
        } while (op != 2); // Repetir hasta que el usuario elija salir
        sc.close(); // Cerrar Scanner
    }
}
