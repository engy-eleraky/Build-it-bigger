package com.udacity.gradle.builditbigger;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivityFragment extends Fragment {
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button button =  root.findViewById(R.id.tell_joke);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                new EndpointsAsyncTask(getActivity()).execute(new Pair<Context, String>(getActivity(), ""));

            }
        });
        return root;

    }

}