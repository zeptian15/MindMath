package com.example.mindmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KonversiSuhu extends AppCompatActivity implements View.OnClickListener{

    private EditText edtCelcius, edtKelvin, edtReamur, edtFahrenheit;
    private Double Celcius, Kelvin, Reamur, Fahrenheit;
    private Button btnKonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);
        // Set Action Bar
        getSupportActionBar().setTitle("Konversi Suhu");

        edtCelcius = findViewById(R.id.edt_celcius);
        edtKelvin = findViewById(R.id.edt_kelvin);
        edtReamur = findViewById(R.id.edt_reamur);
        edtFahrenheit = findViewById(R.id.edt_fahrenheit);

        btnKonversi = findViewById(R.id.btn_konversi);
        btnKonversi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Celcius = Double.parseDouble(edtCelcius.getText().toString());

        Kelvin = Celcius + 273.15;
        Fahrenheit = Celcius * 1.8 + 32;
        Reamur = Celcius * 0.8;

        edtKelvin.setText(String.valueOf(Kelvin));
        edtReamur.setText(String.valueOf(Reamur));
        edtFahrenheit.setText(String.valueOf(Fahrenheit));
    }
}
