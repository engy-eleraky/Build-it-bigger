package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Pair;
import com.example.androidlib.DisplayActivity;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;
import java.io.IOException;

/**
 * Created by ADMIN on 1/23/2018.
 */

public class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static MyApi myApiJoke = null;
    private Context context;
    public EndpointsAsyncTask(Context context){
        this.context=context;
    }
    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if(myApiJoke == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/");
            myApiJoke = builder.build();
        }

        try {

            return myApiJoke.sayHi().execute().getData();
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override
    protected void onPostExecute(String result) {
        Intent intent = new Intent(context, DisplayActivity.class);
        intent.putExtra(DisplayActivity.JOKE_KEY, result);
        context.startActivity(intent);
    }
}
