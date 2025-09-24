/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Nicolas Castaño
 */
public class Notas {
    private double valor;
    
    public Notas(double valor){
        this.valor = valor;
    
    }
    
    public boolean Aprobada (){
        return valor >= 3.0;
    
    }

}
    
