package POO2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String name;
    private String lastName;
    private String dni;
    private int age;
    private List<Cuenta> cuentasBancarias;
    private static final int EDAD_DEFAULT = 0;
    private static final String DEFAULT = "Desconocido";
    private static final String DEFAULT_DNI = "12345678D";

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDni() {
        return dni;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else{
            this.age=EDAD_DEFAULT;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDNI(String dni) {
        this.dni = dni;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Persona() {
        this.name = DEFAULT;
        this.lastName = DEFAULT;
        this.age = EDAD_DEFAULT;
        this.dni = DEFAULT_DNI;
        
        cuentasBancarias = new ArrayList<>();
    }
    public Persona(String name, String lastName, int age, String dni) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        if (checkDni(dni)) {
            this.dni = dni;
        }
        cuentasBancarias = new ArrayList<>();
    }
    @Override
    public String toString() {
        return "------------\n" +
                "Nombre: " + name + "\n" +
                "Apellido: " + lastName + "\n" +
                "DNI: " + dni + "\n" +
                "Edad: " + age + "\n" +
                "------------";
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
    public boolean esMorosa() {
        for (Cuenta cuenta : cuentasBancarias) {
            if (cuenta.getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }
}