package com.example.android_animation_text.SecondAnimatorActivities.ObjectAnimator_7_2_1;

import android.view.View;

public class WrapperView {

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
