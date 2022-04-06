/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_01_02;

public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHoras;
    int anioIngreso;
    
    public double calcularIngresos(int anioIngreso){
        var retorno = anioIngreso-this.anioIngreso;
        return retorno;
    }
    
    public double calcularBonoHorasExtra(int maximoHorasTrabajadas){
       var retorno = maximoHorasTrabajadas-this.horasTrabajadas;
       return retorno;
    }
    
    public double calcularImpuesto(int limite1, int limite2, int limite3){
        var retorno=663.55;
        return retorno;
    }
    
    public double calcularAPagar(){
        var retorno=1990.65;
        return retorno;
    }   
    
}
