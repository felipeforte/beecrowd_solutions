import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int p = entrada.nextInt();
        int j1 = entrada.nextInt();
        int j2 = entrada.nextInt();
        int r = entrada.nextInt();
        int a = entrada.nextInt();
        
        Jogo j = new Jogo(p,j1,j2,r,a);
        j.resultado();
    }
 
}

class Jogo {
    int p;
    int j1;
    int j2;
    int r;
    int a;
    
    public Jogo(int p, int j1, int j2, int r, int a) {
        this.p = p;
        this.j1 = j1;
        this.j2 = j2;
        this.r = r;
        this.a = a;
    }
    
    public void resultado() {
        if (r==1 && a==0 || r==0 && a==1) {
            System.out.println("Jogador 1 ganha!");
        } else if (r==1 && a==1) {
            System.out.println("Jogador 2 ganha!");
        } else {
            if (p==1 && (j1+j2)%2==0) {
                System.out.println("Jogador 1 ganha!");
            } else if (p==0 && (j1+j2)%2!=0) {
                System.out.println("Jogador 1 ganha!");
            } else {
                System.out.println("Jogador 2 ganha!");
            }
        }
    }
}
