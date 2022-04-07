/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g10_poo_ejercicio_01_02;

/**
 *
 * @author Adrian
 */
public class G10_POO_Ejercicio_01_02
{
    public static void main(String[] args)
    {
        int anioActual = 2022;
        var empleado1 = new empleado();
        empleado1.anioIngreso=2003;
        empleado1.costoHora=11.5;
        empleado1.horasTrabajadas=160;
        empleado1.nombre="Juan";
        
        System.out.print("Horas trabajadas: " + empleado1.horasTrabajadas);
        System.out.print("Costo hora: " + empleado1.costoHora);
        System.out.print("Año actual: 2022 ");
        
        System.out.print("Ingresos: " + empleado1.calcularIngreso(anioActual));
    }
        
    
}
