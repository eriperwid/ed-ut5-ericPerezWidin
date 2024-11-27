package calculadora;

public class OperacionesMat {
    /*************************
     * FUNCIÓN operacionSuma() - Solicita los operandos como números reales y realiza la operación SUMA
     */
    public static void operacionSuma(LeerOperaciones leer) {
        double operadorA, operadorB, resultado;
        System.out.println("*** SUMA DE OPERANDOS: A + B ***");
        operadorA = leer.leerOperandoAReal();
        operadorB = leer.leerOperandoBReal();
        resultado = operadorA + operadorB;
        System.out.println("El resultado de la suma entre " + operadorA + " y " + operadorB + " es: " + resultado);
    }

    /*******************************
     * FUNCIÓN operacionResta() - Solicita los operandos como números reales y realiza la operación RESTA
     */
    public static void operacionResta(LeerOperaciones leer) {
        double operadorA, operadorB, resultado;
        System.out.println("*** RESTA DE OPERANDOS: A - B ***");
        operadorA = leer.leerOperandoAReal();
        operadorB = leer.leerOperandoBReal();
        resultado = operadorA - operadorB;
        System.out.println("El resultado de la resta entre " + operadorA + " y " + operadorB + " es: " + resultado);
    }

    /*******************************
     * FUNCIÓN operacionPotencia() - Solicita los operandos como números reales  y raeliza la operación POTENCIA
     */
    public static void operacionPotencia(LeerOperaciones leer) {
        double operadorA, operadorB, resultado = 1;
        System.out.println("*** POTENCIA DE OPERANDOS: A^B ***");
        operadorA = leer.leerOperandoAReal();
        operadorB = leer.leerOperandoBIntNoNegativo();
        // resultado = Math.pow(operadorA, operadorB); aunque existe este procedimiento en la biblioteca Math, realizaremos la operación de forma iterativa
        for (int i = 1; i <= operadorB; i++) {
            resultado = resultado * operadorA; // multiplicamos el operador A las veces que indica el operador B
        }
        System.out.println("El resultado de la potencia de la base " + operadorA + " y el exponente " + operadorB + " es: " + resultado);
    }

    /*******************************
     * FUNCIÓN operacionDivision() - Solicita los operandos como números reales (divisor no puede ser 0) y realiza la operación DIVISIÓN
     */
    public static void operacionDivision(LeerOperaciones leer) {
        double operadorA, operadorB, resultado;
        System.out.println("*** DIVISIÓN DE OPERANDOS: A/B ***");
        operadorA = leer.leerOperandoAReal();
        operadorB = leer.leerOperandoBRealNoCero();
        resultado = operadorA / operadorB;
        System.out.println("El resultado de la división del numerador " + operadorA + " y el divisor " + operadorB + " es: " + resultado);
    }

    /*******************************
     * FUNCIÓN operacionFactorial() - Solicita el operador como número cardinal (número positivo o 0) y realiza la operación FACTORIAL (recursivo)
     */
    public static void operacionFactorial(LeerOperaciones leer) {
        int operadorA;
        long resultado;
        System.out.println("*** FACTORIAL DE OPERANDO: A! ***");
        operadorA = leer.leerOperandoACardinal();
        resultado = factorial(operadorA);
        System.out.println("El resultado del factorial de " + operadorA + " es: " + resultado);
    }

    /**************************************
     * FUNCIÓN factorial(int) - Calcula de forma recursiva el factorial del parámetro entero
     * @param operando: Número del que se calcula el factorial
     * @return resultado: Número de tipo long con el resultado del valor del factorial de la entrada
     */
    private static long factorial(int operando) {
        long resultado;
        // caso base de la recursión
        if (operando == 0) {
            resultado = 1;
        } else {    // pasos dentro de la iteración: multiplicamos el número por el factorial del mismo reducido en una unidad
            resultado = operando * factorial(operando - 1);
        }
        return resultado;
    }

    /*******************************
     * FUNCIÓN raizCuadrada() - Solicita el operador y calcula la raiz cuadrada
     */
    public static void calcularRaizCuadrada(LeerOperaciones leer) {
        double operador;
        double resultado;
        System.out.println("*** RAIZ CUADRADA DE A ***");
        operador = leer.leerOperandoBRealNoNegativo();
        resultado = Math.sqrt(operador);
        System.out.println("El resultado del factorial de " + operador + " es: " + resultado);
    }
}
