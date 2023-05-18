import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista();
        int n = Integer.parseInt(entrada.nextLine());
        String[] aux;
        while (n != 0) {
            lista = new Lista();
            for (int i=0;i<n;i++) {
                Aluno a = new Aluno(entrada.nextLine());
                aux = entrada.nextLine().split(" ");
                Camiseta c = new Camiseta(a,aux[0],aux[1]);
                lista.adiciona(c);
            }
            lista.ordena();
            lista.imprimir();
            n = Integer.parseInt(entrada.nextLine());
            if (n != 0) {
                System.out.println();
            }
        }
    }
}

class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Camiseta implements Comparable<Camiseta> {
    private String cor;
    private String tamanho;
    private Aluno aluno;

    public Camiseta(Aluno aluno, String cor, String tamanho) {
        this.aluno = aluno;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getCor() {
        return cor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public Aluno getAluno() {
        return aluno;
    }

    @Override
    public int compareTo(Camiseta outra) {
        if (this.getCor().compareTo(outra.getCor())!=0) {
            return this.getCor().compareTo(outra.getCor());
        }
        if (this.getTamanho().compareTo(outra.getTamanho())!=0) {
            return outra.getTamanho().compareTo(this.getTamanho());
        }
        return this.getAluno().getNome().compareTo(outra.getAluno().getNome());
    }
}

class Lista {
    private ArrayList<Camiseta> lista = new ArrayList<>();

    public void adiciona(Camiseta camiseta) {
        lista.add(camiseta);
    }

    public void ordena() {
        Collections.sort(lista);
    }

    public void imprimir() {
        for (int i=0;i<lista.size();i++) {
            System.out.printf("%s %s %s%n",
                                lista.get(i).getCor(),
                                lista.get(i).getTamanho(),
                                lista.get(i).getAluno().getNome());
        }
    }
}
