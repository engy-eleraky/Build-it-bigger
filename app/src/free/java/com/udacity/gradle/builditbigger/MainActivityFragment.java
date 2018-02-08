package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidlib.DisplayActivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements EndpointsAsyncTask.returnListener{

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button button =  root.findViewById(R.id.tell_joke);
        final AdView mAdView =  root.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        mAdView.loadAd(adRequest);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                new EndpointsAsyncTask(getActivity(),MainActivityFragment.this).execute(new Pair<Context, String>(getActivity(), ""));

            } });

        return root;
    }

    @Override
    public void onItemReturned(String result) {
        Intent intent = new Intent(getActivity(), DisplayActivity.class);
        intent.putExtra(DisplayActivity.JOKE_KEY, result);
        getActivity().startActivity(intent);
    }
}

