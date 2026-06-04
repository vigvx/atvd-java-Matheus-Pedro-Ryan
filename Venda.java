
public class Venda {

    private static int contadorId = 1; 

    private int id;
    private Cliente cliente;
    private Automovel automovel;  
    private Vendedor vendedor;
    private int qtd;
    private double preco;

    public Venda(Cliente cliente, Automovel automovel, Vendedor vendedor, int qtd, double preco) {
        this.id = contadorId++;
        this.cliente = cliente;
        this.automovel = automovel;
        this.vendedor = vendedor;
        this.qtd = qtd;
        this.preco = preco;
    }

   
    public double getValorTotal() {
        return qtd * preco;
    }

    public int getId() { return id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Automovel getAutomovel() { return automovel; }
    public void setAutomovel(Automovel automovel) { this.automovel = automovel; }

    public Vendedor getVendedor() { return vendedor; }
    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor; }

    public int getQtd() { return qtd; }
    public void setQtd(int qtd) { this.qtd = qtd; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public String toString() {
        return "=== VENDA #" + id + " ===\n" +
               "  Cliente   : " + cliente + "\n" +
               "  Vendedor  : " + vendedor + "\n" +
               "  Veículo   : " + automovel.getDescricao() + "\n" +
               "  Quantidade: " + qtd + "\n" +
               "  Preço unit: R$ " + String.format("%.2f", preco) + "\n" +
               "  TOTAL     : R$ " + String.format("%.2f", getValorTotal());
    }
}
