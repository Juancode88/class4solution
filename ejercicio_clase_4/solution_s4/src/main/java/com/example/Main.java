package com.example;
 
public class Main {
    public static void main(String[] args) {
         /* Create products */
         Producto producto1 = new Producto("Laptop", 999.99, 10);
         Producto producto2 = new Producto("Mouse", 25.50, 50);
         Producto producto3 = new Producto("Teclado", 45.75, 20);
         Producto producto4 = new Producto("Monitor", 199.99, 5);
         
         /* Create store */
         Tienda tienda = new Tienda();
 
         /*Adding products to store */
         tienda.agregarProducto(producto1);
         tienda.agregarProducto(producto2);
         tienda.agregarProducto(producto3);
         tienda.agregarProducto(producto4);
 
         /* Product information */
         System.out.println("Información de todos los productos:");
         for (Producto producto : tienda.productos) { 
            producto.mostrarInformacion();
            System.out.println();
        }
 
         /* Search product */
         String nombreBuscado = "Teclado";
         Producto productoEncontrado = tienda.buscarProductoPorNombre(nombreBuscado);
         if (productoEncontrado != null) {
             System.out.println("Producto encontrado:");
             productoEncontrado.mostrarInformacion();
         } else {
             System.out.println("Producto no encontrado: " + nombreBuscado);
         }
 
         /*Update stock */
         System.out.println("\nActualizando stock del Monitor:");
         producto4.actualizarStock(3); // Adding 3 more monitors
         producto4.mostrarInformacion();
 
         /*Check bad update stock */
         System.out.println("\nIntentando actualizar stock del Mouse con cantidad negativa:");
         producto2.actualizarStock(-5); // This should show an error message
 
         /* Calculate storage value */
         double valorTotalInventario = tienda.calcularValorTotalInventario();
         System.out.printf("Valor total del inventario: %.2f\n", valorTotalInventario);
 
         /* products with lower stock */
         int limiteStockBajo = 10;
         tienda.mostrarProductosConStockBajo(limiteStockBajo);
    } 
}