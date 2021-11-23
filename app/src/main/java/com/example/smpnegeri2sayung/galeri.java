package com.example.smpnegeri2sayung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class galeri extends AppCompatActivity {

    androidx.cardview.widget.CardView keagamaan, guruu, out, ultah, wasana, lain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        keagamaan = findViewById(R.id.keagamaan);
        keagamaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(galeri.this, keagamaan.class);
                startActivity(intent);
            }
        });

        guruu = findViewById(R.id.guruu);
        guruu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(galeri.this, teacher.class);
                startActivity(intent);
            }
        });

       out = findViewById(R.id.out);
       out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(galeri.this, out.class);
                startActivity(intent);
            }
        });

        ultah = findViewById(R.id.ultah);
        ultah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(galeri.this, ultah.class);
                startActivity(intent);
            }
        });

        wasana = findViewById(R.id.wasana);
        wasana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(galeri.this, wasana.class);
                startActivity(intent);
            }
        });

       lain = findViewById(R.id.lain);
       lain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(galeri.this, lain.class);
                startActivity(intent);
            }
        });
    }
}