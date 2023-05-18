import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int instancias = entrada.nextInt();

        Treinador Dabriel = new Treinador("Dabriel");
        Treinador Guarte = new Treinador("Guarte");
        for (int i=0;i<instancias;i++) {
            int bonus = entrada.nextInt();
            int atk = entrada.nextInt();
            int dfs = entrada.nextInt();
            int lvl = entrada.nextInt();
            Pomekon p1 = new Pomekon(atk,dfs,lvl);
            Dabriel.setPomekon(p1);

            atk = entrada.nextInt();
            dfs = entrada.nextInt();
            lvl = entrada.nextInt();
            Pomekon p2 = new Pomekon(atk,dfs,lvl);
            Guarte.setPomekon(p2);
            
            double valorGolpe1 = 0;
            double valorGolpe2 = 0;
            if ((Dabriel.pomekon.getNivel()%2) == 0) {
                valorGolpe1 = Dabriel.pomekon.getValorGolpe(bonus);
            } else {
                valorGolpe1 = Dabriel.pomekon.getValorGolpe(0);
            }
            if ((Guarte.pomekon.getNivel()%2) == 0) {
                valorGolpe2 = Guarte.pomekon.getValorGolpe(bonus);
            } else {
                valorGolpe2 = Guarte.pomekon.getValorGolpe(0);
            }
            if (valorGolpe1 > valorGolpe2) {
                System.out.println(Dabriel.getNome());
            } else if (valorGolpe2 > valorGolpe1) {
                System.out.println(Guarte.getNome());
            } else {
                System.out.println("Empate");
            }
        }
        
    }
 
}
class Treinador {
    private String nome;
    Pomekon pomekon;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pomekon getPomekon() {
        return pomekon;
    }
    public void setPomekon(Pomekon pomekon) {
        this.pomekon = pomekon;
    }

    public Treinador(String nome) {
        this.nome = nome;
    }
}
class Pomekon {
    private int ataque;
    private int defesa;
    private int nivel;
    
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefesa() {
        return defesa;
    }
    public void setDefesa() {
        this.defesa = defesa;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public double getValorGolpe(int bonus) {
        double valorGolpe = ((double) this.ataque + this.defesa)/2 + bonus;
        return valorGolpe;
    }
    
    public Pomekon(int ataque, int defesa, int nivel) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
    }
}
