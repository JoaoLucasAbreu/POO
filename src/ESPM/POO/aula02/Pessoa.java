package ESPM.POO.aula02;

public class Pessoa {

    String nome;
    int idade;
    int cpf;
    double salario;

    public static void main(String[] args) {

        System.out.println("Ola");
        
    }

    public void imprimir() {
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
}
