
public class Carro extends Automovel {

    private int numeroDePorras; 

    public Carro(String marca, String modelo, int ano, double preco, int numeroDePortas) {
        super(marca, modelo, ano, preco); 
        this.numeroDePorras = numeroDePortas;
    }

    
    @Override
    public String getTipoVeiculo() {
        return "Carro";
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " | Portas: " + numeroDePorras;
    }

    public int getNumeroDePortas() { return numeroDePorras; }
    public void setNumeroDePortas(int numeroDePortas) { this.numeroDePorras = numeroDePortas; }
}
