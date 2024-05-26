package tema6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funko {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private Date fecha;

    public Funko(String cod, String nombre, String modelo, double precio, Date fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }


    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return cod + "," + nombre + "," + modelo + "," + precio + "," + sdf.format(fecha);
    }

    public static Funko fromCSV(String csvLine) {
        String[] datos = csvLine.split(",");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = null;
        try {
            fecha = sdf.parse(datos[4]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Funko(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]), fecha);
    }
}
