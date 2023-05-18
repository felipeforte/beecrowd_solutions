import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        double S = 0;
        double denominador = 1;
        for (double i=1;i<=39;i+=2) {
            S += (i/denominador);
            denominador *= 2;
        }
        System.out.printf("%.2f\n",S);
    }
 
}
