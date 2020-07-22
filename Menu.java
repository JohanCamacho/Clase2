package com.company;

import java.util.Scanner;

public class Menu {

    public static void MenuEmpleado(){

        try {
            Scanner scanner = new Scanner(System.in);
            int opc;

            do {
                System.out.println("");
                System.out.println("*** Menú Empleados ***");
                System.out.println("1. Agregar Empleado");
                System.out.println("2. Eliminar Empleado");
                System.out.println("3. Actualizar Empleado");
                System.out.println("4. Mostrar Empleados");
                System.out.println("5. SALIR");
                opc = scanner.nextInt();
                if (opc < 1 || opc > 5) {
                    System.out.println("Opción incorrecta, verifique el menu");
                }
            } while (opc < 1 || opc > 5);

            switch (opc) {
                case 1:
                    OperacionesMenu.Agregar();
                    break;

                case 2:
                    OperacionesMenu.Eliminar();
                    break;

                case 3:
                    OperacionesMenu.Actualizar();
                    break;

                case 4:
                    OperacionesMenu.Mostrar();
                    break;

                case 5:
                    System.out.println("!Has Finalizado¡");
                    System.exit(0);
            }

        }catch (Exception ex){
            System.out.println("Ese caracter no es correcto, verifique");
            MenuEmpleado();
        }
    }
}

