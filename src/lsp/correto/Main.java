package lsp.correto;

public class Main {
    public static void main(String[] args) {
        ConversorTemperatura tempCelsius = new TemperaturaCelsius(25);
        System.out.println("Temperatura em Celsius: " + tempCelsius.toCelsius()); // 25.0
        System.out.println("Temperatura em Fahrenheit: " + tempCelsius.toFahrenheit()); // 77.0

        ConversorTemperatura tempFahrenheit = new TemperaturaFahrenheit(77);
        System.out.println("Temperatura em Celsius: " + tempFahrenheit.toCelsius()); // 25.0
        System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit.toFahrenheit()); // 77.0
    }
}
