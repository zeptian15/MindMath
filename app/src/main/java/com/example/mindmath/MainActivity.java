package com.example.mindmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnHitungLuas, btnKalkulatorSederhana, btnKonversiSuhu, btnKalkulator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHitungLuas = findViewById(R.id.btn_hitung_luas);
        btnKalkulatorSederhana = findViewById(R.id.btn_kalkulator_sederhana);
        btnKonversiSuhu = findViewById(R.id.btn_konversi_suhu);
        btnKalkulator = findViewById(R.id.btn_kalkulator);

        btnHitungLuas.setOnClickListener(this);
        btnKalkulatorSederhana.setOnClickListener(this);
        btnKonversiSuhu.setOnClickListener(this);
        btnKalkulator.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_hitung_luas:
                Intent HitungLuas = new Intent(MainActivity.this, HitungLuas.class);
                startActivity(HitungLuas);
                break;
            case R.id.btn_kalkulator_sederhana:
                Intent KalSed = new Intent(MainActivity.this, KalkulatorSederhana.class);
                startActivity(KalSed);
                break;
            case R.id.btn_konversi_suhu:
                Intent Suhu = new Intent(MainActivity.this, KonversiSuhu.class);
                startActivity(Suhu);
                break;
            case R.id.btn_kalkulator:
                Intent Kalkulator = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(Kalkulator);
                break;
        }
    }
}
