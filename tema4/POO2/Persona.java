package POO2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String dni;
    private List<Cuenta> cuentasBancarias;
    private static final int EDAD_DEFAULT = 0;
    private static final String DEFAULT = "Desconocido";
    private static final String DEFAULT_DNI = "12345678D";

    public String getDni() {
        return dni;
    }
    public void setDNI(String dni) {
        this.dni = dni;
    }
    public Persona() {
        this.dni = DEFAULT_DNI;
        
        cuentasBancarias = new ArrayList<>();
    }
    public Persona(String dni) {
        if (checkDni(dni)) {
            this.dni = dni;
        }
        cuentasBancarias = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "------------\n" +
                "DNI: " + dni;
    }
    public void print() {
        System.out.println(this);
    }
    public static boolean checkDni(String dni){
        boolean checkDni = true;
        if (dni.length() !=9) {
            checkDni = false;
        }
        return checkDni;
    }
    public void addCuentaBancaria(Cuenta cuenta) {
        if (cuentasBancarias.size() < 3) {
            cuentasBancarias.add(cuenta);
        } else {
            System.out.println("No se pueden agregar más cuentas. Límite alcanzado.");
        }
    }
    public Cuenta buscarCuentaPorNumero(int numeroCuenta) {
        for (Cuenta cuenta : cuentasBancarias) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }
    
    public boolean esMorosa() {
        for (Cuenta cuenta : cuentasBancarias) {
            if (cuenta.getSaldoDisponible() < 0) {
                return true;
            }
        }
        return false;
    }
    
}