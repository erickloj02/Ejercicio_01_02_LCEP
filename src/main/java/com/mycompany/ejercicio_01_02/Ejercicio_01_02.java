// Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

package com.mycompany.ejercicio_01_02;

public class Ejercicio_01_02 {

    public static void main(String[] args) {
       System.out.println("Ejercicio_01_02");
       
       var empleadito = new Empleado();
       empleadito.nombre = "Erick Lojano";
       empleadito.horasTrabajadas = 160;
       empleadito.costoHora = 11.5;
       empleadito.anioIngreso = 2003;
       
       var empleados = new Empleado();
       empleados.nombre = "Maria Ortiz";
       empleados.horasTrabajadas = 100;
       empleados.costoHora = 9;
       empleados.anioIngreso = 2010;
       
       System.out.println(empleadito.nombre+" | "+
                          empleadito.horasTrabajadas+" | "+
                          empleadito.costoHora+" | "+
                          empleadito.anioIngreso+" | ");
       
       System.out.println(empleados.nombre+" | "+
                          empleados.horasTrabajadas+" | "+
                          empleados.costoHora+" | "+
                          empleados.anioIngreso+" | "); 
       
    }
}
