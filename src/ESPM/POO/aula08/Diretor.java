package ESPM.POO.aula08;

public class Diretor extends Funcionario implements Usuario{
    
    public Diretor (int id) {
        super(id);
    }

    @Override
    public boolean autenticar(String password) {
        
        String p = "";
        int n = getId();
        while (n > 0) {
            int s = n % 10;
            n = (n - s) / 10;
            p += s;
        }

        return p.equals(password);
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return "Dir." + super.getId();
    }
}
