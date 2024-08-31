package ocp.correto;

public class Main {
    public static void main(String[] args) {

        MetodoPagamento credito = new PagamentoCredito();
        Pagamento pagamentoCredito = new Pagamento(credito);
        pagamentoCredito.efetuarPagamento(100.0);

        MetodoPagamento pix = new PagamentoPix();
        Pagamento pagamentoPix = new Pagamento(pix);
        pagamentoPix.efetuarPagamento(100);
    }
}
