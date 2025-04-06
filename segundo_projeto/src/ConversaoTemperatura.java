public class ConversaoTemperatura {

    public int temperaturaCelsius;

    // Construtor
    public ConversaoTemperatura(int temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public double converterCelsiusParaFahrenheit() {
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        return temperaturaFahrenheit;
    }

    // getters e setters
    public int getTemperaturaCelsius() {
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(int temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public String imprimirValorConversao() {
        double temperaturaFahrenheit = converterCelsiusParaFahrenheit();
        String resultado = "A temperatura em Celsius é: " + getTemperaturaCelsius() + "°C\n" +
                "A temperatura em Fahrenheit é: " + temperaturaFahrenheit + "°F";
        return resultado;
    }

}
