package com.example.stackexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
         RelativeLayout rellay1 ,rellay2;
         Handler handler= new Handler();
         Runnable runnable = new Runnable() {
             @Override
             public void run() {
              rellay1.setVisibility(View.VISIBLE);
              rellay2.setVisibility(View.VISIBLE);
             }
         };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);
        rellay2 = (RelativeLayout) findViewById(R.id.relllay2);
        handler.postDelayed(runnable,2000 );

        findViewById(R.id.textCreateAccount).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SingupActivity.class));
            }
        });

    }
}