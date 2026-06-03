// classe do cliente (dono do pet)
public class Cliente {
    private String nome;
    private String telefone;
    private String pet;

    public Cliente(String nome, String telefone, String pet) {
        this.nome = nome;
        this.telefone = telefone;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPet() {
        return pet;
    }

    public void mostrar() {
        System.out.println("Dono: " + nome + " | Pet: " + pet + " | Tel: " + telefone);
    }
}