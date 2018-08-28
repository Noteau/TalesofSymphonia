package com.example.noteau.talesofsymphonia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Classe_selection extends  AppCompatActivity {
        private int classe_int = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.classe_selection);
            configureBackButton();
            configureWarriorButton();
            configureDiplomateButton();
            configureSurvieButton();
            configureChasseurButton();
            configureMageButton();
        }

    private void configureBackButton() {
        Button Back_bt = findViewById(R.id.back);
        Back_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureWarriorButton() {
        final Button Warrior_bt = findViewById(R.id.warrior);
        Warrior_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (classe_int == 0) {
                    classe_int = 1;
                    Warrior_bt.setBackgroundColor(0xFFff3300);
                    Toast.makeText(Classe_selection.this,"Vous avez choisi la classe de Guerrier !\nLe combat est votre quotidien et vous vous laissez entrainer dans le chaos des combats.\nVotre résistance est devenue bien supérieur à celle de vos congénères\n(Réduit de un tous les dégats subis)",Toast.LENGTH_LONG).show();
                }
                else if (classe_int == 1){
                    Toast.makeText(Classe_selection.this,"Vous avez choisi la classe de Guerrier !\nLe combat est votre quotidien et vous vous laissez entrainer dans le chaos des combats.\nVotre résistance est devenue bien supérieur à celle de vos congénères\n(Réduit de un tous les dégats subis)",Toast.LENGTH_LONG).show();
                }
                else if (classe_int == 2){
                    Toast.makeText(Classe_selection.this,"Vous avez déjà choisi la classe de Diplomate.",Toast.LENGTH_LONG).show();

                }
                else if (classe_int == 3){
                    Toast.makeText(Classe_selection.this,"Vous avez déjà choisi la classe de Survivant.",Toast.LENGTH_LONG).show();

                }
            }

        });
    }
    private void configureDiplomateButton() {
        final Button Dilplomate_bt = findViewById(R.id.diplomate);
        Dilplomate_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (classe_int == 0) {
                classe_int = 2;
                Dilplomate_bt.setBackgroundColor(0xFF33cc33);
                Toast.makeText(Classe_selection.this,"Vous avez choisi la classe de Diplomate !\nVous savez vous sortir des situations dangereuses par votre argumentation raisonné et votre charisme.\nVous instillez le doute dans le coeur de vos ennemis. Se battent-ils pour la bonne cause ?\n(Les ennemis annulent parfois leurs attaques sous l'effet du doute)",Toast.LENGTH_LONG).show();
                }
            else if (classe_int == 1){
                Toast.makeText(Classe_selection.this,"Vous avez déjà choisi la classe de Guerrier.",Toast.LENGTH_LONG).show();
                }
            else if (classe_int == 2){
                Toast.makeText(Classe_selection.this,"Vous avez choisi la classe de Diplomate !\nVous savez vous sortir des situations dangereuses par votre argumentation raisonné et votre charisme.\nVous instillez le doute dans le coeur de vos ennemis. Se battent-ils pour la bonne cause ?\n(Les ennemis annulent parfois leurs attaques sous l'effet du doute).",Toast.LENGTH_LONG).show();
                }
            else if (classe_int == 3){
                Toast.makeText(Classe_selection.this,"Vous avez déjà choisi la classe de Survivant.",Toast.LENGTH_LONG).show();
                }
            }
            });
        }


    private void configureSurvieButton() {
        final Button Survie_bt = findViewById(R.id.survie);
        Survie_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (classe_int == 0) {
                    classe_int = 3;
                    Survie_bt.setBackgroundColor(0xFF0000ff);
                    Toast.makeText(Classe_selection.this,"Vous avez choisi la classe de Survivant !\nVous avez traversé des contrées hostile à toute vie, survécu à des catastrophes et su esquiver les conflits.\nVos années d'errance vous ont appris à vous méfier de tout et surtout d'être toujours sur vos gardes.\n(Grave à vos réflexes bien supérieur à la moyenne vous pouvez parfois réaliser une esquive au lieu de subir un coup/un piége)",Toast.LENGTH_LONG).show();
                }
                else if (classe_int == 1){
                    Toast.makeText(Classe_selection.this,"Vous avez déjà choisi la classe de Guerrier.",Toast.LENGTH_LONG).show();
                }
                else if (classe_int == 2){
                    Toast.makeText(Classe_selection.this,"Vous avez déjà choisi la classe de Diplomate.",Toast.LENGTH_LONG).show();
                }
                else if (classe_int == 3){
                    Toast.makeText(Classe_selection.this,"Vous avez choisi la classe de Survivant !\nVous avez traversé des contrées hostile à toute vie, survécu à des catastrophes et su esquiver les conflits.\nVos années d'errance vous ont appris à vous méfier de tout et surtout d'être toujours sur vos gardes.\n(Grave à vos réflexes bien supérieur à la moyenne vous pouvez parfois réaliser une esquive au lieu de subir un coup/un piége)",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


    private void configureChasseurButton() {
        Button Chasseur_bt = findViewById(R.id.chasseur);
        Chasseur_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Classe_selection.this,"La classe de chasseur n'est pas encore disponible dans le jeu",Toast.LENGTH_LONG).show();
            }
        });
    }


    private void configureMageButton() {
        Button Mage_bt = findViewById(R.id.mage);
        Mage_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Classe_selection.this,"La classe de mage n'est pas encore disponible dans le jeu",Toast.LENGTH_LONG).show();
            }
        });
    }



}


