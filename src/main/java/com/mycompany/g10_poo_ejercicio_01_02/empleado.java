/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g10_poo_ejercicio_01_02;

/**
 *
 * @author Adrian
 */
public class empleado
{
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    int auto;

    public double calcularIngreso(int anioActual)
    {
        double result;
        double totalCosto;
        double extra;
        int yearsTrabajados;
        totalCosto = this.horasTrabajadas*this.costoHora;
        yearsTrabajados = anioActual-this.anioIngreso;
        extra = yearsTrabajados * 1.02;
        result = totalCosto * extra;
        return result;
    }
    public double   calcularBonoHorasExtra(int maximoHorasTrabjadas)
    {
        double result =1;
        return result;
    }
    public double calcularImpuesto(int limite1, int limite2, int limite3)
    {
        double result =1;
        return result;
    }
    public double calcularAPagar()
    {
        double result =0;
        return result;
    }
}

