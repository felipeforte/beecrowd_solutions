import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Time time = new Time();

        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++) {
            Jogador j = new Jogador(sc.nextLine());
            String[] tentativas = sc.nextLine().split(" ");
            j.setTentativas(Integer.parseInt(tentativas[0]),Integer.parseInt(tentativas[1]),Integer.parseInt(tentativas[2]));
            String[] acertos = sc.nextLine().split(" ");
            j.setAcertos(Integer.parseInt(acertos[0]),Integer.parseInt(acertos[1]),Integer.parseInt(acertos[2]));
            time.adicionar(j);
        }
        time.imprimirEstatisticas();
    }
}

class Jogador {
    private String nome;
    private int saques;
    private int bloqueios;
    private int ataques;

    private int tSaques;
    private int tBloqueios;
    private int tAtaques;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int getSaques() {
        return saques;
    }

    public int getBloqueios() {
        return bloqueios;
    }

    public int getAtaques() {
        return ataques;
    }

    public int getTentativaSaques() {
        return tSaques;
    }

    public int getTentativaBloqueios() {
        return tBloqueios;
    }

    public int getTentativaAtaques() {
        return tAtaques;
    }

    public void setAcertos(int saques, int bloqueios, int ataques) {
        this.saques = saques;
        this.bloqueios = bloqueios;
        this.ataques = ataques;
    }

    public void setTentativas(int tSaques, int tBloqueios, int tAtaques) {
        this.tSaques = tSaques;
        this.tBloqueios = tBloqueios;
        this.tAtaques = tAtaques;
    }
}

class Time {
    private ArrayList<Jogador> lista = new ArrayList<>();

    public void adicionar(Jogador j) {
        lista.add(j);
    }

    public void imprimirEstatisticas() {
        int saquesAcertos = 0;
        int bloqueiosAcertos = 0;
        int ataquesAcertos = 0;

        int saquesTotal = 0;
        int bloqueiosTotal = 0;
        int ataquesTotal = 0;

        for (Jogador j : lista) {
            saquesAcertos += j.getSaques();
            bloqueiosAcertos += j.getBloqueios();
            ataquesAcertos += j.getAtaques();

            saquesTotal += j.getTentativaSaques();
            bloqueiosTotal += j.getTentativaBloqueios();
            ataquesTotal += j.getTentativaAtaques();
        }
        double pSaques = (double) saquesAcertos*100/saquesTotal;
        double pBloqueios = (double) bloqueiosAcertos*100/bloqueiosTotal;
        double pAtaques = (double) ataquesAcertos*100/ataquesTotal;

        System.out.printf("Pontos de Saque: %.2f %%.%n",pSaques);
        System.out.printf("Pontos de Bloqueio: %.2f %%.%n",pBloqueios);
        System.out.printf("Pontos de Ataque: %.2f %%.%n",pAtaques);
    }
}
