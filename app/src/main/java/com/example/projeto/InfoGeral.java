package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoGeral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_geral);
        setTitle("Informações Gerais");
    }

    public void descarteMed(View view) {
        Intent descarteMed = new Intent(this, DescarteMed.class);
        startActivity(descarteMed);
    }

    public void bularioEletronico(View view) {
        Intent bularioEletronico = new Intent(this, BularioEletronico.class);
        startActivity(bularioEletronico);
    }

    public void medGenericos(View view) {
        Intent medGenericos = new Intent(this, MedGenericos.class);
        startActivity(medGenericos);
    }

    public void cuidadosGerais(View view) {
        Intent cuidadosGerais = new Intent(this, CuidadosGerais.class);
        startActivity(cuidadosGerais);
    }

    public void voltaInicio(View view) {
        finish();
    }
}