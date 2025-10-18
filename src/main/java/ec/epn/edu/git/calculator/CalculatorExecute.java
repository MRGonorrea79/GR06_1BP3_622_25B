package ec.epn.edu.git.calculator;

/**
 * Clase principal para ejecutar y demostrar las funcionalidades
 * de la clase Calculator.
 * 
 * Esta clase contiene el método main que instancia un objeto Calculator
 * y realiza operaciones aritméticas básicas, mostrando los resultados
 * por consola.
 * 
 * @author EPN
 * @version 1.0
 */
public class CalculatorExecute {
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * Crea una instancia de Calculator y ejecuta operaciones de:
     * - Suma de 4 + 7
     * - Resta de 4 - 7
     * - Multiplicación de 4 * 7
     * 
     * Los resultados se imprimen en la consola con formato descriptivo.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear instancia de la calculadora
        Calculator c = new Calculator();
        
        // Realizar suma y mostrar resultado
        int addition = c.addition(4,7);
        System.out.println("[+] Suma : "+addition);
        
        // Realizar resta y mostrar resultado
        int subtraction = c.subtration(4,7);
        System.out.println("[+] Resta : " + subtraction);
        
        // Realizar multiplicación y mostrar resultado
        int multiplication = c.multiplication(4,7);
        System.out.println("[+] Multiplicacion : " + multiplication);
    }
}
