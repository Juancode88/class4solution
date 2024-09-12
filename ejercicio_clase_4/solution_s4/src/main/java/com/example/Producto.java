
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    /* Builder */
    public Producto() {
        this.nombre = "Producto Genérico";
        this.precio = 0.0;
        this.stock = 0;
    }

    /* Builder - parameters */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /* Getters y setters */ 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /* Method */ 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    public void actualizarStock(int cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: No se permite actualizar el stock con una cantidad negativa.");
        } else {
            this.stock += cantidad;
        }
    }

    public double calcularPrecioTotal() {
        return precio * stock;
    }
}
