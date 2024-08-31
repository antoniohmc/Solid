package dip.errado;

public class ProcessadorDePagamento {

    private PayPalService payPalService;

    public ProcessadorDePagamento() {
        this.payPalService = new PayPalService();
    }

    public void processar(double quantia) {
        payPalService.processarPagamento(quantia);
    }
}

