import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        for (int i=0;i<n;i++) {
            int x = entrada.nextInt();
            if (x==2) {
                System.out.println(x + " eh primo");
                continue;
            }
            int j = 2;
            while (j<x) {
                if (x%j == 0) {
                    System.out.println(x + " nao eh primo");
                    break;
                }
                j++;
                if (x == j) {
                    System.out.println(x + " eh primo");
                }
            }
        }
    }
 
}
