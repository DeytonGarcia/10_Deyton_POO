/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_deytongarciaa_poo;

/**
 *
 * @author deyto
 */
import javax.swing.JOptionPane;

public class Autos {
    
//Atributos
    String modelo;
    String color;
    String kilometros;
   
//Metodos
    public void preguntar(){
    modelo = JOptionPane.showInputDialog("¿Qué modelo de auto es? ") ;
    color = JOptionPane.showInputDialog("¿Qué color tiene el auto? ") ;
    kilometros = JOptionPane.showInputDialog("¿Cuantos kilometros recorre el auto ? ") ;
    }
    
   public void responde(){
   JOptionPane.showMessageDialog(null,"El Auto es: " + modelo + " , recorre : "+ kilometros +"y es de color: " + color +".");
   }
}

