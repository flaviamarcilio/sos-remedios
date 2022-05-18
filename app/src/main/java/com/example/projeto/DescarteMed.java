package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class DescarteMed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descarte_med);
        setTitle("Descarte de Medicamentos");

        TextView linkDescarte = findViewById(R.id.textFonteDescarte);
        linkDescarte.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkDescarte2 = findViewById(R.id.textFonteDescarte2);
        linkDescarte2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltarInfo(View view) {
        finish();
    }
}