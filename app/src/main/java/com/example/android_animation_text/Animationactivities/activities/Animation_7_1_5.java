package com.example.android_animation_text.Animationactivities.activities;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.example.android_animation_text.R;

public class Animation_7_1_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_7_1_5);

        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(4000);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
        alphaAnimation.setDuration(3500);
        animationSet.addAnimation(alphaAnimation);

        TranslateAnimation translateAnimation = new TranslateAnimation(0, 100, 0, 200);
        translateAnimation.setDuration(1000);
        animationSet.addAnimation(translateAnimation);

        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1,
                Animation.RELATIVE_TO_SELF, 0.5F,
                Animation.RELATIVE_TO_SELF, 0.5F);
        scaleAnimation.setDuration(2000);
        animationSet.addAnimation(scaleAnimation);

        RotateAnimation rotateAnimation = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5F,
                RotateAnimation.RELATIVE_TO_SELF, 0.5F);
        rotateAnimation.setDuration(4000);
        animationSet.addAnimation(rotateAnimation);

        ImageView imageView = findViewById(R.id.animation_7_1_5);
        imageView.startAnimation(animationSet);
    }
}
