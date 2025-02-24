// Clase Resta
class Resta { // Define la clase Resta
    int num1, num2; // Variables para los números
    
    Resta() {
    } // Constructor vacío
    
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
    
    public int restar() { 
        return num1 - num2; 
    } // Método para realizar la resta
}
