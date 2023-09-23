public class Converter {
    private double fahrenheit;
    private double celsius;
    private double kelvin;

    //Constructor
    public Converter() {
        fahrenheit = 0;
        celsius = 0;
        kelvin = 0;
    }

    //Setter and Getter
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double getFahrenheit() {
        return fahrenheit;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getCelsius() {
        return celsius;
    }
    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    public double getKelvin() {
        return kelvin;
    }
}
