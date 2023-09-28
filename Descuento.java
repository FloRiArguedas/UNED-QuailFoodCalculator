/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2_Floricela;

/**
 *
 * @author Flory
 */
public class Descuento {
    //Atributo
    private int cantidad_huevos;

    //Método Constructor
    public Descuento() {
    }
   
    //Getter y Setter para el descuento

    public int getCantidad_huevos() {
        return cantidad_huevos;
    }

    public void setCantidad_huevos(int cantidad_huevos) {
        this.cantidad_huevos = cantidad_huevos;
    }
    
    //DECLARACIONES
    double monto_descuento;
    double descuento;
    
    //Funcion para aplicar el descuento
    
    public double calcular_descuento (double monto_total){
        
        if (cantidad_huevos >= 300){
            descuento= monto_total*0.20;
            monto_descuento = monto_total-descuento;
        }
        else if (cantidad_huevos >= 150){
            descuento= monto_total*0.10;
            monto_descuento = monto_total-descuento;
        }   
        else if (cantidad_huevos >= 75){
            descuento= monto_total*0.05;
            monto_descuento = monto_total-descuento;
        }   
         else if (cantidad_huevos < 75){
        }  

        return descuento;

  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
