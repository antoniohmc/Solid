package lsp.errado;

public class Fahrenheit  extends Temperatura {

    public Fahrenheit(double valor) {
        super(valor);
    }

    @Override
    public void setValor(double valor) {
        this.valor = (valor - 32) * 5/9; // Armazena como Celsius internamente
    }

    @Override
    public double getValor() {
        return (valor * 9/5) + 32; // Retorna o valor em Fahrenheit
    }
}
