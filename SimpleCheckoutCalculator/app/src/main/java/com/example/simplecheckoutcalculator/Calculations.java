package com.example.simplecheckoutcalculator;

public class Calculations {
    private int hatQuant = 0;
    private int sunglassesQuant = 0;
    private int necklaceQuant = 0;
    private double subtotal = 0.0;
    private double total = 0.0;
    private double tax = 0.0;

    public int incrementHat() {
        hatQuant++;
        return hatQuant;
    }

    public int decreaseHat() {
        if (hatQuant != 0) {
            hatQuant--;
        }
        return hatQuant;
    }

    public int incrementNecklace() {
        necklaceQuant++;
        return necklaceQuant;
    }

    public int decreaseNecklace() {
        if (necklaceQuant != 0) {
            necklaceQuant--;
        }
        return necklaceQuant;
    }

    public int incrementSunglasses() {
        sunglassesQuant++;
        return sunglassesQuant;
    }

    public int decreaseSunglasses() {
        if (sunglassesQuant != 0) {
            sunglassesQuant--;
        }
        return sunglassesQuant;
    }

    public double updateTotal() {
        total = subtotal + tax;
        return total;
    }

    public double updateSubtotal() {
        subtotal = (hatQuant * 16) + (sunglassesQuant * 20) + (necklaceQuant * 25);
        return subtotal;
    }

    public double updateTax() {
        tax = subtotal * 0.13;
        return tax;
    }

}
