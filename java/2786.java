import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int largura = entrada.nextInt();
        int comprimento = entrada.nextInt();
        
        Sala sala = new Sala(largura,comprimento);
        System.out.println(sala.getTipo1());
        System.out.println(sala.getTipo2());
    }
}

class Sala {
    int largura;
    int comprimento;
    
    void setComprimento(int valor) {
        this.comprimento = valor;
    }
    void setLargura(int valor) {
        this.largura = valor;
    }
    
    int getComprimento() {
        return this.comprimento;
    }
    int getLargura() {
        return this.largura;
    }
    
    int getTipo1() {
        return this.largura * this.comprimento + (this.largura-1) * (this.comprimento-1);
    }
    
    int getTipo2() {
        return (this.largura-1)*2 + (this.comprimento-1)*2;
    }
    
    public Sala(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }
}
