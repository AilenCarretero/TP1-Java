import java.util.Scanner;

public class Logica {
    private static boolean regresarMenu() {
        //Creamos un método para invocar la salida al menú principal.
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "\n¿Desea regresar al menú principal?" +
                "\n* Sí" +
                "\n* No");
        String rta = sc.nextLine();
        System.out.println("");
        Main.delay();
        return rta.equalsIgnoreCase("si");
    }


    public static void opcion1() {
        //Punto 1 y 2
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos el nombre al usuario.
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            //Imprimimos el mensaje personalizado.
            System.out.println("¡Bienvenid@ " + nombre + "!");

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion2() {
        //Punto 3
        Scanner sc = new Scanner(System.in);
        boolean esc = false;


        while (!esc) {
            //Imprimimos un mensaje de bienvenida y solicitamos al usuario dos números.
            System.out.println(" ==== CALCULADORA ==== " +
                    "\n" +
                    "\nIngrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            //Solicitamos al usuario la operación matemáica que desee hacer.
            System.out.println("" +
                    "\nSeleccione la operación que desea realizar: " +
                    "\n1. Adición" +
                    "\n2. Sustración" +
                    "\n3. Multiplicación" +
                    "\n4. División");
            int oper = sc.nextInt();

            //Realizamos las operaciones.
            switch (oper) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    //En el caso de las divisiones comprobamos que el divisor sea distinto de 0.
                    while (num2 == 0) {
                        System.out.println("No es posible dividir por 0, intente nuevamente.");
                        num2 = sc.nextInt();
                    }

                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, intente nuevamente.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion3() {
        //Punto 4
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario el ingreso de dos números.
            System.out.println("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            //Realizamos la comprobación para saber cual número es mayor o si son iguales.
            if (num1 == num2) {
                System.out.println("Los números son iguales.");
            } else if (num1 > num2) {
                System.out.println("El número " + num1 + " es mayor.");
            } else {
                System.out.println("El número " + num2 + " es mayor.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion4() {
        //Punto 5
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario el ingreso de un número.
            System.out.println("Ingrese un número: ");
            int num = sc.nextInt();

            //Comprobamos que sea divisible por 2.
            if (num % 2 == 0) {
                System.out.println("El número " + num + " es divisible por 2.");
            } else {
                System.out.println("El número " + num + " no es divisible por 2.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion5() {
        //Punto 6
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario el ingreso del valor.
            System.out.println("Ingrese el valor del producto: ");
            float num = sc.nextInt();

            //Calculamos el IVA.
            float iva = num * 21 / 100;

            //Imprimimos el resultado.
            System.out.println("El valor del producto con el IVA es $" + (num + iva));

            //Invocamos al metodo de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion6() {
        //Punto 7
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            System.out.println("Iniciando el contador 'While'... ");
            int i = 1;

            //Iniciamos el contador.
            while (i < 101) {
                System.out.println(i);
                i++;

                //Generamos un pequeño retraso de 0.1 segundo.
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion7() {
        //Punto 8
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            System.out.println("Iniciando el contador 'For'... ");

            //Iniciamos el contador.
            for (int i = 1; i < 101; i++) {
                System.out.println(i);

                //Generamos un pequeño retraso de 0.1 segundo.
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion8() {
        //Punto 9
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            System.out.println("Comprobando los números divisibles entre 1 y 100... ");

            //Iniciamos el contador.
            for (int i = 1; i < 101; i++) {

                //Comprobamos si el número es divisible por 2 y 3 y lo imprimimos.
                if (i % 2 == 0 && i % 3 == 0) {
                    System.out.println(i);
                };

                //Generamos un pequeño retraso de 0.1 segundo.
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion9() {
        //Punto 10
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            int num;
            do {
                //Solicitamos al usuario el ingreso de un número mayor o igual a 0.
                System.out.println("Ingrese un número mayor o igual a 0: ");
                num = sc.nextInt();
            } while (num < 0);

            //Imprimos el mensaje correspondiente por pantalla.
            if (num > 0) {
                System.out.println("EL número ingresado " + num + " es mayor que 0.");
            } else {
                System.out.println("El número ingresado es 0.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion10() {
        //Punto 11
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Definimos la cantidad de intentos y la contraseña.
            int intentos = 3;
            String contra = "404NotFound";
            String contra2 = "";

            while (intentos != 0) {
                //Le solicitamos al usuario que ingrese la contraseña.
                System.out.println("Ingrese la contraseña: ");
                contra2 = sc.nextLine();

                //Imprimimos el mensaje correspondiente según sea el caso.
                if (contra2.equals(contra)) {
                    System.out.println("Acceso Correcto");
                    break;
                } else {
                    intentos--;
                    System.out.println("Contraseña incorrecta, le quedan " + intentos + " intentos." );
                }
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion11() {
        //Punto 12
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario el ingreso de un dia de la semana.
            System.out.println(" ==== SEMANA ====" +
                    "\n" +
                    "\nSeleccione un día de la semana." +
                    "\n1.   Lunes" +
                    "\n2.   Martes" +
                    "\n3.   Miércoles" +
                    "\n4.   Jueves" +
                    "\n5.   Viernes" +
                    "\n6.   Sábado" +
                    "\n7.   Domingo");
            int dia = sc.nextInt();

            //Comprobamos si el día seleccionado es un día laborable o no.
            switch (dia) {
                case 1:
                    System.out.println("El día lunes es un día laborable.");
                    break;
                case 2:
                    System.out.println("El día martes es un día laborable.");
                    break;
                case 3:
                    System.out.println("El día miércoles es un día laborable.");
                    break;
                case 4:
                    System.out.println("El día jueves es un día laborable.");
                    break;
                case 5:
                    System.out.println("El día viernes es un día laborable.");
                    break;
                case 6:
                    System.out.println("El día sábado no es un día laborable.");
                    break;
                case 7:
                    System.out.println("El día domingo no es un día laborable.");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion12() {
        //Punto 13
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Solicitamos al usuario el ingreso de un número.
            System.out.println("Ingrese un número: ");
            int num = sc.nextInt();
            int div = 0;
            int i = 1;

            //Comprobamos si el número tiene más de dos divisores.
            while (i <= num) {
                if (num % i == 0) {
                    div++;
                    if (div > 2) {
                        break;
                    }
                }
                i++;
            }

            //Imprimimos el mensaje correspondiente según sea el caso.
            if (div > 2 || num == 1) {
                System.out.println("El número ingresado no es primo.");
            } else {
                System.out.println("El número ingresado es primo.");
            }

            //Invocamos al método de salida.
            esc = regresarMenu();
        }
    }

    public static void opcion13() {
        //Punto 14
        Scanner sc = new Scanner(System.in);
        boolean esc = false;

        while (!esc) {
            //Generamos un número aleatorio entre 1 y 100.
            int numSecreto = (int) (Math.random() * 101);
            int num = 0;
            int intentos = 0;

            //Solicitamos al usuario que ingrese un número
            System.out.println("Ingrese un numero entre 0 y 100: ");

            while (numSecreto != num) {
                num = sc.nextInt();
                intentos++;

                //Generamos mensajes para informarle al usuario si ha adivinado el número o está cerca.
                if (num < numSecreto) {
                    System.out.println("El número " + num + " es menor que el número secreto.");
                } else if (num > numSecreto) {
                    System.out.println("El número " + num + " es mayor que el número secreto.");
                } else {
                    System.out.println("Enhorabuena, has adivinado el número." +
                            "\nHas adivinado el número en " + intentos + " intentos.");
                }
            }

            //Invocamos el método de salida.
            esc = regresarMenu();
        }
    }
}