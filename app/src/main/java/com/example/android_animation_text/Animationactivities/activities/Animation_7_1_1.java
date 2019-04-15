package com.example.android_animation_text.Animationactivities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import com.example.android_animation_text.R;

public class Animation_7_1_1 extends AppCompatActivity {

    private ImageView girlImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_7_1_1);

        girlImage = (ImageView)findViewById(R.id.image_view_girl);
        AlphaAnimation animation = new AlphaAnimation(0, 1);
        animation.setDuration(3000);
        girlImage.startAnimation(animation);
    }
}
