package com.example.noteau.talesofsymphonia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Ecran_accueil extends AppCompatActivity {
    private MediaPlayer mp;
    private ArrayList<Integer> playlist;
    private int i = 0;
    private Timer timer;

    public MediaPlayer getMp() {
        return mp;
    }

    public void setMp(MediaPlayer mp) {
        this.mp = mp;
    }

    public ArrayList<Integer> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Integer> playlist) {
        this.playlist = playlist;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_accueil);

        configmusic();
        configureCodexButton();
        configureCréditsButton();
        configureOptionsButton();
        configureNewGameButton();
        configureContinueButton();
        configureAideButton();
    }

    private void configmusic() {
        playlist = new ArrayList<>();
        playlist.add(R.raw.music1);
        playlist.add(R.raw.music2);
        playlist.add(R.raw.music3);
        playlist.add(R.raw.music4);
        playlist.add(R.raw.music5);
        mp = MediaPlayer.create(this,playlist.get(0));
        mp.start();
        timer = new Timer();
        if (playlist.size()>1) playNext();
    }

    private void playNext() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                mp.reset();
                mp = MediaPlayer.create(Ecran_accueil.this,playlist.get(++i));
                mp.start();
                if (playlist.size() > i+1) {
                    playNext();
                }
                else {
                    i = 0;
                    playNext();
                }
            }
        },mp.getDuration()+100);
    }

    public void onDestroy() {
        if (mp.isPlaying())
            mp.stop();
        timer.cancel();
        super.onDestroy();
    }
    private void configureNewGameButton(){
        Button new_game_bt = (Button) findViewById(R.id.new_game);
        new_game_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ecran_accueil.this, New_game.class));
            }
        });
    }

    private void configureContinueButton(){
        Button continue_game_bt = (Button) findViewById(R.id.continue_game);
        continue_game_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ecran_accueil.this, Continue_game.class));
            }
        });

    }
    private void configureAideButton(){
        Button aide_bt = (Button) findViewById(R.id.help);
        aide_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ecran_accueil.this, Help.class));
            }
        });
    }

    private void configureOptionsButton(){
        Button codex = (Button) findViewById(R.id.options);
        codex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ecran_accueil.this, option_game.class));
            }
        });
    }
    private void configureCréditsButton(){
        Button codex = (Button) findViewById(R.id.credits);
        codex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ecran_accueil.this, Credits.class));
            }
        });
    }

    private void configureCodexButton(){
        Button codex = (Button) findViewById(R.id.codex);
        codex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ecran_accueil.this, Codex.class));
            }
        });
    }
}
