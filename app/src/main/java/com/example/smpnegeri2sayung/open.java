package com.example.smpnegeri2sayung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class open extends AppCompatActivity {

    ImageView ivprofil, ivvisi, ivgaleri, ivsarana, ivguru, ivekstra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        ivprofil = findViewById(R.id.iv_profil);
        ivprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(open.this, profil.class);
                startActivity(intent);
            }
        });

        ivvisi = findViewById(R.id.iv_visi);
        ivvisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(open.this, visi_misi.class);
                startActivity(intent);
            }
        });

        ivgaleri = findViewById(R.id.iv_galeri);
        ivgaleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(open.this, galeri.class);
                startActivity(intent);
            }
        });

        ivsarana = findViewById(R.id.iv_sarana);
        ivsarana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(open.this, sarana.class);
                startActivity(intent);
            }
        });

        ivguru = findViewById(R.id.iv_guru);
        ivguru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(open.this, guru_staff.class);
                startActivity(intent);
            }
        });

        ivekstra = findViewById(R.id.iv_ekstra);
        ivekstra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(open.this, ekstrakulikuler.class);
                startActivity(intent);
            }
        });
    }
}