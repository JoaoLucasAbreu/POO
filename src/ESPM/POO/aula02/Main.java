package ESPM.POO.aula02;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa p[] = new Pessoa[2];
        

        for (int i = 0; i < 2; i++) {
            p[i] = new Pessoa();

            System.out.println("Nome: ");
            p[i].nome = scan.next();
            System.out.println("Idade: ");
            p[i].idade = scan.nextInt();
            System.out.println("Salario: ");
            p[i].salario = scan.nextDouble();

        }

    }
    
}
