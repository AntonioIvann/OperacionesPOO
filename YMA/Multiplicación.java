class Multiplicacion { // Define la clase Multiplicacion
    int num1, num2; // Variables para los números
    
    Multiplicacion() {} // Constructor vacío
    
    public int getNum1() { 
        return num1;
     } // Obtener num1
    public void setNum1(int num1) { 
        this.num1 = num1; 
    } // Asignar num1
    
    public int getNum2() { 
        return num2; 
    } // Obtener num2
    public void setNum2(int num2) {
         this.num2 = num2; 
        } // Asignar num2
    
    public int multiplicar() {
         return num1 * num2; 
        } // Método para realizar la multiplicación
}