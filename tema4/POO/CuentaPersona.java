package POO;

import java.util.Arrays;

public class CuentaPersona {
    private String dni;
    private int [] cuentas;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(int[] cuentas) {
        this.cuentas = cuentas;
    }

    public CuentaPersona(String dni, int [] cuentas){
        this.dni=dni;
        this.cuentas=cuentas;
    }
    public String toString() {return "DNI: " + dni + "\n Cuentas: " + Arrays.toString(cuentas);}

}
