package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Vitaminas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitaminas);
        setTitle("Vitaminas");

        TextView linkVitamina = findViewById(R.id.textLinkVitamina);

        // method to redirect to provided link
        linkVitamina.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltaTipoRemedio(View view) {
        finish();
    }
}