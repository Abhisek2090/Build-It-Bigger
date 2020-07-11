package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private String joke;

    @Test
    public void testForJokes() throws Exception {
        //Make sure to deploy server locally before running tests
        EndpointsAsyncTask endPointAsyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.Callback() {
            @Override
            public void onCallbackResult(String result) {

            }
        });
        endPointAsyncTask.execute();
        try {
            Thread.sleep(10000);
            joke = endPointAsyncTask.get();
            assertNotNull("Joke fetched", joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}