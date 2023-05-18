import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        int v = entrada.nextInt();
        for (int i=0;i<n.length;i++) {
            if (i==0) {
                n[i] = v;
            } else {
                n[i] = n[i-1]*2;
            }
        }
        for (int i=0;i<n.length;i++) {
            System.out.println("N["+i+"] = "+n[i]);
        }
    }
 
}
