import java.util.Scanner; //Importamos la libreria scanner

class MainR { // Nombre de la clase
    public static void main(String[] args) { // Metodo principal
        // Creamos un objeto Scanner
        Scanner sc = new Scanner(System.in);
        // Variable que almacena la opcion del usuario
        int op;
        // Bucle do-while para que el menu se repita hasta que el usuario decida salir
        do {
            // Mostramos el menu
            System.out.println("Menu");
            System.out.println("-------------------");
            System.out.println("Elige una opcion:");
            System.out.println("1. Realizar resta");
            System.out.println("2. Salir");
            System.out.print("Opcion: ");
            // Leemos la opcion del usuario
            op = sc.nextInt();
            // Usamos un switch para las opciones
            switch (op) {
                case 1:
                    // Creamos un objeto de la clase Suma
                    Resta re = new Resta();
                    // Le pedimos el primer numero al usuario
                    System.out.print("Ingresa el primer numero: ");
                    // Almacenamos su respuesta
                    re.setNum1(sc.nextInt());
                    // Le pedimos un segundo numero al usuario
                    System.out.print("Ingresa el segundo numero: ");
                    // Almacenamos su respuesta
                    re.setNum2(sc.nextInt());
                    // Imprimimos el resultado de la suma
                    System.out.println("El resultado de la resta es: " + (re.getNum1() - re.getNum2()));
                    System.out.println("---------------------------------");
                    // Termina el primer case
                    break;

                case 2:
                    // Se imprime un mensje de despedida
                    System.out.println("Hasta luego :)");
                    // Termina el segundo case
                    break;

                default:
                    // Default por si el usuario ingresa una opcion no valida
                    System.out.println("Ingresa una opcion valida.");
            }

        // Se repite el bucle hasta que el usuario decida salir
        } while (op != 2);
        // Se cierra el scanner para ahorrar recursos
        sc.close();

    }

}