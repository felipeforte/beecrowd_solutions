import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        
        for (int i=0;i<n;i++) {
            int x = entrada.nextInt();
            if (x%2 == 0) {
                pares.add(x);
            } else {
                impares.add(x);
            }
        }
        
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);
        
        for (Integer x: pares) {
            System.out.println(x);
        }
        for (Integer x: impares) {
            System.out.println(x);
        }
    }
}
