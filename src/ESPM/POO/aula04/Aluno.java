package ESPM.POO.aula04;

import java.util.Arrays;

public class Aluno {
    String nome = null;
    Integer ra = null;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public double media(double... notas) {
        //double soma = 0;
        //for (double n: notas) {
        //    soma += n;
        //}

        //double media = soma / notas.length;

        return Arrays.stream(notas).average().getAsDouble();

    }

    @Override // Anotation: 
    public String toString() {
        return "{ra: " + ra + 
        ",nome: " + nome + "}";
    }

    @Override // Anotation: 
    public boolean equals(Object obj) {
        return obj != null
            && obj instanceof Aluno
            && this.ra.equals(((Aluno) obj).ra); 
    }

    @Override
    public int hashCode() {
        return ra.hashCode();
    }
}
