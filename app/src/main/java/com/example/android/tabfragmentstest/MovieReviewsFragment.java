package com.example.android.tabfragmentstest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MovieReviewsFragment extends Fragment {

    private static final String TAG = "MovieReviewsFragment";

    private Button btnTest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.movie_reviews_fragment, container, false);

        btnTest = (Button) view.findViewById(R.id.btnTEST3);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Movie Reviews Go Here", Toast.LENGTH_SHORT).show();
            }
        });

        return view;

    }
}
