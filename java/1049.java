import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String tipo = entrada.next();
        String filo = entrada.next();
        String dieta = entrada.next();
        
        if (tipo.equals("vertebrado")) {
            if (filo.equals("ave")) {
                Ave a = new Ave(dieta);
                System.out.println(a.getNome());
            } else {
                Mamifero a = new Mamifero(dieta);
                System.out.println(a.getNome());
            }
        } else {
            if (filo.equals("inseto")) {
                Inseto a = new Inseto(dieta);
                System.out.println(a.getNome());
            } else {
                Anelideo a = new Anelideo(dieta);
                System.out.println(a.getNome());
            }
        }
    }
}

abstract class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

abstract class Vertebrado extends Animal {
}
abstract class Invertebrado extends Animal {
}

class Ave extends Vertebrado {
    public Ave(String dieta) {
        if (dieta.equals("carnivoro")) {
            this.setNome("aguia");
        } else {
            this.setNome("pomba");
        }
    }
}
class Mamifero extends Vertebrado {
    public Mamifero(String dieta) {
        if (dieta.equals("onivoro")) {
            this.setNome("homem");
        } else {
            this.setNome("vaca");
        }
    }
}

class Inseto extends Invertebrado {
    public Inseto(String dieta) {
        if (dieta.equals("hematofago")) {
            this.setNome("pulga");
        } else {
            this.setNome("lagarta");
        }
    }
}
class Anelideo extends Invertebrado {
    public Anelideo(String dieta) {
        if (dieta.equals("hematofago")) {
            this.setNome("sanguessuga");
        } else {
            this.setNome("minhoca");
        }
    }
}
