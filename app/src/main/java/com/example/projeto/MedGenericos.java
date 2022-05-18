package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MedGenericos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_genericos);
        setTitle("Medicamentos Genéricos");

        TextView linkGenerico = findViewById(R.id.textFonteGenerico);
        linkGenerico.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltarInfo(View view) {
        finish();
    }
}