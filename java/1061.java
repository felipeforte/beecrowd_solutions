import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] linha = sc.nextLine().split(" ");
        int d1 = Integer.parseInt(linha[1]);
        linha = sc.nextLine().split(" : ");
        int h1 = Integer.parseInt(linha[0]);
        int m1 = Integer.parseInt(linha[1]);
        int s1 = Integer.parseInt(linha[2]);
        linha = sc.nextLine().split(" ");
        int d2 = Integer.parseInt(linha[1]);
        linha = sc.nextLine().split(" : ");
        int h2 = Integer.parseInt(linha[0]);
        int m2 = Integer.parseInt(linha[1]);
        int s2 = Integer.parseInt(linha[2]);

        int dfinal = d2-d1;
        int hfinal = h2-h1;
        int mfinal = m2-m1;
        int sfinal = s2-s1;
        
        if (s2<s1 || sfinal < 0) {
            mfinal -= 1;
            sfinal += 60;
        }
        if (m2<m1 || mfinal < 0) {
            hfinal -= 1;
            mfinal += 60;
        }
        if (h2<h1 || hfinal < 0) {
            dfinal -= 1;
            hfinal += 24;
        }
        System.out.println(dfinal + " dia(s)");
        System.out.println(hfinal + " hora(s)");
        System.out.println(mfinal + " minuto(s)");
        System.out.println(sfinal + " segundo(s)");
    }
}
