public class Produto {
    protected String nome;
    protected int codigo;
    protected double valor;
    protected Fornecedor fornecedor;

    // CONSTRUTORES
    public Produto() {
    }

    public Produto(String nome, int codigo, double valor, Fornecedor fornecedor) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    // MÉTODOS
    public void atualizaPreco(double porcentagem){
        this.valor = this.valor + (this.valor * (porcentagem/100));
    }

    // GETTERS & SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
