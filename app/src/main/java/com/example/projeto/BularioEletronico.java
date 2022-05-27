package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class BularioEletronico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulario_eletronico);
        setTitle("Bulário Eletrônico");

        TextView linkBulario = findViewById(R.id.textView13);
        linkBulario.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltarInfo(View view) {
        finish();


    }


}