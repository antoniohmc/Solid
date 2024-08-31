public class MetodoDePagamento {

    public void efetuarPagamento(String tipo, double valor) {
        if (tipo.equals("cartaoCredito")){
            System.out.println("Processando pagamento com cartão de crédito no valor de: " + valor);
        }
    }
}
