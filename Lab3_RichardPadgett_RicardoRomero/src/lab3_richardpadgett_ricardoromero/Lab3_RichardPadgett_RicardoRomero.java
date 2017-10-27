package lab3_richardpadgett_ricardoromero;

import java.util.Scanner;

public class Lab3_RichardPadgett_RicardoRomero {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op1 = 0;
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
                if (us == "Sociodelaempresa13"&&pass == "XRL8") {
                    System.out.println("--Bienvenido--");
                    System.out.println("");
                }
            } else if (op1 == 3) {
                
            } else if (op1 == 4) {
                
            }
        }
    }
}
