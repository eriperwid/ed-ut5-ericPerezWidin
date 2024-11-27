package calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraBasica {

    /**********************************************************************
     * ENTRADA PRINCIPAL AL PROGRAMA CALCULADORA
     * @param args NO UTILIZADOS EN ESTA PRÁCTICA LOS PARÁMETROS DE ENTRADA
     */
    public static void main(String[] args) {
        LeerOperaciones leer = new LeerOperaciones();

        int operacion;  // Almacena el tipo de operación (1-6)
        while ((operacion = leer.leerOperacion()) != 7) {         // Se hará la lectura de la operación y el cálculo mientras no sea 6 (salir)
            leer.calcular(operacion);
            System.out.print("Pulse ENTER para continuar...");
            leer.vaciarBuffer();
        }
        leer.cerrar();
    }
}