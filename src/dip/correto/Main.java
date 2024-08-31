package dip.correto;

public class Main {
    public static void main(String[] args) {
        CartaoCreditoService cartao = new CartaoCreditoService();
        ProcessarPagamento processadorCartao = new ProcessarPagamento(cartao);
        processadorCartao.processar(100);

        PayPalService payPal = new PayPalService();
        ProcessarPagamento processadorPaypal = new ProcessarPagamento(payPal);
        processadorPaypal.processar(100);
    }
}
