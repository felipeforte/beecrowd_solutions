import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        Login log = new Login();
        int senha = entrada.nextInt();
        while (senha != log.getSenha()) {
            System.out.println("Senha Invalida");
            senha = entrada.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}

class Login {
    private int senha = 2002;
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public int getSenha() {
        return senha;
    }
}
