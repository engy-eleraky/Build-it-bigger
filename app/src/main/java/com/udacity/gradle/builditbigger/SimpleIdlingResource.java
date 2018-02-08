package com.udacity.gradle.builditbigger;

/**
 * Created by ADMIN on 1/29/2018.
 */

import android.support.annotation.Nullable;
import android.support.test.espresso.IdlingResource;

public class SimpleIdlingResource implements IdlingResource {
    private boolean isIdle = false  ;
    @Nullable
    private volatile ResourceCallback mCallback;

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public boolean isIdleNow() {
        return isIdle;
    }

    @Override
    public void registerIdleTransitionCallback(ResourceCallback callback) {
        mCallback = callback ;

    }
    public void setIdleState(boolean isIdleNow) {
        isIdle =isIdleNow ;
        if (isIdleNow && mCallback != null) {
            mCallback.onTransitionToIdle();

        }
    }
}
