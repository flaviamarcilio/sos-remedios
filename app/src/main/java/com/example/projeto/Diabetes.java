package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Diabetes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);
        setTitle("Diabetes");

        TextView linkDiabetes = findViewById(R.id.textView6);
        linkDiabetes.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void voltaTipoRemedio(View view) {
        finish();
    }
}