import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        Conduite conduite = new Conduite();
        for (int i=0;i<n;i++) {
            int r1 = entrada.nextInt();
            int r2 = entrada.nextInt();
            conduite.setCabos(r1,r2);
            conduite.getMenorConduite();
        }
    }
 
}
class Conduite {
    private int r1;
    private int r2;
    
    void setCabos(int n1, int n2) {
        this.r1 = n1;
        this.r2 = n2;
    }
    String getCabos() {
        return (this.r1+ " "+this.r2);
    }
    void getMenorConduite() {
        System.out.println((r1+r2));
    }
}
