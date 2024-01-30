package POO;

public class Cuenta {
    private int numCuenta;
    private  int saldo;

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public  Cuenta (int numCuenta, int saldo){
        this.numCuenta=numCuenta;
        this.saldo=saldo;
    }
    public int payrecibo(int payment){
        if (saldo>payment){
            saldo=saldo-payment;
        }else {
            System.out.println("Lo siento, no tienes saldo suficiente");
        }
        return saldo;
    }
    public int ingreso(int ingreso){
        saldo=saldo+ingreso;
        return saldo;
    }
    public String toString(){return "Numero de cuenta: " + numCuenta + "\n Saldo: " + saldo;}


}
