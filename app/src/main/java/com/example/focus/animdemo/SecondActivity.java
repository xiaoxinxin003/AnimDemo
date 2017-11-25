package com.example.focus.animdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by focus on 17-11-25.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        overridePendingTransition(R.anim.magnify_fade_in, R.anim.magnify_fade_out);
    }


    public void onClick(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
