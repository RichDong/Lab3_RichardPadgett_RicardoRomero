package lab3_richardpadgett_ricardoromero;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_RichardPadgett_RicardoRomero {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Tiendas");
        System.out.println("1.Comprar");
        System.out.println("2.Administrar");
        metodomenu();
    }

    public static void metodomenu() {
        ArrayList<Personas> p = new ArrayList();
        ArrayList<Locales> l = new ArrayList();
        
        int op1 = 0;
        int op2 = 0;
        while (op1 <= 5) {
            System.out.println("------Super Mercado------");
            System.out.println("1.Iniciar Sesion Clientes");
            System.out.println("2.Iniciar Sesion Empleado");
            System.out.println("3.Registrar Empleados");
            System.out.println("4.Registrarse como cliente");
            op1 = sc.nextInt();
            if (op1 == 1) {

            } else if (op1 == 2) {
                System.out.println("Ingrese su nombre de usuaro");
                String us = sc.next();
                System.out.println("ingrese su contra su password");
                String pass = sc.next();
                if (us == "Sociodelaempresa13" && pass == "XRL8") {

                    System.out.println("--Bienvenido--");
                    System.out.println("1.Crear Locales");
                    System.out.println("2.Administrar locales");
                    System.out.println("3.Crear Empleados");
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        System.out.println("Ingrese nombre del local: ");
                        String nombre = sc.next();
                        System.out.println("Ingrese el piso del local: ");
                        int piso = sc.nextInt();
                        l.add(new Locales(nombre, piso));
                        
                    } else if (op2 == 2) {
                        
                    } else if (op2 == 3) {
                        System.out.println("ingrese el nombre de usuario del Empleado");
                        String nom = sc.next();
                        System.out.println("ingrese la contrasena del empleado");
                        String contra = sc.next();
                        System.out.println("ingrese el correo del empleado");
                        String em = sc.next();
                        System.out.println("ingrese el nombre completo del usuario");
                        String nombrecom = sc.next();
                        System.out.println("ingrese la ID del empleado");
                        String id = sc.next();
                        System.out.println("ingrese la fecha de nacimiento del empleado");
                        String fechan = sc.next();
                        System.out.println("ingrese el horario de trabajo del empleado");
                        int horario = sc.nextInt();
                        p.add(new Empleados(horario, horario, us, pass, em, nombrecom, id, fechan));
                    }
                }
            } else if (op1 == 3) {

            } else if (op1 == 4) {

            }
        }

    }

}
