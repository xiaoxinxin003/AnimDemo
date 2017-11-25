package com.example.focus.animdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.magnify_fade_in, R.anim.magnify_fade_out);
    }

    public void onClick(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
