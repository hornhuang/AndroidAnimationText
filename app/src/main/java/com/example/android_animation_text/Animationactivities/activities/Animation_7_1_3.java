package com.example.android_animation_text.Animationactivities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.example.android_animation_text.R;

public class Animation_7_1_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_7_1_3);

        TranslateAnimation translateAnimation = new TranslateAnimation(0, 200, 0, 300);
        translateAnimation.setDuration(3000);

        ImageView girlImage = findViewById(R.id.girl_7_1_3);
        girlImage.startAnimation(translateAnimation);

    }
}
