package com.udacity.gradle.builditbigger;

/**
 * Created by ADMIN on 2/7/2018.
 */

import android.test.AndroidTestCase;


public class NonEmptyTest extends AndroidTestCase {

    public void test() {

        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
            assertNotNull(result);
            assertTrue(result.length()>0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
