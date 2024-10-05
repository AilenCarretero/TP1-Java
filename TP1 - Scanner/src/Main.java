import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void delay() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        //Generamos un menú principal.
        while(!exit) {
            System.out.println(" ====== Menú Principal ====== " +
                    "\n" +
                    "\n1.   Saludo personalizado." +
                    "\n2.   Calculadora básica." +
                    "\n3.   ¿Es mayor que... ?" +
                    "\n4.   ¿Es divisible por 2?" +
                    "\n5.   Calculadora del IVA." +
                    "\n6.   Contador creciente v1.0." +
                    "\n7.   Contador creciente v2.0." +
                    "\n8.   Divisible por 2 y 3." +
                    "\n9.   ¿Es mayor o igual a 0?" +
                    "\n10.  Adivina la contraseña." +
                    "\n11.  Día de la semana." +
                    "\n12.  ¿Es un número primo?" +
                    "\n13.  Adivina el número." +
                    "\n" +
                    "\n0.   Salir");

            int opcion = sc.nextInt();
            System.out.println("");

            switch(opcion) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    Logica.opcion1();
                    break;
                case 2:
                    Logica.opcion2();
                    break;
                case 3:
                    Logica.opcion3();
                    break;
                case 4:
                    Logica.opcion4();
                    break;
                case 5:
                    Logica.opcion5();
                    break;
                case 6:
                    Logica.opcion6();
                    break;
                case 7:
                    Logica.opcion7();
                    break;
                case 8:
                    Logica.opcion8();
                    break;
                case 9:
                    Logica.opcion9();
                    break;
                case 10:
                    Logica.opcion10();
                    break;
                case 11:
                    Logica.opcion11();
                    break;
                case 12:
                    Logica.opcion12();
                    break;
                case 13:
                    Logica.opcion13();
                    break;
                default:
                    System.out.println("El número ingresado no es válido, intente nuevamente.");
            }
        }
    }
}