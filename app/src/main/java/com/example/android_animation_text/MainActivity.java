package com.example.android_animation_text;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_1;
import com.example.android_animation_text.activies.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = findViewById(R.id.animation_7_1_1);
        button01.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.animation_7_1_1:
                startActivity(new Intent(MainActivity.this, Animation_7_1_1.class));
        }
    }
}
