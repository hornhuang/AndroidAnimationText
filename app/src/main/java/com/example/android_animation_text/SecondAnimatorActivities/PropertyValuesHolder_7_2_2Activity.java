package com.example.android_animation_text.SecondAnimatorActivities;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.android_animation_text.R;

public class PropertyValuesHolder_7_2_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_values_holder_7_2_2);

        ImageView imageView = findViewById(R.id.property_values_holder);
        PropertyValuesHolder pvh1 = PropertyValuesHolder.ofFloat("translationX", 300f);
        PropertyValuesHolder pvh2 = PropertyValuesHolder.ofFloat("scaleX", 1f, 0, 1f);
        PropertyValuesHolder pvh3 = PropertyValuesHolder.ofFloat("scaleX", 1f, 0, 1f);
        ObjectAnimator.ofPropertyValuesHolder(imageView, pvh1 ,pvh2, pvh3)
                .setDuration(1500).start();


    }
}
