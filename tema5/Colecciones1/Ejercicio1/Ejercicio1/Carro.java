package Colecciones1.Ejercicio1.Ejercicio1;

public class  Carro {
    String producto;
    double precio;

    public Carro (String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setEdad(double precio) {
        this.precio= precio;
    }
}
