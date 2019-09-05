package com.example.mindmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KalkulatorSederhana extends AppCompatActivity implements View.OnClickListener{

    private EditText edtPertama, edtKedua, edtHasil;
    private Button btnTambah, btnKurang, btnKali, btnBagi;

    protected float angka_pertama, angka_kedua, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_sederhana);
        // Set Action Bar
        getSupportActionBar().setTitle("Kalkulator Sederhana");

        edtPertama = findViewById(R.id.angka_pertama);
        edtKedua = findViewById(R.id.angka_kedua);
        edtHasil = findViewById(R.id.angka_hasil);

        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi = findViewById(R.id.btn_bagi);

        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        angka_pertama = Float.parseFloat(edtPertama.getText().toString());
        angka_kedua = Float.parseFloat(edtKedua.getText().toString());

        switch (view.getId()){
            case R.id.btn_tambah:
                hasil = angka_pertama + angka_kedua;
                edtHasil.setText(Float.toString(hasil));
                break;
            case R.id.btn_kurang:
                hasil = angka_pertama - angka_kedua;
                edtHasil.setText(Float.toString(hasil));
                break;
            case R.id.btn_kali:
                hasil = angka_pertama *angka_kedua;
                edtHasil.setText(Float.toString(hasil));
                break;
            case R.id.btn_bagi:
                hasil = angka_pertama / angka_kedua;
                edtHasil.setText(Float.toString(hasil));
                break;
        }
    }
}
