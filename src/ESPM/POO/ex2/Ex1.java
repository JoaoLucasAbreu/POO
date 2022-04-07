package ESPM.POO.ex2;

public class Ex1 {
    
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica();
        Cliente pj2 = new PessoaJuridica();

        Banco Bank = new Banco("BankBank");

        Bank.addCliente(pj1);
        Bank.addCliente(pj1);
    }
}
