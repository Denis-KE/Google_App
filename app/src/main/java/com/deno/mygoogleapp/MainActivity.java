package com.deno.mygoogleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button mBtnMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnMaps =findViewById(R.id.btnMaps);
        mBtnMaps =findViewById(R.id.btnMaps);

        mBtnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Move=new Intent(MainActivity.this,MapsActivity.class);
                startActivity(Move);
            }
        });
    }
}
