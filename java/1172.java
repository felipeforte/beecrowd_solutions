import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int[] x = new int[10];
        for (int i=0;i<10;i++) {
            int n = entrada.nextInt();
            if (n<=0) {
                x[i] = 1;
            } else {
                x[i] = n;
            }
        }
        for (int i=0;i<x.length;i++) {
            System.out.println("X["+i+"] = "+x[i]);
        }
    }
 
}
