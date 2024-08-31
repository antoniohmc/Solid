package ocp.correto;

public class PagamentoCredito implements MetodoPagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento com cartão de crédito no valor de: " + valor);
    }
}
