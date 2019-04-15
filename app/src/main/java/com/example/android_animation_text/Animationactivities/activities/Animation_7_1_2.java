package com.example.android_animation_text.Animationactivities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.android_animation_text.R;

/**
 * 旋转
 */
public class Animation_7_1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_7_1_2);

        // 基本旋转
        RotateAnimation rotateAnimation01 = new RotateAnimation(0, 360, 100, 100);
        rotateAnimation01.setDuration(3000);

        // 中心旋转
        RotateAnimation rotateAnimation02 = new RotateAnimation(0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5F,
                RotateAnimation.RELATIVE_TO_SELF, 0.5F);
        rotateAnimation02.setDuration(3000);

        ImageView girlImage = findViewById(R.id.image_view_girl);
        girlImage.startAnimation(rotateAnimation02);

    }
}
