package com.example.android.tourapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class LandmarksFragment extends Fragment{

    public LandmarksFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.word_list, container, false );

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word( R.string.landmark_one, R.string.landmark_details_one, R.drawable.motr_trex ) );
        words.add( new Word( R.string.landmark_two, R.string.landmark_details_two, R.drawable.east_gallatin_rec ) );
        words.add( new Word( R.string.landmark_three, R.string.landmark_details_three, R.drawable.gallatin_history_museum ) );
        words.add( new Word( R.string.landmark_four, R.string.landmark_details_four, R.drawable.emerson ) );
        words.add( new Word( R.string.landmark_five, R.string.landmark_details_five, R.drawable.bridger_bowl ) );

        Adapter adapter = new Adapter( getActivity(), words, R.color.category_landmarks );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter(adapter);

        return rootView;
    }
}
