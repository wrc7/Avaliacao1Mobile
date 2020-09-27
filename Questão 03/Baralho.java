import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> monte;
    private int cartaAtual;
    private final int TOTAL_DE_CARTAS = 40;
    private final String[] VALORES = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Valete", "Dama", "Rei"};
    private final String[] NAIPES = { "Paus", "Ouros", "Copas", "Espadas" };

    public Baralho() {
        cartaAtual = 0;
        monte = new ArrayList<>(TOTAL_DE_CARTAS);
        for (int i = 0; i < NAIPES.length; i++) {
            for (int j = 0; j < VALORES.length; j++) {
                monte.add(new Carta(NAIPES[i], VALORES[j]));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(monte);
    }

    public Carta distribuir() throws IndexOutOfBoundsException {
        try {
            return monte.get(cartaAtual++);
        } catch (IndexOutOfBoundsException ex) {
            throw new IndexOutOfBoundsException("Não há mais cartas no baralho!");
        }
    }
}
