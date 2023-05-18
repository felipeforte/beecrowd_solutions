import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++) {
            String[] aux = sc.nextLine().split(" ");
            Crianca c = new Crianca(aux[0],aux[1]);
            lista.adicionar(c);
        }
        lista.ordenar();
        lista.imprimir();
        lista.numComportados();
    }
 
}

class Crianca implements Comparable<Crianca> {
    private String nome;
    private boolean comportada;
    public Crianca(String comportamento, String nome) {
        if (comportamento.equals("+")) {
            comportada = true;
        } else {
            comportada = false;
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public boolean isComportada() {
        return comportada;
    }

    @Override
    public int compareTo(Crianca outra) {
        if (this.nome.compareTo(outra.nome) != 0) {
            return this.nome.compareTo(outra.nome);
        }
        return 0;
    }
}

class Lista {
    ArrayList<Crianca> lista = new ArrayList<>();

    public void adicionar(Crianca c) {
        lista.add(c);
    }

    public void ordenar() {
        Collections.sort(lista);
    }

    public void imprimir() {
        for (Crianca c : lista) {
            System.out.println(c.getNome());
        }
    }

    public void numComportados() {
        int nComportados = 0;
        for (Crianca c : lista) {
            if (c.isComportada()) {
                nComportados += 1;
            }
        }
        int nMalcriados = lista.size() - nComportados;
        System.out.printf("Se comportaram: %d | Nao se comportaram: %d%n",nComportados,nMalcriados);
    }
}
