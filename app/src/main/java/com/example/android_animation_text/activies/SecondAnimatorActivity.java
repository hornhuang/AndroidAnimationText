package com.example.android_animation_text.activies;

import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_2;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_3;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_4;
import com.example.android_animation_text.Animationactivities.activities.Animation_7_1_5;
import com.example.android_animation_text.R;
import com.example.android_animation_text.SecondAnimatorActivities.ObjectAnimator_7_2_1.ObjectAnimator_7_2_1;
import com.example.android_animation_text.SecondAnimatorActivities.PropertyValuesHolder_7_2_2Activity;

public class SecondAnimatorActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_animator);

        Button button01 = findViewById(R.id.animation_7_1_1);
        button01.setOnClickListener(this);

        Button button02 = findViewById(R.id.animation_7_1_2);
        button02.setOnClickListener(this);

//        Button button03 = findViewById(R.id.animation_7_1_3);
//        button03.setOnClickListener(this);
//
//        Button button04 = findViewById(R.id.animation_7_1_4);
//        button04.setOnClickListener(this);
//
//        Button button05 = findViewById(R.id.animation_7_1_5);
//        button05.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.animation_7_1_1:
                startActivity(new Intent(SecondAnimatorActivity.this, ObjectAnimator_7_2_1.class));
                break;

            case R.id.animation_7_1_2:
                startActivity(new Intent(SecondAnimatorActivity.this, PropertyValuesHolder_7_2_2Activity.class));
                break;

            case R.id.animation_7_1_3:
                startActivity(new Intent(SecondAnimatorActivity.this, Animation_7_1_3.class));
                break;

            case R.id.animation_7_1_4:
                startActivity(new Intent(SecondAnimatorActivity.this, Animation_7_1_4.class));
                break;

            case R.id.animation_7_1_5:
                startActivity(new Intent(SecondAnimatorActivity.this, Animation_7_1_5.class));
                break;

        }
    }
}
