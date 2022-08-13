package com.example.clackity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        key=0;
        isKeyPress1=true;
        rand=new Random();
        clickSound=MediaPlayer.create(MainActivity.this, R.raw.keypress1);
        clickSound2=MediaPlayer.create(MainActivity.this, R.raw.keypress2);
        btnClick=findViewById(R.id.btnClick);
        txtC=findViewById(R.id.txtC);
        txtL=findViewById(R.id.txtL);
        txtA=findViewById(R.id.txtA);
        txtC2=findViewById(R.id.txtC2);
        txtK=findViewById(R.id.txtK);
        txtI=findViewById(R.id.txtI);
        txtT=findViewById(R.id.txtT);
        txtY=findViewById(R.id.txtY);
        clickCount=0;
        btnClick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                key=rand.nextInt(2);
                if (key==0) {
                    Log.i("yo", "bjusdown rollie avalance");
                    //clickSound2.stop();
                    clickSound.start();
                }
                else
                {
                    Log.i("yo", "ric");
                    //clickSound.stop();
                    clickSound2.start();
                }
                clickCount++;
                if (clickCount == 50) {
                    txtC.setTextColor(Color.parseColor("#FF0000"));
                }
                else if (clickCount == 100) {
                    txtL.setTextColor(Color.parseColor("#FFA500"));
                }
                else if (clickCount == 150) {
                    txtA.setTextColor(Color.parseColor("#FFFF00"));
                }
                else if (clickCount == 200) {
                    txtC2.setTextColor(Color.parseColor("#00FF00"));
                }
                else if (clickCount == 300) {
                    txtK.setTextColor(Color.parseColor("#0000FF"));
                }
                else if (clickCount == 350) {
                    txtI.setTextColor(Color.parseColor("#4b0082"));
                }
                else if (clickCount == 400) {
                    txtT.setTextColor(Color.parseColor("#0000FF"));
                }
                else if (clickCount == 450) {
                    txtY.setTextColor(Color.parseColor("#8F00FF"));
                }
            }
        });
    }

    public Button btnClick;
    public TextView txtC;
    public TextView txtL;
    public TextView txtA;
    public TextView txtC2;
    public TextView txtK;
    public TextView txtI;
    public TextView txtT;
    public TextView txtY;
    protected MediaPlayer clickSound;
    protected MediaPlayer clickSound2;
    private Random rand;
    private int clickCount;
    private boolean isKeyPress1;
    private int key;
}