import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[20];
        
        for (int i=0;i<n.length;i++) {
            n[i] = entrada.nextInt();
        }

        for (int i=0;i<10;i++) {
            int aux = n[i];
            n[i] = n[19-i];
            n[19-i] = aux;
        }
        
        for (int i=0;i<n.length;i++) {
            System.out.println("N["+i+"] = "+n[i]);
        }
    }
 
}
