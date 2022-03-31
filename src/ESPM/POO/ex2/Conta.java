package ESPM.POO.ex2;

public class Conta {
    
    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta (Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
        this.saldo = this.saldo - valor;

        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
    
            }
    }

    public Cliente getCliente() {
        return cliente;
    }

}
