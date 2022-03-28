package ESPM.POO.ex2;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;

    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    public void remCliente(Cliente c) {
        this.clientes.remove(c);
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void findClientes(Cliente c) {

        for (int i = 0; i < clientes.size(); i++) {
            
            if (clientes.contains(c)) {
                System.out.println("Está na lista");
            } else {
                System.out.println("Não está na lista");
            }
        }

    }



    
}
