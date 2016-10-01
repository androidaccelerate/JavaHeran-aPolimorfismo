/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaPolimorfismo {
    public static void main(String[] args) {
        Automovel[] frota = new Automovel[3];

        Jipe jipe = new Jipe();
        jipe.setCor("Branco");
        jipe.setModelo("RAV4");
        jipe.setVelocidadeMaxima(120);
        jipe.setEh4x4(true);

        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Preta");
        caminhonete.setModelo("Estrada");
        caminhonete.setVelocidadeMaxima(140);

        Carro carro = new Carro();
        carro.setCor("Amarelo");
        carro.setModelo("BMW");
        carro.setVelocidadeMaxima(300);

        frota[0] = jipe;
        frota[1] = caminhonete;
        frota[2] = carro;

        for (Automovel automovel : frota) {
            automovel.acelera(100);
            System.out.println("Automovel: " + automovel.getModelo());
            System.out.println("- Velocidade: " + automovel.getVelocidadeAtual());
            System.out.println();
        }
    }
}
