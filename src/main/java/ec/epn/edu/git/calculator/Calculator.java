package ec.epn.edu.git.calculator;

/**
 * Clase Calculator que proporciona operaciones aritméticas básicas
 * y funcionalidad para almacenar resultados.
 * 
 * @author EPN
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Variable para almacenar la respuesta de operaciones
     */
    private int answer;
    
    /**
     * Realiza la suma de dos números enteros.
     * 
     * @param a El primer sumando
     * @param b El segundo sumando
     * @return La suma de a + b
     */
    public int addition(int a, int b) {
        return a + b;
    }
    
    /**
     * Realiza la resta de dos números enteros.
     * 
     * @param a El minuendo (número al que se le resta)
     * @param b El sustraendo (número que se resta)
     * @return La diferencia de a - b
     */
    public int subtration(int a, int b) {
        return a - b;
    }
    
    /**
     * Realiza la multiplicación de dos números enteros.
     * 
     * @param a El primer factor
     * @param b El segundo factor
     * @return El producto de a * b
     */
    public int multiplication(int a, int b) {
        return a * b;
    }
    
    /**
     * Pausa la ejecución del programa durante un tiempo especificado.
     * 
     * @param time Tiempo de espera en milisegundos
     * @throws RuntimeException Si el hilo es interrumpido durante la espera
     */
    public void timeout(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Obtiene el valor almacenado en la variable answer.
     * 
     * @return El valor actual de answer
     */
    public int getAnswer() {
        return answer;
    }
    
    /**
     * Establece un nuevo valor para la variable answer.
     * 
     * @param answer El valor a almacenar
     */
    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
