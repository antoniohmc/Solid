package srp.errado;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<String> compras;
    private double precoTotal;

    public CarrinhoDeCompras(List<String> compras, double precoCompras) {
        this.compras = new ArrayList<>();
        this.precoTotal = 0.0;
    }

    public void adicionarCompras(String item, double preco) {
        compras.add(item);
        precoTotal += preco;
    }

    public void removeCompra(String item, double preco) {
        compras.remove(item);
        precoTotal -= preco;
    }

    public void ordemCompra() {
        System.out.println("Compras:");
        for (String item : compras) {
            System.out.println(item);
        }
        System.out.println("Preço total: " + precoTotal);
    }


}