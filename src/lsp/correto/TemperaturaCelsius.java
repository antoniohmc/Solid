package lsp.correto;

public class TemperaturaCelsius implements ConversorTemperatura {
    private double valor;

    public TemperaturaCelsius(double valor) {
        this.valor = valor;
    }

    @Override
    public double toCelsius() {
        return valor;
    }

    @Override
    public double toFahrenheit() {
        return (valor * 9/5) + 32;
    }
}