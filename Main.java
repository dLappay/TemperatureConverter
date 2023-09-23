import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Choose a temperature
        System.out.println("Fahrenheit (°F) - F \nCelsius (°C) - C \nKelvin (K) - K");
        System.out.print("Choose a temperature: ");
        char chooseTemp = input.next().charAt(0);

        // Choose a temperature to convert
        System.out.print("Choose a temperature to convert: ");
        char tempToConvert = input.next().charAt(0);

        // Enter a Temperature
        System.out.print("Enter a number: ");
        double numTemp = input.nextDouble();

        Calculation calculation = new Calculation(numTemp);

        if (chooseTemp == 'f' || chooseTemp == 'F') {
            if (tempToConvert == 'c' || tempToConvert == 'C') {
                int fahrenheitTemp = (int) calculation.getFahrenheit();
                System.out.print(fahrenheitTemp + "° fahrenheit is ");
                calculation.fahrenheitToCelsius();
            } else if (tempToConvert == 'k' || tempToConvert == 'K') {
                int fahrenheitTemp = (int) calculation.getFahrenheit();
                System.out.print(fahrenheitTemp + "° fahrenheit is ");
                calculation.fahrenheitToKelvin();
            } 
        } else if (chooseTemp == 'c' || chooseTemp == 'C') {
            if (tempToConvert == 'f' || tempToConvert == 'F') {
                int celsiusTemp = (int) calculation.getCelsius();
                System.out.print(celsiusTemp + "° celsius is ");
                calculation.celsiusToFahrenheit();
            } else if (tempToConvert == 'k' || tempToConvert == 'K') {
                int celsiusTemp = (int) calculation.getCelsius();
                System.out.print(celsiusTemp + "° celsius is ");
                calculation.celsiusToKelvin();
            }
        } else if (chooseTemp == 'k' || chooseTemp == 'K') {
            if (tempToConvert == 'f' || tempToConvert == 'F') {
                int kelvinTemp = (int) calculation.getKelvin();
                System.out.print(kelvinTemp + " kelvin ");
                calculation.kelvinToFahrenheit();
            } else if (tempToConvert == 'c' || tempToConvert == 'C') {
                int kelvinTemp = (int) calculation.getKelvin();
                System.out.print(kelvinTemp + " kelvin ");
                calculation.kelvinToCelsius();
            }
        }
    }
}