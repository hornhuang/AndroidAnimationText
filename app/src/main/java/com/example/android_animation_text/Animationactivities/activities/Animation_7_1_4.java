package com.example.android_animation_text.Animationactivities.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import com.example.android_animation_text.R;

public class Animation_7_1_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_4_7_3);

        // 弥漫铺开
        ScaleAnimation scaleAnimation = new ScaleAnimation(0, 2, 0, 2);
        scaleAnimation.setDuration(3000);

        // 中心放大
        ScaleAnimation scaleAnimation1 = new ScaleAnimation(0, 1, 0, 1,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5F,
                ScaleAnimation.RELATIVE_TO_SELF, 0.5F);
        scaleAnimation1.setDuration(3000);

        ImageView girlImage = findViewById(R.id.girl_4_7_4);
        girlImage.setAnimation(scaleAnimation1);

    }
}
