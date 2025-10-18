package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println("[+] Suma : "+addition);

        int subtraction = c.subtration(4,7);
        System.out.println("[+] Resta : " + subtraction);

        int multiplication = c.multiplication(4,7);
        System.out.println("[+] Multiplicacion : " + multiplication);
    }
}
