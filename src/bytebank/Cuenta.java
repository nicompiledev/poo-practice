package bytebank;

public class Cuenta {
     private double saldo;
     private int agencia;
    private int numero;
    private Cliente titular;

    private static int totalCuentas;

    public Cuenta(int agencia, int numero) {
        Cuenta.totalCuentas++;
        System.out.println("El total de cuentas es: " + Cuenta.totalCuentas);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean retira(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotalCuentas() {
        return Cuenta.totalCuentas;
    }
}
