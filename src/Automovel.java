/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Automovel {

    private String cor;
    private String modelo;
    protected double velocidadeAtual;
    protected double velocidadeMaxima;

    public Automovel(String cor, String modelo, double velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;

        System.out.println("Criando um automovel.");
    }

    public Automovel() {
        System.out.println("Criando um automovel.");
    }

    public void ligar() {
        System.out.println("Automovel ligado!");
    }

    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if (verificaVelocidadeMáxima(novaVelocidade)) {
            this.velocidadeAtual = novaVelocidade;
        } else {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    protected boolean verificaVelocidadeMáxima(double velocidade) {
        return velocidade < velocidadeMaxima;
    }
}
