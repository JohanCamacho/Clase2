package com.company;

import javafx.scene.control.MenuButton;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class OperacionesMenu {

   static List<Empleado> ListEmpleado= new LinkedList<>();

   private static boolean validarId(int id){

       for (Empleado empleado: ListEmpleado) {

           if (empleado.getId() == id) {
               return true;
           }
       }
       return false;

   }

    public static void Agregar() {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese ID del empleado");

        int id = Integer.parseInt(scanner.nextLine());

       if (validarId(id)){ System.out.println("Ya Existe");
       }
       else {

           try { System.out.println("Ingrese Nombre del Empleado");
               String Nombre= scanner.nextLine();
               System.out.println("Ingrese Apellido del Empleado");
               String Apellido=scanner.nextLine();
               System.out.println("Ingrese Salario del Empleado");
               int Salario = scanner.nextInt();

               ListEmpleado.add(new Empleado(id, Nombre, Apellido, Salario));

           }catch (NumberFormatException ex){
               System.out.println("Tipo de dato no adminitido");
               Agregar();
           }
       }
       Menu.MenuEmpleado();
    }

    public static void Eliminar(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese el id del empleado que va a eliminar");
       int idEmpleado = Integer.parseInt(scanner.nextLine());
       if(validarId(idEmpleado)){
           for(Empleado empleado : ListEmpleado){
               if(empleado.getId() == idEmpleado){
                   ListEmpleado.remove(empleado);
                   System.out.println("Se ha elimiado exitosamente el empleado con el id: "+idEmpleado);
               }
           }
       }else{
           System.out.println("Verifique el id, no existe ningun empleado con el id: "+idEmpleado);
           Eliminar();
       }
        Menu.MenuEmpleado();
    }


    public static void Actualizar(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id del empleado que va a actualizar");
        int idEmpleado = Integer.parseInt(scanner.nextLine());
        if(validarId(idEmpleado)){
            for (Empleado empleado : ListEmpleado){
                if(empleado.getId() == idEmpleado){
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese e apellido del empleado");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingrese el salario del empleado");
                    int salario = scanner.nextInt();
                    empleado.setNombre(nombre);
                    empleado.setApellido(apellido);
                    empleado.setSalario(salario);

                    System.out.println("El empleado con el id: "+idEmpleado+" se ha actualizado exitosamente");
                    System.out.println(ListEmpleado);
                }
            }
        }else{
            System.out.println("No existe ningun empelado con el id: "+idEmpleado);
            Actualizar();
        }
        Menu.MenuEmpleado();
    }


    public static void Mostrar(){
       for(Empleado empleado : ListEmpleado){
           System.out.println(empleado);
       }
       Menu.MenuEmpleado();
    }
}
