package com.example.lodgebilling;

// The three room types and their prices per night.
// CurrencyType converts them when the user chooses a currency.
public enum RoomType {

    STANDARD("Standard", 350.0),
    DELUXE("Deluxe", 550.0),
    FAMILY("Family", 750.0);

    private final String label;
    private final double priceKwacha;

    RoomType(String label, double priceKwacha) {
        this.label = label;
        this.priceKwacha = priceKwacha;
    }

    public double getPriceKwacha() {
        return priceKwacha;
    }

    @Override
    public String toString() {
        return label;
    }
}