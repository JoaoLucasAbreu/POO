package ESPM.POO.aula08;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MainAuth {
    
    public static void main(String[] args) {
        
        Cliente joao = new Cliente("joao");
        Funcionario func1 = new Diretor(10);
        Diretor dir = new Diretor(20);

        Usuario usu1 = new Cliente("Rodrigo");


        List<Usuario> l = new ArrayList<>();

        l.add(joao);
        l.add(dir);
        l.add((Usuario)func1);
        l.add(usu1);

        for (Usuario u:l) {
            System.out.print(u.getUsername() + ": ");
            String pass = new Scanner(System.in).nextLine().trim().toLowerCase();
            System.out.println(u.autenticar(pass));
        }
    }
}
