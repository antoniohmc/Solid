package lsp.errado;

public class Temperatura {

    protected double valor;

    public Temperatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double toCelsius() {
        return valor;
    }

    public double toFahrenheit() {
        return (valor * 9/5) + 32;
    }

}
