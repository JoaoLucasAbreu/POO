package ESPM.POO.aula04;

public class Main {

    public static void main(String[] args) {
        Aluno al1 = new Aluno(1000, "JOHNNY");
        System.out.println(al1.toString());

        Aluno al2 = new Aluno(1000, "JOHNNY");
        System.out.println(al2.toString());

        if (al1 == al2) {
            System.out.println("São Iguais");
        } else {
            System.out.println("São Diferentes");
        }

        if (al1.equals(al2)) {
            System.out.println("São Iguais");
        } else {
            System.out.println("São Diferentes");
        }

    }
    
}
