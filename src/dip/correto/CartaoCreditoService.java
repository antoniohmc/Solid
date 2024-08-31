package dip.correto;

public class CartaoCreditoService implements ServicoDePagamento {

    @Override
    public void processarPagamento(double quantia) {
        System.out.println("Processando pagamento de " + quantia + " via Cartao de Crédito.");
    }
}
