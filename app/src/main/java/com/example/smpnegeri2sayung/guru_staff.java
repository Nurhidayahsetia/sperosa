package com.example.smpnegeri2sayung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class guru_staff extends AppCompatActivity {

    ImageView ivteacher, ivstaff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru_staff);

        ivteacher = findViewById(R.id.iv_teacher);
        ivteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guru_staff.this, guru.class);
                startActivity(intent);
            }
        });

        ivstaff = findViewById(R.id.iv_staff);
        ivstaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guru_staff.this, staff.class);
                startActivity(intent);
            }
        });
    }
}