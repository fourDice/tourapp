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

public class ParksFragment extends Fragment{

    public ParksFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.word_list, container, false );

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add( new Word( R.string.park_one, R.string.park_details_one, R.drawable.lindley ) );
        words.add( new Word( R.string.park_two, R.string.park_details_two, R.drawable.story_mansion ) );
        words.add( new Word( R.string.park_three, R.string.park_details_three, R.drawable.southside_park ) );
        words.add( new Word( R.string.park_four, R.string.park_details_four, R.drawable.bogert ) );
        words.add( new Word( R.string.park_five, R.string.park_details_five, R.drawable.gallatin_regional_park ) );

        Adapter adapter = new Adapter( getActivity(), words, R.color.category_parks );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter(adapter);

        return rootView;
    }
}