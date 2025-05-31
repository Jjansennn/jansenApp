package com.example.jansenapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KalkulatorActivity extends AppCompatActivity {
    Button btnTambah, btnKali, btnBagi;
    EditText edtA, edtB;
    TextView txvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kalkulator);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnTambah = findViewById(R.id.btnTambah);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        txvHasil= findViewById(R.id.txvHasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Menampilkan hasil di txvHasil
                Number a = Integer.parseInt(edtA.getText().toString());
                Number b = Integer.parseInt(edtB.getText().toString());
                Number hasil = a.intValue() + b.intValue();
                txvHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Menampilkan hasil di txvHasil
                Number a = Integer.parseInt(edtA.getText().toString());
                Number b = Integer.parseInt(edtB.getText().toString());
                Number hasil = a.intValue() * b.intValue();
                txvHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Menampilkan hasil di txvHasil
                Number a = Integer.parseInt(edtA.getText().toString());
                Number b = Integer.parseInt(edtB.getText().toString());
                Number hasil = a.intValue() / b.intValue();
                txvHasil.setText(String.valueOf(hasil));
            }
        });
    }
}