package lsp.errado;

public class Main {
    public static void main(String[] args) {
        Temperatura tempCelsius = new Temperatura(25);
        System.out.println("Temperatura em Celsius: " + tempCelsius.getValor()); // 25.0
        System.out.println("Temperatura em Fahrenheit: " + tempCelsius.toFahrenheit()); // 77.0

        Temperatura tempFahrenheit = new Fahrenheit(77);
        System.out.println("Temperatura em Celsius: " + tempFahrenheit.getValor()); // Esperado: 25.0, mas retorna 77.0
    }
}
