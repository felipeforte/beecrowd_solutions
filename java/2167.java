import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int medidas = entrada.nextInt();
        Motor m;
        Medidas med = new Medidas();
        
        for (int i=0;i<medidas;i++) {
            m = new Motor();
            m.setRPM(entrada.nextInt());
            med.adiciona(m);
        }
        System.out.println(med.retornaIndice());
    }
 
}
class Motor {
    private int rpm;
    
    public void setRPM(int rpm) {
        this.rpm = rpm;
    }
    
    public int getRPM() {
        return rpm;
    }
}


class Medidas {
    private ArrayList<Motor> lista = new ArrayList<>();
    
    public void adiciona(Motor m) {
        lista.add(m);
    }
    
    public int retornaIndice() {
        for (int i = 1;i<lista.size();i++) {
            if (lista.get(i-1).getRPM()>lista.get(i).getRPM()) {
                return i+1;
            }
        }
        return 0;
    }
}
