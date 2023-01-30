/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercito;

import soldado.Soldado;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author alejandro
 */
public class Ejercito {
    
    private Set<Soldado> soldados;

    public Ejercito() {
        this.soldados = new HashSet<>();
    }
    
    public int numeroSoldados(){
        return this.soldados.size();
    }
    
    public void alistarSoldado(Soldado soldado){
         this.soldados.add(soldado);
    }
    
    public boolean ejercitoVacio(){
        return this.soldados.isEmpty();
    }
    
    public boolean estaEnEjercito(Soldado soldado){
        for (Soldado aux : soldados) {
            if (soldado.equals(aux)) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Soldado> sacarSoldados(){
        ArrayList<Soldado> lista = new ArrayList<>(this.soldados);
        return lista;
    }
    
    public void desmatricularSoldado(Soldado soldado){
            this.soldados.remove(soldado);
    }
    
    public void motrarEjercitoUno(){
        //Internamente está usando un objeto de tipo Iterator
        for (Soldado soldado : soldados) {
            System.out.println(soldado);
        }
    }
    
    public void motrarEjercitoDos(){
        Iterator<Soldado> iterador = soldados.iterator();
        Soldado aux;
        
        while (iterador.hasNext()) {            
            aux = iterador.next();
            System.out.println(aux);
        }
    }
}
