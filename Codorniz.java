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
public class Codorniz {
    //Atributos de la clase codorniz
    private int cantidad;
    
    //Constructor de la clase
    public Codorniz() {
    }
    
    //Creacion de getter y setter para los atributos de la clase

    public int getCantidad() {
        return cantidad;
    }

 
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
     //DECLARACIONES

    private int calculo_sacos;
    private int cant_sacos;
    public int monto_total_sacos;
    public static String [] informacion = new String [2]; //Arreglo para mostrar la informacion en Jtable. 
  
     //Función para hacer el cálculo de los sacos para los polluelos
    
    public double calcular_sacos_polluelos (){
    calculo_sacos= this.cantidad%1000; //Extraigo el residuo de la división con módulo
    cant_sacos = this.cantidad/1000; // Obtengo la división para obtener la cantidad de sacos
    if (calculo_sacos != 0){ //Condiciono que si el número es impar me aumente un saco.
        cant_sacos++;
    }
    monto_total_sacos= cant_sacos*5840; //Calculo el precio total según cantidad de sacos.
    return monto_total_sacos;
    }
    
    //Función para hacer el cálculo de los sacos para las codornices jóvenes
    
    public double calcular_sacos_jovenes (){
    calculo_sacos= this.cantidad%800; //Extraigo el residuo de la división con módulo
    cant_sacos = this.cantidad/800; // Obtengo la división para obtener la cantidad de sacos
    if (calculo_sacos != 0){ //Condiciono que si el número es impar me aumente un saco.
        cant_sacos++;
    }
    monto_total_sacos= cant_sacos*8045; //calculo el precio de los sacos según precio unitario.
    return monto_total_sacos;
}
    
    //Función para hacer el cálculo de los sacos para las codornices adultas
    
    public double calcular_sacos_adultos (){
    calculo_sacos= this.cantidad%500; //Extraigo el residuo de la división con módulo
    cant_sacos = this.cantidad/500; // Obtengo la división para obtener la cantidad de sacos
    if (calculo_sacos != 0){ //Condiciono que si el número es impar me aumente un saco.
        cant_sacos++;
    }
    monto_total_sacos= cant_sacos*13200;//Calculo precio según cantidad de sacos.
    return monto_total_sacos;
}
    
  
    
  //Función para mostrar la informacion
  //Paso como parámetro un string con el tipo de alimento y lleno el arreglo con la información correspondiente.  
    public void mostrar_informacion (String tipo_saco){
        informacion [0] = (tipo_saco);
        String cant_s =String.valueOf(cant_sacos);
        informacion [1] = (cant_s);  
        }
    
}
