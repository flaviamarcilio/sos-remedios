package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();           // remove a barra de título
    }

    public void tipoRemedio(View view) {
        Intent telaRemedio = new Intent(this, TipoRemedio.class);
        startActivity(telaRemedio);
    }

    public void infoGeral(View view) {
        Intent infoGeral = new Intent(this, InfoGeral.class);
        startActivity(infoGeral);
    }

    public void sobre(View view) {
        Intent sobre = new Intent(this, Sobre.class);
        startActivity(sobre);
    }

    public void sair() {
        finish();
    }
}