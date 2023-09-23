public class Calculation extends  Converter{
    //Converter Computation

    public Calculation(double numTemp) {
        super.setFahrenheit(numTemp);
        super.setCelsius(numTemp);
        super.setKelvin(numTemp);
    }
    public void fahrenheitToCelsius() {
        double computation = (super.getFahrenheit() - 32) * 0.556;
        int temp = (int) computation;
        System.out.println(temp + "° celsius");
    }
    public void fahrenheitToKelvin() {
        double computation = (super.getFahrenheit() - 32) * 5 / 9 + 273.15;
        int temp = (int) computation;
        System.out.println(temp + " kelvin");
    }
    public void celsiusToFahrenheit() {
        double computation = (super.getCelsius() * 1.8) + 32;
        int temp = (int) computation;
        System.out.println(temp + "° fahrenheit");
    }
    public void celsiusToKelvin() {
        double computation = super.getCelsius() + 273.15;
        int temp = (int) computation;
        System.out.println(temp + " kelvin");
    }
    public void kelvinToFahrenheit() {
        double computation = (super.getKelvin() - 273.15) * 1.8 + 32;
        int temp = (int) computation;
        System.out.println(temp + "° fahrenheit");
    }
    public void kelvinToCelsius() {
        double computation = super.getKelvin() - 273.15;
        int temp = (int) computation;
        System.out.println(temp + "° celsius");
    }
}
