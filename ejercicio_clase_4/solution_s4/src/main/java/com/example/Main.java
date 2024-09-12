package com.example;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        /* Create products */
        Producto producto1 = new Producto("Laptop", 999.99, 20);
        Producto producto2 = new Producto("Smartphone", 499.99, 50);
        Producto producto3 = new Producto("Tablet", 299.99, 5);

        /* Create store */
        Tienda tienda = new Tienda();

        /* Adding products */
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        /* Product search */
        Producto productoEncontrado = tienda.buscarProductoPorNombre("Smartphone");
        if (productoEncontrado != null) {
            productoEncontrado.mostrarInformacion();
        } else {
            System.out.println("Producto no encontrado.");
        }

        /* Calculate the  total storage  */
        double valorTotalInventario = tienda.calcularValorTotalInventario();
        System.out.println("Valor total del inventario: $" + valorTotalInventario);

        /* Info lower stock */
        tienda.mostrarProductosConStockBajo(10);
        
        /* Update stock product */
        producto3.actualizarStock(10);
        
        /* After update */
        tienda.mostrarProductosConStockBajo(10);
    }
}