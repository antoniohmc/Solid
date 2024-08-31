package lsp.correto;

public class TemperaturaFahrenheit implements ConversorTemperatura {

    private double valor;

    public TemperaturaFahrenheit(double valor) {
        this.valor = valor;
    }

    @Override
    public double toCelsius() {
        return (valor - 32) * 5 / 9;
    }

    @Override
    public double toFahrenheit() {
        return valor;
    }
}

