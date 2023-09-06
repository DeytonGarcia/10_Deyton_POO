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
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.pedirDatos();

        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);

        //Ejercicio Calculadora
        Calculadora calculadora = new Calculadora();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.resta();
        calculadora.multiplicar();

        //Ejercicio Animal
        Animal perro = new Animal();
        perro.preguntar();
        perro.mostrarInfo();

        //Ejercicio Autos
        Autos auto = new Autos();
        auto.preguntar();
        auto.responde();

    }
}
