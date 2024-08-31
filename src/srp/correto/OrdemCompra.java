package srp.correto;

public class OrdemCompra {

    public void ordemDeCompra(CarrinhoDeCompras carrinho) {
        System.out.println("Compras: ");
        for (String item : carrinho.getCompras()) {

        }
        System.out.println("Valor total: " + carrinho.getPrecoTotal());
    }
}
