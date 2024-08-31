package ocp;

public class Pagamento {
    MetodoPagamento metodoPagamento;

    public Pagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void efetuarPagamento(double valor) {
        metodoPagamento.processar(valor);
    }
}
