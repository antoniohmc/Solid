package srp;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<String> compras;
    private double precoTotal;

    public CarrinhoDeCompras(List<String> compras, double precoTotal) {
        this.compras = new ArrayList<>();
        this.precoTotal = precoTotal;
    }

    public void adicionarCompra(String item, double preco) {
        compras.add(item);
        precoTotal += preco;
    }

    public void removerCompras(String item, double preco) {
        compras.remove(item);
        precoTotal -= preco;
    }

    public List<String> getCompras() {
        return compras;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }
}
