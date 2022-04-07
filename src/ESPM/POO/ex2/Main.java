package ESPM.POO.ex2;
import java.util.Scanner;

 public class Main {

    private static Banco banco = null;
    public static void main(String[] args) {

        banco = new Banco("ESPM bank");
        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        while (!exit) {

        try {
            System.out.print("ESPM> ");
            String input = scan.nextLine().trim().toLowerCase();

            if ("".equals(input)) {
            } else if ("exit".equals(input)) {   //.replace(" ", "")
                exit = true;

            } else if("help".equals(input)) {
                help();

            } else if ("list".equals(input)) {
                list(banco);

            } else if ("add".equals(input)) {
                add(banco);

            } else if ("del".equals(input)) {
                del(banco);

            } else if ("find".equals(input)) {
                throw new UnsupportedOperationException();
                //find(banco);

            } else {
                System.err.println("Comando Inválido");

            }
            
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
        }

        System.out.println("Bye Bye!");
        scan.close();
    }

    private static void help() {
        System.out.println("ESPM Sitema de Clientes");
        System.out.println("-----------------------");
        System.out.println("add -> Cadastra Cliente");
        System.out.println("list -> Lista Clientes");
        System.out.println("del -> Apaga Cliente");
        System.out.println("find -> Localiza Cliente");
        System.out.println("exit -> Sair do Sistema");
        System.out.println();
    }

    private static void list(Banco banco) {
        banco.getClientes().forEach(c -> System.out.println(c.toString()));
    
    }

    private static void add(Banco banco) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("CPF: ");
        String cpf = scan.nextLine();

        Cliente c = new Cliente();
        c.setNome(nome);
        // TODO: quebrou o o codigo
        // c.setCpf(cpf);

        banco.addCliente(c);
    }

    private static void find(Banco banco) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("CPF: ");
        String cpf = scan.nextLine();

        Cliente c = new Cliente();
        // TODO: quebrou o o codigo
        // c.setCpf(cpf);
        c.setNome(nome);

        banco.findClientes(c);
    }

    private static void del(Banco banco) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("CPF: ");
        String cpf = scan.nextLine();

        Cliente c = new Cliente();
        c.setNome(nome);
        // TODO: quebrou o o codigo
        // c.setCpf(cpf);

        banco.remCliente(c);
    }
     
 }
 