import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int pomekons = 151;
        int n = entrada.nextInt();
        Mochila m = new Mochila();

        for (int i=0;i<n;i++) {
            String pomekon = entrada.next();
            if (!m.contem(pomekon)) {
                m.adiciona(pomekon);
                pomekons -= 1;
            }
        }
        System.out.printf("Falta(m) %d pomekon(s).%n",pomekons);

    }
}

class Mochila {
    private ArrayList<String> mochila = new ArrayList<>();

    public void adiciona(String nome) {
        mochila.add(nome);
    }

    public boolean contem(String nome) {
        return mochila.contains(nome);
    }
}
