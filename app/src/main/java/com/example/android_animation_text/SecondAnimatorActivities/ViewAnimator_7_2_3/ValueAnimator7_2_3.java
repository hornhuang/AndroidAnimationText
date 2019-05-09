package com.example.android_animation_text.SecondAnimatorActivities.ViewAnimator_7_2_3;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewAnimator;

import com.example.android_animation_text.R;
import com.example.android_animation_text.utils.MyLog;

public class ValueAnimator7_2_3 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animator);

        imageView = findViewById(R.id.image_view);
        imageView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_view:
                setValueAnimator();
                break;
        }
    }

    private void setValueAnimator(){
        ValueAnimator animator = ValueAnimator.ofFloat(0, 100);
        animator.setTarget(imageView);// Target 目标
        animator.setDuration(3000).start();
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Float cur = (Float) animation.getAnimatedValue();
                float curV = cur;
                int curValue = (int) curV * 5;
                imageView.layout(curValue,curValue,curValue+imageView.getWidth(),curValue+imageView.getHeight());
            }
        });
    }
}
