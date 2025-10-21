/**
 * La clase Calculadora proporciona métodos para realizar operaciones matemáticas básicas.
 * <p>
 * Ejemplo de uso:
 * <pre>
 *     Calculadora calc = new Calculadora();
 *     int resultado = calc.sumar(5, 3);
 * </pre>
 * </p>
 * 
 * @author Juan
 * @version 1.0
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     * 
     * @param a el primer número
     * @param b el segundo número
     * @return la suma de {@code a} y {@code b}
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param a el número del cual se resta
     * @param b el número que se resta
     * @return la resta de {@code a} menos {@code b}
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param a el primer número
     * @param b el segundo número
     * @return el producto de {@code a} y {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * 
     * @param a el dividendo
     * @param b el divisor
     * @return el resultado de la división
     * @throws ArithmeticException si {@code b} es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
