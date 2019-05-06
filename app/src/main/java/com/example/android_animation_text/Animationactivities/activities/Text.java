package com.example.android_animation_text.Animationactivities.activities;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ViewAnimator;

public class Text extends View {

    public Text(Context context) {
        super(context);
    }

    public Text(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Text(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        ValueAnimator animator = ValueAnimator.ofFloat();
        animator.setTarget(context);
        animator.setDuration(1000).start();
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Float value = (Float) animation.getAnimatedValue();
            }
        });
    }



}
