/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Carro extends Automovel {

    private static int quantidadeDeCarros;

    private boolean ehConversivel;

    public void setEhConversivel(boolean ehConversivel) {
        this.ehConversivel = ehConversivel;
    }

    public boolean isEhConversivel() {
        return this.ehConversivel;
    }

    public static int getQuantidadeDeCarros() {
        return Carro.quantidadeDeCarros;
    }
}
