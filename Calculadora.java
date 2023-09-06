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
public class Calculadora {  
//atributos
     int a; 
     int b;
     int totals;
     int totalr;
     int totalm;
     
//metodo
     
    public void preguntar(){
        Scanner o =new Scanner(System.in);
     System.out.println("INGRESA UN PRIMER NUMERO: ");   
     a = o.nextInt();
   
    System.out.println("INGRESA UN SEGUNDO NUMERO: ");
     b = o.nextInt();
    
    }
   
    public void multiplicar (){
      totalm = a * b;
      System.out.println("La multiplicaion es" + totalm);
    }
    
      public void sumar (){
      totals = a + b;
      System.out.println("la suma es" + totals);
    }
    
    public void resta(){
    totalr = a - b;
        System.out.println("La resta es: "+totalr);
    }


    }  

