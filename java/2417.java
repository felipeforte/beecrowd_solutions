import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int vc = entrada.nextInt();
        int ec = entrada.nextInt();
        int sc = entrada.nextInt();
        
        int vf = entrada.nextInt();
        int ef = entrada.nextInt();
        int sf = entrada.nextInt();
        
        Time cormengo = new Time(vc,ec,sc);
        Time flaminthians = new Time(vf,ef,sf);
        Classificacao clf = new Classificacao(cormengo,flaminthians);
        
        System.out.println(clf.getClassif());
    }
 
}

class Time {
    int vitorias;
    int empates;
    int saldo;
    int pontos;
    
    void setVitorias(int valor) {
        this.vitorias = valor;
    }
    void setEmpates(int valor) {
        this.empates = valor;
    }
    void setSaldo(int valor) {
        this.saldo = valor;
    }
    
    int getVitorias(int valor) {
        return this.vitorias;
    }
    int getEmpates(int valor) {
        return this.empates;
    }
    int getSaldo(int valor) {
        return this.saldo;
    }
    
    public Time(int vitorias, int empates, int saldo) {
        this.vitorias = vitorias;
        this.empates = empates;
        this.saldo = saldo;
        this.pontos = (this.vitorias*3)+this.empates;
    }
}

class Classificacao {
    Time time1;
    Time time2;
    
    String getClassif() {
        if (time1.pontos > time2.pontos) {
            return "C";
        } else if (time1.pontos < time2.pontos) {
            return "F";
        } else {
            if (time1.saldo > time2.saldo) {
                return "C";
            } else if (time1.saldo < time2.saldo) {
                return "F";
            } else {
                return "=";
            }
        }
    }
    public Classificacao(Time time1,Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }
}
