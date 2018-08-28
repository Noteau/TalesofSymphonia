package com.example.noteau.talesofsymphonia;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

public class option_game extends AppCompatActivity  {
    SeekBar SeekBar_music;
    Ecran_accueil ecran_accueil= new Ecran_accueil();
    AudioManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        SeekBar_music=(SeekBar)findViewById(R.id.Seekbar_music);
        int maxVolume = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);

        SeekBar_music.setMax(maxVolume);
        SeekBar_music.setProgress(curVolume);
        Log.wtf("max:", String.valueOf(maxVolume));
        Log.wtf("cur:", String.valueOf(curVolume));
        SeekBar_music.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValue = progress;
                am.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        configureBackButton();
    }

    private void configureBackButton(){
        Button bt_back = (Button) findViewById(R.id.Option_back);
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
