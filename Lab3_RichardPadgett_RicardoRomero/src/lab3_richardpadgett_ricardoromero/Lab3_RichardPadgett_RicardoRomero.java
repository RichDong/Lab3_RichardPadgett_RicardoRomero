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

        ArrayList<Productos> pro = new ArrayList();

        ArrayList<Locales> l = new ArrayList();

        int op1 = 0;
        int op2 = 0;
        int op3 = 0;
        while (op1 <= 5) {
            System.out.println("------Super Mercado------");
            System.out.println("1.Iniciar Sesion Clientes");
            System.out.println("2.Iniciar Sesion Empleado");
            System.out.println("3.Registrarse como cliente");
            op1 = sc.nextInt();
            //menu principal
            if (op1 == 1) {

                System.out.println("ingrese su nombre de usuario");
                System.out.println("ingrese su contra sena");

            } else if (op1 == 2) {
                System.out.println("Ingrese su nombre de usuaro");
                String us = sc.next();
                System.out.println("ingrese su contra su password");
                String pass = sc.next();
                if (us == "Sociodelaempresa13" && pass == "XRL8") {

                    //menu de socio
                    System.out.println("--Bienvenido--");
                    System.out.println("1.Crear Locales");
                    System.out.println("2.Administrar locales");
                    System.out.println("3.Crear Empleados");
                    System.out.println("4.Crear Productos");
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

                    } else if (op2 == 4) {
                        System.out.println("ingrese el precio del producto");
                        int precio = sc.nextInt();
                        System.out.println("ingrese una descripcion del producto");
                        String descrip = sc.next();
                        System.out.println("ingrese el descuento del producto");
                        int descu = sc.nextInt();
                        System.out.println("ingrese el tipo de producto que quiere crear");
                        System.out.println("1.Ropa");
                        System.out.println("2.Jueguetes");
                        System.out.println("3.comida");
                        if (op3 == 1) {
                            System.out.println("ingrese la talla");
                            String talla = sc.next();
                            System.out.println("ingrese si es de hombre o mujer");
                            String sexp = sc.next();
                            pro.add(new Ropa(talla, precio, descrip, talla, descu));
                        } else if (op3 == 2) {

                        } else if (op3 == 3) {

                        }

                    }
                    //fin del menu de socio
                } else if (op1 == 3) {

                } else if (op1 == 4) {

                }
            }
        }
    }
}
