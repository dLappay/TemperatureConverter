# Temperature Conversion Program

A simple Java program that allows users to convert between Fahrenheit, Celsius, and Kelvin temperatures. The user selects a starting temperature unit, then chooses the unit they want to convert to, and inputs the temperature to convert.

---

## How It Works

1. The program prompts the user to select a temperature unit from **Fahrenheit (°F)**, **Celsius (°C)**, or **Kelvin (K)**.
2. Then, the user selects a target unit to convert the initial temperature to.
3. Finally, the user enters the temperature value they wish to convert.
4. The program will display the converted temperature based on the selected units.

---

## Program Flow

1. **Temperature Selection**: User selects the starting temperature unit (F, C, or K).
2. **Conversion Target Selection**: User selects the target temperature unit to convert to.
3. **Temperature Input**: User enters the temperature value.
4. **Conversion Calculation**: Using the `Calculation` class, the temperature is converted and displayed.

---

## Example Usage

**Input/Output Example 1**:
```text
Fahrenheit (°F) - F 
Celsius (°C) - C 
Kelvin (K) - K
Choose a temperature: F
Choose a temperature to convert: C
Enter a number: 98.6
98°F is approximately 37°C.
