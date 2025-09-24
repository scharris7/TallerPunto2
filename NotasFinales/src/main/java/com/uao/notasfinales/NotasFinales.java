/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.notasfinales;
import Modelo.Notas;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolas Castaño
 */
public class NotasFinales {
    private Notas[] notas;
    
    public void recorrerNotas() {
 
        notas = new Notas[5];
        for (int i = 0; i < 5; i++) {
            var Nota = JOptionPane.showInputDialog("Ingrese la nota " + (i + 1) + ": ");
            double valor = Double.parseDouble(Nota);
            notas[i] = new Notas(valor);
    
    }
    }
    
    public int contadorNotas() {
        int contador = 0;
        for (Notas n : notas) {
            if (n.Aprobada()) {
                contador++;
            }
        }
        return contador;
    }
     
    public void mostrarResultado() {
        int aprobadas = contadorNotas();
        JOptionPane.showMessageDialog(null, "La cantidad de notas mayores a 3.0 son: " + aprobadas);
    }
    
    public static void main(String[] args) {
        NotasFinales resultado = new NotasFinales();
        resultado.recorrerNotas();
        resultado.mostrarResultado();
    }
   
}




