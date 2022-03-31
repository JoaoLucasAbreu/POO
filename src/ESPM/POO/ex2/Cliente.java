package ESPM.POO.ex2;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    public Cliente() {
        this.conta = new Conta(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta() {
        return conta;
    }

    @Override // Anotation: 
    public String toString() {
        return "-------------" + 
               "\nNome: " + nome + 
                "\nCPF: " + cpf + 
                "\nConta: " + conta.getSaldo() + 
                "\n-------------";
    }
    
}
