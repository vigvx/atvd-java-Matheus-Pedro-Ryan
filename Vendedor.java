
public class Vendedor extends Pessoa {

    private int codigo;

    public Vendedor(int codigo, String nome) {
        super(nome);
        this.codigo = codigo;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    @Override
    public String toString() {
        return "Vendedor[" + codigo + "] " + getNome();
    }
}
