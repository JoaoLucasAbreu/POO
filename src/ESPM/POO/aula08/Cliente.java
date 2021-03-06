package ESPM.POO.aula08;

public class Cliente implements Usuario{
    
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String getUsername() {
        return "Cli." + nome.toLowerCase(); 
    }

    @Override
    public boolean autenticar(String password) {
        return (
            "" + nome.charAt(0) + nome.charAt(nome.length() -1)
        ).toLowerCase().equals(password);
    }
}
