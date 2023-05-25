/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea6edclase;

/**
 *
 * @author victo
 */
public class Tarea6EDClase {

    public void aplicarDescuento(double precioProducto, int numProductos){
        double total; 
        double iva1 = 0.8;
        double iva2 = 0.95;
        if(numProductos>3){ 
            precioProducto-=5; 
            if (numProductos!=0){ 
                total = precioProducto*iva1; 
            }else { 
                total = precioProducto*iva2;   
            }
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");     
        }
    }
   
    public static void main(String[] args) {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        miCarrito.aplicarDescuento(100, 5);
    }
}   



 
   
    

