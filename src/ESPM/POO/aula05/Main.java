package ESPM.POO.aula05;

import ESPM.POO.ex2.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente selmini = new Cliente();
        selmini.getConta().depositar(10);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(20);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(-10);
        System.out.println(selmini.getConta().getSaldo());
    }
    
}



