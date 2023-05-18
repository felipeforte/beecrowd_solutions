import java.io.IOException;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Aluno a = new Aluno();
        
        double nota = entrada.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
            nota = entrada.nextDouble();
        }
        a.setAv1(nota);
        nota = entrada.nextDouble();
        while (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
            nota = entrada.nextDouble();
        }
        a.setAv2(nota);
        System.out.println("media = " + String.format("%.2f", a.media()));
    }
}

class Aluno {
    private double av1;
    private double av2;
    
    public void setAv1(double av1) {
        this.av1 = av1;
    }
    public void setAv2(double av2) {
        this.av2 = av2;
    }
    
    public double getAv1() {
        return av1;
    }
    public double getAv2() {
        return av2;
    }
    
    public double media() {
        return (av1+av2)/2;
    }
}
