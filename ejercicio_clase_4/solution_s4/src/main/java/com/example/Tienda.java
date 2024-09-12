package com.example;
import java.util.ArrayList;
  
public class Tienda {
    private ArrayList<Producto> productos;

    /* Builder */
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    /* Method */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public double calcularValorTotalInventario() {
        double valorTotal = 0;
        for (Producto producto : productos) {
            valorTotal += producto.calcularPrecioTotal();
        }
        return valorTotal;
    }

    public void mostrarProductosConStockBajo(int limite) {
        System.out.println("Productos con stock bajo (menor a " + limite + "):");
        for (Producto producto : productos) {
            if (producto.getStock() < limite) {
                producto.mostrarInformacion();
                System.out.println();
            }
        }
    }
}