/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercitoOrdenado;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
import soldado.Soldado;

/**
 *
 * @author alejandro
 */
public class EjercitoOrdenado{
    
    private SortedSet<Soldado> ejercito;

    public EjercitoOrdenado() {
        this.ejercito = new TreeSet<>();
    }

   public int numeroSoldados(){
       return this.ejercito.size();
   }
    
   public void alistarSoldado(Soldado soldado){
       this.ejercito.add(soldado);
   }
   
   public boolean ejercitoVacio(){
       return this.ejercito.isEmpty();
   }
   
   public boolean estaEnEjercito(Soldado soldado){
       for (Soldado aux : ejercito) {
           if (soldado.equals(aux)) {
               return true;
           }
       }
       return false;
   }
   
   public ArrayList<Soldado> arraySoldados(){
       ArrayList<Soldado> lista = new ArrayList<>(this.ejercito);
       return lista;
   }
   
   public void desmatricularSoldado(Soldado soldado){
       this.ejercito.remove(soldado);
   }
}
