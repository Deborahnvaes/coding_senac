package IMC;

public abstract class PessoaIMC extends Pessoa {

    // ATRIBUTOS
    private double peso;
    private double altura;


    // CONSTRUTOR
    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }


    // SETTERS & GETTERS
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }


    // MÉTODO
    public double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }


    // TO STRING
    public String toString() {
        return super.toString() + "\nPeso: " + this.peso + "\nAltura: " + this.altura;
    }


    public abstract String resultIMC();

}
