package com.udacity.gradle.builditbigger;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidlib.DisplayActivity;

import static com.udacity.gradle.builditbigger.MainActivity.idlingResource;

public class MainActivityFragment extends Fragment implements EndpointsAsyncTask.returnListener {
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button button =  root.findViewById(R.id.tell_joke);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (idlingResource != null) {
                idlingResource.setIdleState(true);
            }
                new EndpointsAsyncTask(getActivity(),MainActivityFragment.this).execute(new Pair<Context, String>(getActivity(), ""));

            }
        });
        return root;

    }

    @Override
    public void onItemReturned(String result) {
        Intent intent = new Intent(getActivity(), DisplayActivity.class);
        intent.putExtra(DisplayActivity.JOKE_KEY, result);
        getActivity().startActivity(intent);

    }

}