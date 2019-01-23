package com.example.samuel.pruebavideo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mivideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mivideo = (VideoView)findViewById(R.id.mivideo);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.output;
        Uri uri = Uri.parse(videoPath);
        mivideo.setVideoURI (uri);
        mivideo.start();

        mivideo.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }
}
