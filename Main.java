
public class Main {

    public static void main(String[] args) {


        System.out.println("---  SISTEMA DE VENDA DE VEÍCULOS ---");


        SistemaVendas sistema = new SistemaVendas();

        System.out.println("── CADASTRANDO VENDEDORES ──");
        Vendedor vendedor = new Vendedor(1, "Carlos Oliveira");
        sistema.adicionarVendedor(vendedor);

        System.out.println("\n── CADASTRANDO CLIENTES ──");
        Cliente cliente1 = new Cliente(101, "Ana Souza");
        Cliente cliente2 = new Cliente(102, "Bruno Lima");
        sistema.adicionarCliente(cliente1);
        sistema.adicionarCliente(cliente2);

        System.out.println("\n── CADASTRANDO VEÍCULOS ──");
        Carro carro = new Carro("Toyota", "Corolla", 2023, 115000.00, 4);
        sistema.adicionarVeiculo(carro);

        Caminhao caminhao = new Caminhao("Volvo", "FH 540", 2022, 680000.00, 25.0);
        sistema.adicionarVeiculo(caminhao);

        sistema.listarVeiculos();

        System.out.println("\n── REALIZANDO VENDAS ──");

        Venda venda1 = sistema.realizarVenda(cliente1, carro, vendedor, 1, 115000.00);

        Venda venda2 = sistema.realizarVenda(cliente2, caminhao, vendedor, 2, 680000.00);

        sistema.listarClientes();

        sistema.listarVendas();

        System.out.println("── RELATÓRIO FINAL ──");
        System.out.printf("  Total vendido: R$ %.2f%n", sistema.getTotalVendido());

        System.out.println("\n── POLIMORFISMO EM AÇÃO ──");
        Automovel[] veiculos = { carro, caminhao };
        for (Automovel v : veiculos) {
            System.out.println("  Tipo (polimórfico): " + v.getTipoVeiculo());
            System.out.println("  Descrição         : " + v.getDescricao());
            System.out.println();
        }

        System.out.println("── ENCAPSULAMENTO ──");
        System.out.println("  Nome do cliente via getter: " + cliente1.getNome());
        cliente1.setNome("Ana Paula Souza"); 
        System.out.println("  Nome atualizado via setter: " + cliente1.getNome());
    }
}
