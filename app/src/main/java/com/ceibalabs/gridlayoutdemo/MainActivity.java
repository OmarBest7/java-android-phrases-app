package com.ceibalabs.gridlayoutdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTapped(View view){
        int id = view.getId();
        Log.i("button tapped", Integer.toString(id));
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);
        Log.i("button tapped", ourId);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.ceibalabs.gridlayoutdemo");

        //MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.yourfilename);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();
    }
}
