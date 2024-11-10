package calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerOperaciones {
    private Scanner scanner;

    /* CONSTRUCTOR DE CLASE                   */
    public LeerOperaciones(){
        scanner = new Scanner(System.in);
    }

    public void calcular(int codOperacion) {
        switch (codOperacion) {
            case 1:     // SUMA
                OperacionesMat.operacionSuma(this);
                break;
            case 2:     // RESTA
                OperacionesMat.operacionResta(this);
                break;
            case 3:     // POTENCIA
                OperacionesMat.operacionPotencia(this);
                break;
            case 4:     //DIVISIÓN
                OperacionesMat.operacionDivision(this);
                break;
            case 5:     // FACTORIAL
                OperacionesMat.operacionFactorial(this);
                break;
            case 6:     // SALIR
                System.out.println("*** GRACIAS POR USAR LA CALCULADORA JAVA ***");
                break;
        }
    }

    /*******************************************************************************
     *  FUNCIÓN leerOperación: Muestra el menú principal y lee la opción por teclado
     * @return opcion: Devuelve un entero entre 1 y 6, según la operación
     */
    public int leerOperacion() {
        int opcion = 0;
        do try {
            System.out.println("*** CALCULADORA JAVA ***");
            System.out.println("Operaciones disponibles:");
            System.out.println("1. Suma de dos números");
            System.out.println("2. Resta de dos números");
            System.out.println("3. Potencia de dos números");
            System.out.println("4. División de dos números");
            System.out.println("5. Factorial de un número");
            System.out.println("6. SALIR DE LA CALCULADORA");
            System.out.print("Introduzca la opción (1-6): ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // sirve para prevenir errores en lecturas posteriores
            if (opcion <= 0 || opcion > 6) {
                System.out.println("*** ERROR *** La opción no es válida. Introduzca un número entre 1 y 6.");
                opcion = 0;
            }
        } catch (InputMismatchException e) {
            System.out.print("*** ERROR *** La opción no es válida. Introduzca un número entre 1 y 6 ");
            scanner.next();
        } while (opcion == 0);
        return (opcion);
    }

    /*******************************
     * FUNCIÓN leerOperandoAReal: Lee el operando A como un número real (double)
     * @return Devuelve un double con el operando
     */
    public double leerOperandoAReal() {
        double opA = 0;
        boolean lecturaOK = false;
        do try {
            System.out.print("Introduzca el valor para el operando A (número real): ");
            opA = scanner.nextDouble();
            scanner.nextLine();
            lecturaOK = true;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("*** ERROR *** El operando A debe ser un número real. Separe los decimales con ','. Vuelva a intentarlo.");
        } while(!lecturaOK);
        return opA;
    }

    /*******************************************************************
     * FUNCIÓN leerOperandoACardinal: Lee el operando A como un número cardinal {0, 1, 2...}
     * @return Devuelve un entero (int) con el operando que no será negativo
     */
    public int leerOperandoACardinal() {
        int opA = 0;
        boolean lecturaOK = false;
        do try {
            System.out.print("Introduzca el valor para el operando A (entero mayor que 0): ");
            opA = scanner.nextInt();
            scanner.nextLine();
            lecturaOK = opA != 0;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("*** ERROR *** El operando A debe ser un número entero mayor que 0. Vuelva a intentarlo.");
        } while(!lecturaOK);
        return opA;
    }

    /*******************************
     * FUNCIÓN leerOperandoBReal: Lee el operando B como un número real (double)
     * @return Devuelve un double con el operando
     */
    public double leerOperandoBReal() {
        double opB = 0;
        boolean lecturaOK = false;
        do try {
            System.out.print("Introduzca el valor para el operando B (número real): ");
            opB = scanner.nextDouble();
            scanner.nextLine();
            lecturaOK = true;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("*** ERROR *** El operando B debe ser un número real. Separe los decimales con ','. Vuelva a intentarlo.");
        } while(!lecturaOK);
        return opB;
    }

    /*******************************
     * FUNCIÓN leerOperandoBReal: Lee el operando B como un número real (double)
     * @return Devuelve un double con el operando
     */
    public double leerOperandoBRealNoCero() {
        double opB = 0;
        boolean lecturaOK = false;
        do try {
            System.out.print("Introduzca el valor para el operando B (real distinto a 0): ");
            opB = scanner.nextDouble();
            scanner.nextLine();
            lecturaOK = opB != 0;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("*** ERROR *** El operando B debe ser un número real distinto a 0. Separe los decimales con ','. Vuelva a intentarlo.");
        } while(!lecturaOK);
        return opB;
    }

    /*******************************************************************
     * FUNCIÓN leerOperandoBIntNoNegativo: Lee el operando B como un número entero no negativo
     * @return Devuelve un entero (int) con el operando
     */
    public int leerOperandoBIntNoNegativo() {
        int opB = 0;
        boolean lecturaOK = false;
        do try {
            System.out.print("Introduzca el valor para el operando B (número entero no negativo): ");
            opB = scanner.nextInt();
            scanner.nextLine();
            lecturaOK = opB >= 0;   // si el operador B es igual o mayor que 0 la lectura es correcta
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("*** ERROR *** El operando B debe ser un número entero no negativo. Vuelva a intentarlo.");
        } while(!lecturaOK);
        return opB;
    }


    public void vaciarBuffer() {
        scanner.nextLine();
    }

    public void cerrar() {
        scanner.close();
    }
}
