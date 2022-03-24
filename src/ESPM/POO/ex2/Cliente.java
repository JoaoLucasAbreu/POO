package ESPM.POO.ex2;

public class Cliente {

    private String nome;
    private String cpf;

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

    @Override // Anotation: 
    public String toString() {
        return "-------------" + 
               "\nNome: " + nome + 
                "\n CPF: " + cpf + "\n-------------";
    }
    
}
