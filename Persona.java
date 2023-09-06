/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_deytongarciaa_poo;

import java.util.Scanner;

/**
 *
 * @author deyto
 */
public class Persona {
  String nombre;
    int edad;

    public void pedirDatos() {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = scanner.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        edad = scanner.nextInt();
        
        scanner.close();
    }



    
}
