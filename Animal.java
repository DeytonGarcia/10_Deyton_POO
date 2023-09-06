/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_deytongarciaa_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author deyto
 */
import javax.swing.JOptionPane;

public class Animal {
    String nombre;
    String raza;
    int edad;
    String color;

    public void preguntar() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre de su Perro: ");
        raza = JOptionPane.showInputDialog("Ingrese la raza de su Perro: ");
        String edadStr = JOptionPane.showInputDialog("Ingrese la edad de su Perro: ");
        edad = Integer.parseInt(edadStr);
        color = JOptionPane.showInputDialog("Ingrese el color del Perro: ");
    }

    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Nombre del Perro: " + nombre);
        JOptionPane.showMessageDialog(null, "Raza del Perro: " + raza);
        JOptionPane.showMessageDialog(null, "Edad del Perro: " + edad);
        JOptionPane.showMessageDialog(null, "Color del Perro: " + color);
    }

    
}
