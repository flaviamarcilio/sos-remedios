package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class CuidadosGerais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuidados_gerais);
        setTitle("Cuidados Gerais");

        TextView linkCuidados = findViewById(R.id.textView11);

        // method to redirect to provided link
        linkCuidados.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltarInfo(View view) {
        finish();
    }
}