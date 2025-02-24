// Clase Suma
class Suma {
    private int num1, num2; // Variables privadas para encapsulación
    
    public Suma() {} // Constructor vacío
    
    public int getNum1() { 
        return num1; 
    } // Método para obtener num1
    
    public void setNum1(int num1) { 
        this.num1 = num1; 
    } // Método para asignar num1
    
    public int getNum2() { 
        return num2; 
    } // Método para obtener num2
    public void setNum2(int num2) { 
        this.num2 = num2; 
    } // Método para asignar num2
    
    public int sumar() { 
        return num1 + num2; 
    } // Método que realiza la suma
}