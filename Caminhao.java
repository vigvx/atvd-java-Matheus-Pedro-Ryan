
public class Caminhao extends Automovel {

    private double capacidadeCarga; 
    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga) {
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

  
    @Override
    public String getTipoVeiculo() {
        return "Caminhão";
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " | Carga: " + capacidadeCarga + "t";
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }
}
