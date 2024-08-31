package dip.correto;

public class ProcessarPagamento {

   private ServicoDePagamento servico;

    public ProcessarPagamento(ServicoDePagamento servico) {
        this.servico = servico;
    }

    public void processar(double quantia) {
        servico.processarPagamento(quantia);
    }
}
