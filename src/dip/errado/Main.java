package dip.errado;

public class Main {
    public static void main(String[] args) {
        ProcessadorDePagamento processador = new ProcessadorDePagamento();
        processador.processar(100.0);
    }
}

