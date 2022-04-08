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
        double resultado = 0;
        double totalPago=this.costoHora*this.horasTrabajadas;
        
        double ingreso = this.calcularIngreso(anioIngreso);
        
        
        if(ingreso <= limite1){
            resultado=0;
        }else{
            if(ingreso > limite1 && ingreso <= limite2){
                resultado=(5*totalPago)/100;
            }else{
                if(ingreso>limite2 && ingreso <= limite3){
                    resultado=(12*totalPago)/100;
                }else{
                    if(ingreso>limite3){
                        resultado=(25*totalPago)/100;
                    }
                }
            }
           
        }
       
        
        
        
        
        
        
        
        
        return ingreso;  
    }
    public double calcularAPagar()
    {
        double result =0;
        return result;
    }
}

