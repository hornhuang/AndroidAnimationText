package com.example.android_animation_text.SecondAnimatorActivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewAnimator;

import com.example.android_animation_text.R;

public class ValueAnimator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        ImageView imageView = findViewById(R.id.image_view);
//        ValueAnimator animator = ValueAnimator.ofFloat();
    }
}
