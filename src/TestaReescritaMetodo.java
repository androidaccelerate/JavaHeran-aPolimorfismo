/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaReescritaMetodo {
    public static void main(String[] args) {
        Caminhonete caminhonete = new Caminhonete();
        caminhonete.setCor("Amarela");
        caminhonete.setModelo("Estrada");
        caminhonete.setVelocidadeMaxima(120);

        caminhonete.acelera(100);

        Jipe jipe = new Jipe();
        jipe.setCor("Preta");
        jipe.setModelo("RAV4");
        jipe.setVelocidadeMaxima(120);
        jipe.setEh4x4(true);

        jipe.acelera(100);

        System.out.println("Caminhonete Acelera: " + caminhonete.getVelocidadeAtual());
        System.out.println("Jipe Acelera: " + jipe.getVelocidadeAtual());
    }
}
