package com.example.lodgebilling;

import java.util.Locale;

// An enum is a fixed set of named choices.
public enum CurrencyType {

    ZMW("Kwacha (K)", "K", 1.0),
    USD("US Dollar ($)", "$", 25.0);

    private final String label;
    private final String symbol;
    private final double kwachaPerUnit;

    // Constructor for the enum
    CurrencyType(String label, String symbol, double kwachaPerUnit) {
        this.label = label;
        this.symbol = symbol;
        this.kwachaPerUnit = kwachaPerUnit;
    }

    public String getSymbol() {
        return symbol;
    }

    // Converts an amount in kwacha into this currency.
    // Example: 550 kwacha in USD = 550 / 25
    public double fromKwacha(double kwacha) {
        return kwacha / kwachaPerUnit;
    }

    // Turns a number into money text with 2 decimal places.
    public String format(double amount) {
        return symbol + " " + String.format(Locale.US, "%.2f", amount);
    }

    // The drop-down shows whatever toString() returns.
    @Override
    public String toString() {
        return label;
    }
}