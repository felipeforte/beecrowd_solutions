import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Agencia agencia = new Agencia();

        while(true) {
            String direcao = entrada.next();
            if (direcao.equals("ABEND")) {
                break;
            }
            int turistas = entrada.nextInt();
            Jipe jipe = new Jipe(turistas);

            if (direcao.equals("SALIDA")) {
                agencia.saida(jipe);
            } else if (direcao.equals("VUELTA")) {
                agencia.chegada(jipe);
            }
        }

        System.out.println(agencia.getTuristas());
        System.out.println(agencia.getJipes());

    }
}

class Jipe {
    int turistas;

    public Jipe(int turistas) {
        this.turistas = turistas;
    }
}

class Agencia {
    int turistas;
    int jipes;

    void saida(Jipe jipe) {
        jipes++;
        turistas += jipe.turistas;
    }
    void chegada(Jipe jipe) {
        jipes--;
        turistas -= jipe.turistas;
    }

    int getTuristas() {
        return this.turistas;
    }
    int getJipes() {
        return this.jipes;
    }
}
