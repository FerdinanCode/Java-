package com.example.hitungnilaimahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
    public class MainActivity extends AppCompatActivity {

        private EditText ednama, ednim, edNilai1, edNilai2, edNilai3;
        private TextView tvHasil;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Inisialisasi view
            ednama = findViewById(R.id.ednama);
            ednim = findViewById(R.id.ednim);
            edNilai1 = findViewById(R.id.edNilai1);
            edNilai2 = findViewById(R.id.edNilai2);
            edNilai3 = findViewById(R.id.edNilai3);
            tvHasil = findViewById(R.id.button_hitung);
        }

        // Metode untuk menghitung nilai
        public void hitungNilai(View view) {
            double nilai1 = Double.parseDouble(edNilai1.getText().toString());
            double nilai2 = Double.parseDouble(edNilai2.getText().toString());
            double nilai3 = Double.parseDouble(edNilai3.getText().toString());

            double rataRata = (nilai1 + nilai2 + nilai3 ) / 3;

            tvHasil.setText(String.format("Rata-rata nilai: %.2f", rataRata));
        }
    }