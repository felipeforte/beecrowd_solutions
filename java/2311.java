import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int competidores = entrada.nextInt();
        Competidor c;
        Salto s;
        
        for (int i=0;i<competidores;i++) {
            String nome = entrada.next();
            c = new Competidor(nome);
            double dificuldade = entrada.nextDouble();
            s = new Salto(dificuldade);
            for (int j=0;j<7;j++) {
                double nota = entrada.nextDouble();
                s.adicionaNota(nota);
            }
            System.out.println(s.resultado(c));
        }
    }
}

class Competidor {
    private String nome;
    
    public Competidor(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}

class Salto {
    private double dificuldade;
    private ArrayList<Double> notas = new ArrayList<>();
    
    public Salto(double dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    public void setDificuldade(double dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    public double getDificuldade() {
        return dificuldade;
    }
    
    public void adicionaNota(double nota) {
        notas.add(nota);
    }
    
    public String resultado(Competidor c) {
        int menor = 0;
        int maior = 0;
        double soma = 0;
        for (int i=1;i<notas.size();i++) {
            if (notas.get(i)<notas.get(menor)) {
                menor = i;
            }
        }
        notas.remove(menor);
        for (int i=1;i<notas.size();i++) {
            if (notas.get(i)>notas.get(maior)) {
                maior = i;
            }
        }
        notas.remove(maior);
        for (int i=0;i<notas.size();i++) {
            soma+= notas.get(i);
        }
        return String.format("%s %.2f",c.getNome(),(soma*this.dificuldade));
    }
}
