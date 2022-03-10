package ESPM.POO.aula03;

import ESPM.POO.aula02.Pessoa;

public class MainMetodo {

    public static void main(String[] args) {
        int v = 10;
        int y = mult2(v);

        System.out.println("v: " + v);
        System.out.println("y: " + y);

        Pessoa vip = new Pessoa("João");
        vip.salario = 5000;
        vip.imprimir();

        System.out.println("Reajuste ----");
        multSalario(vip);
        System.out.println(vip.salario);

    }


    public static int mult2(int x) {
        x = x * 2;
        return x;
    }


    public static void multSalario(Pessoa p) { // Passagem por referências
        p.salario *= 2;
    }



}