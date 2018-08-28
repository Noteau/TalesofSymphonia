package com.example.noteau.talesofsymphonia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Codex extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codex);
        configureBackButton();
        configureKaluiganButton();
        configureLoupsButton();
        configurePretresButton();
        configureDonjonButton();
    }

    private void setInvisible() {
        TextView textView = (TextView) findViewById(R.id.text_kaluigan);
        textView.setVisibility(View.GONE);
        TextView Loup_blancs = (TextView) findViewById(R.id.text_Loup_blancs);
        Loup_blancs.setVisibility(View.GONE);
    }

    private void configureDonjonButton() {
        Button donjon = (Button) findViewById(R.id.Donjon);
        donjon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setInvisible();
                Toast.makeText(Codex.this,"Terminez le donjon pour obtenir cette entrée du codex",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void configurePretresButton() {
        Button pretres = (Button) findViewById(R.id.pretres);
        pretres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setInvisible();
                Toast.makeText(Codex.this,"Aidez les pretres pour obtenir cette entrée du codex",Toast.LENGTH_LONG).show();
            }
        });
    }

    private void configureKaluiganButton() {
        Button kaluigan = (Button) findViewById(R.id.Kaluigan);
        kaluigan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setInvisible();
                TextView textView = (TextView) findViewById(R.id.text_kaluigan);
                textView.setVisibility(View.VISIBLE);
            }
        });
    }

    private void configureLoupsButton() {
        Button loups = (Button) findViewById(R.id.Loup_blancs);
        loups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setInvisible();
                TextView textView = (TextView) findViewById(R.id.text_Loup_blancs);
                textView.setVisibility(View.VISIBLE);
            }
        });
    }

    private void configureBackButton(){
        Button codex = (Button) findViewById(R.id.Codex_back);
        codex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
    }
}
