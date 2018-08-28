package com.example.noteau.talesofsymphonia;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Social extends AppCompatActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.social);

    // Get ListView object from xml
    listView = (ListView) findViewById(R.id.list_ally);


    List<Allier> list = new ArrayList<Allier>();
    list.add(new Allier("Kaluigan",0,"Puissant mage de Symphonia"));
    list.add(new Allier("Shanna",0,"Puissante apprentie mage de feu de Symphonia"));
    list.add(new Allier("Kuroplasma",0,"Guerrier demi-démon"));
    list.add(new Allier("Doko",0,"Demi-dragon pret à tout pour ses amis"));
    list.add(new Allier("Flore",0,"Vampire qui se joue des mortels"));
    list.add(new Allier("Sven",0,"Pretre nain qui défend la lumiére et les justes"));
    list.add(new Allier("Learya",0,"Pretresse humaine qui protege les ames perdus"));
    // Defined Array values to show in ListView
    String[] values = new String[] { "Kaluigan",
            "Shanna",
            "Kuroplasma",
            "Doko",
            "Flore",
            "Sven",
            "Learya"
    };

    // Define a new Adapter
    // First parameter - Context
    // Second parameter - Layout for the row
    // Third parameter - ID of the TextView to which the data is written
    // Forth - the Array of data

    ArrayAdapter<Allier> adapter = new ArrayAdapter<Allier>(this,
            android.R.layout.simple_list_item_1, android.R.id.text1, list);

    // Assign adapter to ListView
            listView.setAdapter(adapter);

    // ListView Item Click Listener
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view,
        int position, long id) {

            // ListView Clicked item index
            int itemPosition     = position;

            // ListView Clicked item value
            String  itemValue    = (String) listView.getItemAtPosition(position);

            // Show Alert
            Toast.makeText(getApplicationContext(),
                    "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                    .show();

        }

    });
}

}