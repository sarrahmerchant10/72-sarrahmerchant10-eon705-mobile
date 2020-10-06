package com.example.simplecheckoutcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context;
    Calculations calculations = new Calculations();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

    }

    public void increaseItemQuantity(View v) {
        TextView hatQuantity = findViewById(R.id.hat_quantity);
        TextView sunglassesQuantity = findViewById(R.id.sunglasses_quantity);
        TextView necklaceQuantity = findViewById(R.id.necklace_quantity);
        switch (v.getId()) {
            case R.id.hat_increase:
                int hatsInc = calculations.incrementHat();
                hatQuantity.setText(String.valueOf(hatsInc));
                break;
            case R.id.hat_decrease:
                int hatsDec = calculations.decreaseHat();
                hatQuantity.setText(String.valueOf(hatsDec));
                break;
            case R.id.sunglasses_increase:
                int sunglassesInc = calculations.incrementSunglasses();
                sunglassesQuantity.setText(String.valueOf(sunglassesInc));
                break;
            case R.id.sunglasses_decrease:
                int sunglassesDec = calculations.decreaseSunglasses();
                sunglassesQuantity.setText(String.valueOf(sunglassesDec));
                break;
            case R.id.necklace_increase:
                int necklaceInc = calculations.incrementNecklace();
                necklaceQuantity.setText(String.valueOf(necklaceInc));
                break;
            case R.id.necklace_decrease:
                int necklaceDec = calculations.decreaseNecklace();
                necklaceQuantity.setText(String.valueOf(necklaceDec));
                break;
        }
        updateTotal();
    }

    public void updateTotal() {
        TextView totalV = findViewById(R.id.total);

        updateSubTotal();
        updateTax();
        double total = calculations.updateTotal();
        totalV.setText(String.valueOf(total));
        // deal with discount code if necessary
    }

    private void updateSubTotal() {
        TextView subtotalV = findViewById(R.id.subtotal);
        double subtotal = calculations.updateSubtotal();
        subtotalV.setText(String.valueOf(subtotal));
    }
    private void updateTax() {
        TextView taxV = findViewById(R.id.tax);
        double tax = calculations.updateTax();
        taxV.setText(String.valueOf(tax));
    }
}