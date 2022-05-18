package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Analgesicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analgesicos);
        setTitle("Analgésicos x Anti-inflamatórios");

        TextView linkFonteAnti = findViewById(R.id.textFonteAnti);
        linkFonteAnti.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkFonteAnti2 = findViewById(R.id.textFonteAnti2);
        linkFonteAnti2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltaTipoRemedio(View view) {
        finish();
    }
}