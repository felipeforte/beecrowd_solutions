import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Nivel n = new Nivel();
        Sapo s = new Sapo(entrada.nextInt());
        int canos = entrada.nextInt();
        Cano c;

        for (int i=0;i<canos;i++) {
            c = new Cano(entrada.nextInt());
            n.adiciona(c);
        }
        if (n.finalizavel(s)) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("GAME OVER");
        }
    }
}

class Sapo {
    private int altura;

    public Sapo(int altura) {
        this.altura = altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return this.altura;
    }
}

class Cano {
    private int altura;

    public Cano(int altura) {
        this.altura = altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return this.altura;
    }
}

class Nivel {
    private ArrayList<Cano> nivel = new ArrayList<>();

    public void adiciona(Cano c) {
        nivel.add(c);
    }

    public boolean finalizavel(Sapo s) {
        for (int i=1;i<nivel.size();i++) {
            if (s.getAltura() < Math.abs(nivel.get(i).getAltura()-nivel.get(i-1).getAltura())) {
                return false;
            }
        }
        return true;
    }
}
