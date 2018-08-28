package com.example.noteau.talesofsymphonia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class Inventaire   extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventaire);

        final GridView gridView = (GridView)findViewById(R.id.list_inventaire);

        Item_game Arc = new Item_game("Arc elfique de ranger",20,"Cet arc bien qu'ancien a toujours su vous tirer des situations les plus complexes");
        Item_game Anneau = new Item_game("Anneau doré",13,"Cet anneau est un des derniers souvenirs de votre anciennes vie");
        Item_game Dague = new Item_game("Dague classique",4,"Vous l'avez recupéré sur le cadavre des derniers roublards qui ont tenté de vous surprendre");
        Item_game Potion = new Item_game("Potion",10,"Le marchand qui vous l'a fourni vous a assuré qu'elle pouvait guérir tous les maux cependant sa couleur rouge vive vous dissuade de l'utiliser maintenant");
        Item_game Carte = new Item_game("Carte",0,"Carte du monde connu");
        Item_game[] items = new Item_game[]{Arc,Anneau,Dague,Potion,Carte};

        ArrayAdapter<Item_game> arrayAdapter = new ArrayAdapter<Item_game>(this, android.R.layout.simple_list_item_1,items);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                Item_game item = (Item_game) o;
                Toast.makeText(Inventaire.this,"Tu a sélectionné :"+" "+item.getName()+"\n("+item.getDescription()+")",Toast.LENGTH_LONG).show();
            }
        });
    }
}
