package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PrimeirosSocorros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiros_socorros);
        setTitle("Primeiros Socorros");

        TextView linkPrimeirosSocorros = findViewById(R.id.textView99);
        linkPrimeirosSocorros.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltaTipoRemedio(View view) {
        finish();
    }
}