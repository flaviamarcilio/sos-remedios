package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PressaoAlta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressao_alta);
        setTitle("Pressão Alta");

        TextView linkPressaoAlta = findViewById(R.id.textView7);
        linkPressaoAlta.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltaTipoRemedio(View view) {
        finish();
    }
}