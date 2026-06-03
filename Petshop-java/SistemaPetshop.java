import java.util.ArrayList;
import java.util.Scanner;

// sistema principal
public class SistemaPetshop {

    // lista de clientes
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    // lista de servicos
    private ArrayList<Servico> listaServicos = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void menu() {
        int op;

        do {
            System.out.println("\n--- PETSHOP ---");
            System.out.println("1 - cadastrar cliente");
            System.out.println("2 - listar clientes");
            System.out.println("3 - editar cliente");
            System.out.println("4 - excluir cliente");
            System.out.println("5 - registrar servico");
            System.out.println("6 - total dinheiro");
            System.out.println("0 - sair");

            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1: cadastrar(); break;
                case 2: listar(); break;
                case 3: editar(); break;
                case 4: excluir(); break;
                case 5: addServico(); break;
                case 6: total(); break;
            }

        } while(op != 0);
    }

    // cadastrar cliente
    public void cadastrar() {
        System.out.print("nome dono: ");
        String nome = sc.nextLine();

        System.out.print("telefone: ");
        String tel = sc.nextLine();

        System.out.print("nome pet: ");
        String pet = sc.nextLine();

        listaClientes.add(new Cliente(nome, tel, pet));
        System.out.println("cadastrado!");
    }

    // listar
    public void listar() {
        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.print(i + " - ");
            listaClientes.get(i).mostrar();
        }
    }

    // editar (so nome msm)
    public void editar() {
        listar();
        System.out.print("indice: ");
        int i = sc.nextInt();
        sc.nextLine();

        System.out.print("novo nome: ");
        listaClientes.get(i).setNome(sc.nextLine());
    }

    // excluir
    public void excluir() {
        listar();
        System.out.print("indice: ");
        int i = sc.nextInt();

        listaClientes.remove(i);
        System.out.println("apagado");
    }

    // adicionar servico
    public void addServico() {
        System.out.print("servico: ");
        String s = sc.nextLine();

        System.out.print("valor: ");
        double v = sc.nextDouble();

        listaServicos.add(new Servico(s, v));
        System.out.println("ok");
    }

    // total dinheiro
    public void total() {
        double soma = 0;

        for (Servico s : listaServicos) {
            soma += s.getValor();
        }

        System.out.println("total: " + soma);
    }
}