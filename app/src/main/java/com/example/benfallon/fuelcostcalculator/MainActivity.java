package com.example.benfallon.fuelcostcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateFuelCost(View view) {

        EditText gallonPriceEditText = (EditText) findViewById(R.id.gallonPriceEditText);
        double gallonPrice = Double.parseDouble(gallonPriceEditText.getText().toString());

        EditText milesTraveledEditText = (EditText) findViewById(R.id.milesTraveledEditText);
        double milesTraveled = Double.parseDouble(milesTraveledEditText.getText().toString());

        EditText mpgEditText = (EditText) findViewById(R.id.mpgEditText);
        double mpg = Double.parseDouble(mpgEditText.getText().toString());

        double fuelCost = (gallonPrice * milesTraveled) / mpg;

        TextView mpgTextView = (TextView) findViewById(R.id.fuelCostTextView);
        mpgTextView.setText(Double.toString(fuelCost));

    }


}
