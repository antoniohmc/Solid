package ocp;

public class PagamentoPix implements MetodoPagamento {

    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via pix no valor de: " + valor);
    }
}
