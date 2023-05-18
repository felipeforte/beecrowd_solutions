import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        if ((A+B) > C && (A+C) > B && (B+C) > A) {
            Triangulo t = new Triangulo(A,B,C);
            System.out.println("Perimetro = " + t.calculaPerimetro());
        } else {
            Trapezio t = new Trapezio(A,B,C);
            System.out.println("Area = " + t.calculaArea());
        }
    }
}

abstract class Poligono {
    protected double A;
    protected double B;
    protected double C;
}
class Triangulo extends Poligono {
    public Triangulo(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public double calculaPerimetro() {
        return A+B+C;
    }
}

class Trapezio extends Poligono {
    public Trapezio(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public double calculaArea() {
        return (A+B)*C/2;
    }
}
