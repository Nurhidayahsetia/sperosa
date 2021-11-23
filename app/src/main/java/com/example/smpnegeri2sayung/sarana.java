package com.example.smpnegeri2sayung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sarana extends AppCompatActivity {

    Button rk, perpus, mushola, koperasi, ipa, komputer, km;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarana);

        rk = findViewById(R.id.rk);
        rk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, ruang_kelas.class);
                startActivity(intent);
            }
        });

        perpus = findViewById(R.id.perpus);
        perpus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, perpustakaan.class);
                startActivity(intent);
            }
        });

        mushola = findViewById(R.id.mushola);
        mushola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, mushola.class);
                startActivity(intent);
            }
        });

        koperasi = findViewById(R.id.koperasi);
        koperasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, koperasi.class);
                startActivity(intent);
            }
        });

        ipa = findViewById(R.id.ipa);
        ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, lab_ipa.class);
                startActivity(intent);
            }
        });

        komputer = findViewById(R.id.komputer);
        komputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, lab_komputer.class);
                startActivity(intent);
            }
        });

        km = findViewById(R.id.km);
        km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sarana.this, kamar_mandi.class);
                startActivity(intent);
            }
        });
    }
}