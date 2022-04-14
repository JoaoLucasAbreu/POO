package ESPM.POO.aula05;

import ESPM.POO.ex2.Cliente;
import ESPM.POO.ex2.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        Cliente selmini = new PessoaFisica();
        selmini.getConta().depositar(10);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(20);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(-10);
        System.out.println(selmini.getConta().getSaldo());
    }
    
}



