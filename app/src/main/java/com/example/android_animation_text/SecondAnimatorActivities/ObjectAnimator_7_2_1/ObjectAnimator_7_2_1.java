package com.example.android_animation_text.SecondAnimatorActivities.ObjectAnimator_7_2_1;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.android_animation_text.R;

public class ObjectAnimator_7_2_1 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator_7_2_1);

        imageView = findViewById(R.id.object_animator_image_view);

    }

    public void onClick_1(View view){
        imageView = findViewById(R.id.object_animator_image_view);
        WrapperView wrapperView = new WrapperView(imageView);
        ObjectAnimator.ofInt(wrapperView, "width", 300).setDuration(1500).start();


    }

    public void onClick_2(View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(
                imageView,
                "translationX",
                300);
        animator.setDuration(1300);
        animator.start();

    }

    private static class WrapperView {

        private View mTarget;

        public WrapperView(View mTarget){
            this.mTarget = mTarget;
        }

        public int getWidth(){
            return mTarget.getLayoutParams().width;
        }

        public void setWidth(int width){
            mTarget.getLayoutParams().width = width;
            mTarget.requestLayout();
        }

    }

}
