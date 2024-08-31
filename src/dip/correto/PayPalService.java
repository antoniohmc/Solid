package dip.correto;

public class PayPalService implements ServicoDePagamento {
    @Override
    public void processarPagamento(double quantia) {
        System.out.println("Processado pagamento de " + quantia + " via PayPal");
    }
}
