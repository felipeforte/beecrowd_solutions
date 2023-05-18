import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int codigo = entrada.nextInt();
        int quantidade = entrada.nextInt();
        Item[] itens = new Item[5];
        
        itens[0] = new Item(1,"Cachorro quente",4.00);
        itens[1] = new Item(2,"X-Salada",4.50);
        itens[2] = new Item(3,"X-Bacon",5.00);
        itens[3] = new Item(4,"Torrada simples",2.00);
        itens[4] = new Item(5,"Refrigerante",1.50);
        
        for (int i=0;i<itens.length;i++) {
            if (codigo == itens[i].getCodigo()) {
                Pedido pedido = new Pedido(itens[i],quantidade);
                pedido.calcularPedido();
            }
        }
    }
 
}
class Item {
    private double valor;
    private int codigo;
    private String nome;
    
    void setValor(double valor) {
        this.valor = valor;
    }
    void setCodigo(int cod) {
        this.codigo = cod;
    }
    
    double getValor() {
        return this.valor;
    }
    int getCodigo() {
        return this.codigo;
    }
    
    public Item(int codigo, String nome, double valor) {
        this.valor = valor;
        this.codigo = codigo;
        this.nome = nome;
    }
}
class Pedido {
    private Item item;
    private int quantidade;

    void setItem(Item item) {
        this.item = item;
    }
    void setQuantidade(int quant) {
        this.quantidade = quant;
    }
    
    void calcularPedido() {
        double total = this.item.getValor() * this.quantidade;
        System.out.printf("Total: R$ %.2f\n",total);
    }
    public Pedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }
}
