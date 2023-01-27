/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercito;

import soldado.Soldado;

/**
 *
 * @author alejandro
 */
public class Main {
    public static void main(String[] args) {
        
        Ejercito ejercito = new Ejercito();
        
        System.out.println("¿El ejército está vacio?: " + ejercito.ejercitoVacio());
        System.out.println("---------------------------------------------------------------------------------");
        
        ejercito.alistarSoldado(new Soldado("1234", "Antonio", "Antonillo", "Antonoso", 21));
        ejercito.alistarSoldado(new Soldado("5678", "Pepe", "Pepillo", "Peposo", 23));
        ejercito.alistarSoldado(new Soldado("9123", "Carlos", "Carlitos", "Carlillos", 23));    
        ejercito.alistarSoldado(new Soldado("4567", "Miguel", "Primo", "Rivera", 25));
        ejercito.alistarSoldado(new Soldado("8912", "Pedro", "Pedrillo", "Pedroso", 27));
        ejercito.alistarSoldado(new Soldado("8912", "Pedro", "Pedrillo", "Pedroso", 27));
        
        for (Soldado soldado : ejercito.sacarSoldados()) {
            System.out.println(soldado);
        }
        
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("¿El ejército está vacio?: " + ejercito.ejercitoVacio());
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("Hay " + ejercito.numeroSoldados() + " soldados");
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("Desmatricular a un soldado");
        System.out.println("En este caso a Antonio");
        ejercito.desmatricularSoldado(new Soldado("1234", "Antonio", "Antonillo", "Antonoso", 21));
        
        for (Soldado soldado : ejercito.sacarSoldados()) {
            System.out.println(soldado);
        }
    }
}
