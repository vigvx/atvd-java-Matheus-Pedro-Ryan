import java.util.ArrayList;
import java.util.List;


public class SistemaVendas {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Vendedor> vendedores = new ArrayList<>();
    private List<Automovel> automoveis = new ArrayList<>();  
    private List<Venda> vendas = new ArrayList<>();


    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("✔ Cliente cadastrado: " + cliente);
    }

    public void removerCliente(int codigo) {
        clientes.removeIf(c -> c.getCodigo() == codigo);
        System.out.println("✔ Cliente " + codigo + " removido.");
    }

    public Cliente buscarCliente(int codigo) {
        return clientes.stream()
                .filter(c -> c.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public void listarClientes() {
        System.out.println("\n── CLIENTES CADASTRADOS ──");
        if (clientes.isEmpty()) {
            System.out.println("  Nenhum cliente cadastrado.");
        } else {
            clientes.forEach(c -> System.out.println("  " + c));
        }
    }


    public void adicionarVeiculo(Automovel veiculo) {
        automoveis.add(veiculo);
        System.out.println("✔ Veículo cadastrado: " + veiculo.getDescricao());
    }

    public void listarVeiculos() {
        System.out.println("\n── VEÍCULOS DISPONÍVEIS ──");
        if (automoveis.isEmpty()) {
            System.out.println("  Nenhum veículo cadastrado.");
        } else {
            
            automoveis.forEach(v -> System.out.println("  [" + v.getTipoVeiculo() + "] " + v.getDescricao()));
        }
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("✔ Vendedor cadastrado: " + vendedor);
    }


    public Venda realizarVenda(Cliente cliente, Automovel automovel, Vendedor vendedor, int qtd, double preco) {
        Venda venda = new Venda(cliente, automovel, vendedor, qtd, preco);
        vendas.add(venda);
        System.out.println("\n✔ Venda realizada com sucesso!");
        System.out.println(venda);
        return venda;
    }

    public void listarVendas() {
        System.out.println("\n── HISTÓRICO DE VENDAS ──");
        if (vendas.isEmpty()) {
            System.out.println("  Nenhuma venda registrada.");
        } else {
            vendas.forEach(v -> System.out.println(v + "\n"));
        }
    }

    public double getTotalVendido() {
        return vendas.stream().mapToDouble(Venda::getValorTotal).sum();
    }
}
