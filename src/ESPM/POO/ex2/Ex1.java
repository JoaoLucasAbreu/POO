package ESPM.POO.ex2;

public class Ex1 {
    
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica();

        pj1.setNome("Rodrigo");
        pj1.setCnpj("123.456.789-0");

        Cliente pj2 = new PessoaJuridica();

        Banco Bank = new Banco("BankBank");
        Bank.addCliente(pj1);
        Bank.addCliente(pj2);

        Cliente rodrigo = pj1;

        Cliente leon = new PessoaFisica();

    }
}
