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

public class TrailsFragment extends Fragment{

    public TrailsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.word_list, container, false );

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word( R.string.trails_one, R.string.trails_details_one, R.drawable.mtrail ) );
        words.add( new Word( R.string.trails_two, R.string.trails_details_two, R.drawable.drinking_horse ) );
        words.add( new Word( R.string.trails_three, R.string.trails_details_three, R.drawable.gallagator ) );
        words.add( new Word( R.string.trails_four, R.string.trails_details_four, R.drawable.garnet_mountain_trail ) );
        words.add( new Word( R.string.trails_five, R.string.trails_details_five, R.drawable.sacagawea_peak ) );

        Adapter adapter = new Adapter( getActivity(), words, R.color.category_trails );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter(adapter);

        return rootView;
    }
}