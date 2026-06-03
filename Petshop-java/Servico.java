// classe de servico do petshop
public class Servico {
    private String servico;
    private double valor;

    public Servico(String servico, double valor) {
        this.servico = servico;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}