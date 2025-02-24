import java.util.Scanner; // Importamos la librería Scanner para leer datos del usuario
class MainR { // Clase principal para la resta
    public static void main(String[] args) { // Método principal
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner para leer entrada
        int op; // Variable para la opción del usuario
        do {
            System.out.println("Menu Resta\n1. Realizar resta\n2. Salir\nOpción: "); // Mostrar menú
            op = sc.nextInt(); // Leer opción
            switch (op) {
                case 1:
                    Resta r = new Resta(); // Crear objeto de la clase Resta
                    System.out.print("Ingresa el primer número: ");
                    r.setNum1(sc.nextInt()); // Leer y asignar el primer número
                    System.out.print("Ingresa el segundo número: ");
                    r.setNum2(sc.nextInt()); // Leer y asignar el segundo número
                    System.out.println("Resultado: " + r.restar()); // Mostrar resultado
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
