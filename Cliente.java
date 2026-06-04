
public class Cliente extends Pessoa {

    private int codigo;

    public Cliente(int codigo, String nome) {
        super(nome); 
        this.codigo = codigo;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    @Override
    public String toString() {
        return "Cliente[" + codigo + "] " + getNome();
    }
}
