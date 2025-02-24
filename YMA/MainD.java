import java.util.Scanner; // Importamos la librería Scanner para leer datos del usuario
class MainD { // Clase principal para la división
    public static void main(String[] args) { // Método principal
        Scanner sc = new Scanner(System.in); // Crear objeto Scanner para leer entrada
        int op; // Variable para la opción del usuario
        do {
            System.out.println("Menu División\n1. Realizar división\n2. Salir\nOpción: "); // Mostrar menú
            op = sc.nextInt(); // Leer opción
            switch (op) {
                case 1:
                    Division d = new Division(); // Crear objeto de la clase División
                    System.out.print("Ingresa el primer número: ");
                    d.setNum1(sc.nextInt()); // Leer y asignar el primer número
                    System.out.print("Ingresa el segundo número: ");
                    d.setNum2(sc.nextInt()); // Leer y asignar el segundo número
                    System.out.println("Resultado: " + d.dividir()); // Mostrar resultado
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
