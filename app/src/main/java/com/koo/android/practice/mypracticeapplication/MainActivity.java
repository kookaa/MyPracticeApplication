package com.koo.android.practice.mypracticeapplication;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        LinearLayout relativeLayout = (LinearLayout) findViewById(R.id.layout_lyrics);

        String[] lyricsArray = getResources().getStringArray(R.array.lyrics);

        for (int i = 0; i < lyricsArray.length; i++) {
            TextView lyricsView = new TextView(this);
            lyricsView.setText(lyricsArray[i]);
            relativeLayout.addView(lyricsView);
        }
    }
}
