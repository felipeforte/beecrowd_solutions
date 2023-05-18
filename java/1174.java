import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        double[] a = new double[100];
        for (int i=0;i<a.length;i++) {
            a[i] = entrada.nextDouble();
        }
        for (int i=0;i<a.length;i++) {
            if (a[i]<=10) {
                System.out.printf("A[%d] = %.1f\n",i,a[i]);
            }
        }
    }
 
}
